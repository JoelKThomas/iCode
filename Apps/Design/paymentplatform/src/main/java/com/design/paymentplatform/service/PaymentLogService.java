package com.design.paymentplatform.service;

import com.design.paymentplatform.model.PaymentRequest;
import com.design.paymentplatform.model.PaymentResponse;
import com.design.paymentplatform.model.PaymentEvent;
import com.design.paymentplatform.model.entity.PaymentLog;
import com.design.paymentplatform.observer.PaymentNotifier;
import com.design.paymentplatform.repository.PaymentLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * Service for logging payment details and notifying observers.
 */
@Service
public class PaymentLogService {

    private final PaymentLogRepository paymentLogRepository;
    private final PaymentNotifier notifier;

    @Autowired
    public PaymentLogService(PaymentLogRepository paymentLogRepository, PaymentNotifier notifier) {
        this.paymentLogRepository = paymentLogRepository;
        this.notifier = notifier;
    }

    /**
     * Save payment log and notify observers.
     *
     * @param request The payment request.
     * @param response The payment response.
     */
    public void savePaymentLogAndNotify(PaymentRequest request, PaymentResponse response) {
        // Create and save payment log
        PaymentLog log = new PaymentLog();
        log.setTransactionId(request.getTransactionId());
        log.setPaymentMethod(String.valueOf(request.getPaymentMethod()));
        log.setAmount(request.getAmount());
        log.setRequestDetails(request.toString());  // Implement a proper toString() method in PaymentRequest
        log.setResponseDetails(response.toString()); // Implement a proper toString() method in PaymentResponse
        log.setTimestamp(LocalDateTime.now());

        paymentLogRepository.save(log);  // Save log to the database

        // Notify observers about the payment event
        notifier.notifyObservers(new PaymentEvent(request.getTransactionId(), response.getStatus()));
    }
}
