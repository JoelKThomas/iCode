package com.design.paymentplatform.service;

import com.design.paymentplatform.decorator.FeeDecorator;
import com.design.paymentplatform.model.PaymentRequest;
import com.design.paymentplatform.model.PaymentResponse;
import com.design.paymentplatform.model.entity.Payment;
import com.design.paymentplatform.repository.PaymentRepository;
import com.design.paymentplatform.factory.PaymentMethodFactory;
import com.design.paymentplatform.model.PaymentEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.CompletableFuture;

/**
 * Service layer for handling payment logic.
 */
@Service
public class PaymentService {

    private final PaymentMethodFactory factory;
    private final PaymentRepository paymentRepository;
    private final PaymentLogService paymentLogService;

    @Autowired
    public PaymentService(PaymentMethodFactory factory,
                          PaymentRepository paymentRepository,
                          PaymentLogService paymentLogService) {
        this.factory = factory;
        this.paymentRepository = paymentRepository;
        this.paymentLogService = paymentLogService;
    }

    /**
     * Initiates a payment using the specified payment method.
     *
     * @param request The payment request containing transaction details.
     * @return The payment response with status.
     */
    @Transactional
    public PaymentResponse initiatePayment(PaymentRequest request) {
        // Get payment method and process payment
        PaymentMethod method = factory.getPaymentMethod(request.getPaymentMethod());
        PaymentMethod decoratedMethod = new FeeDecorator(method);
        PaymentResponse response = decoratedMethod.pay(request);

        // Create and save payment record to the database
        Payment payment = new Payment();
        payment.setTransactionId(request.getTransactionId());
        payment.setPaymentMethod(String.valueOf(request.getPaymentMethod()));
        payment.setAmount(request.getAmount());
        payment.setStatus(String.valueOf(response.getStatus()));

        paymentRepository.save(payment);  // Save payment synchronously

        // Run logging and notifying observers in separate threads
        CompletableFuture.runAsync(() -> paymentLogService.savePaymentLogAndNotify(request, response));

        // Return the response immediately
        return response;
    }
}
