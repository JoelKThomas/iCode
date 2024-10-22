package com.design.paymentplatform.controller;

import com.design.paymentplatform.model.PaymentRequest;
import com.design.paymentplatform.model.PaymentResponse;
import com.design.paymentplatform.model.PaymentStatus;
import com.design.paymentplatform.service.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Controller for handling payment-related requests.
 */
@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    /**
     * Initiates a payment.
     *
     * @param request The payment request containing transaction details.
     * @return ResponseEntity with payment response or error.
     */
    @PostMapping("/initiate")
    public ResponseEntity<PaymentResponse> initiatePayment(@RequestBody PaymentRequest request) {
        try {
            // Validate the payment method
            if (request.getPaymentMethod() == null) {
                return ResponseEntity.badRequest()
                        .body(new PaymentResponse(request.getTransactionId(), PaymentStatus.FAILURE));
            }

            // Process the payment
            PaymentResponse response = paymentService.initiatePayment(request);
            return ResponseEntity.ok(response);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new PaymentResponse(request.getTransactionId(), PaymentStatus.FAILURE));
        }
    }
}
