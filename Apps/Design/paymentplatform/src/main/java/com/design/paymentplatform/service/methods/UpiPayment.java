package com.design.paymentplatform.service.methods;

import com.design.paymentplatform.model.PaymentRequest;
import com.design.paymentplatform.model.PaymentResponse;
import com.design.paymentplatform.model.PaymentStatus;
import com.design.paymentplatform.model.PaymentMethodType;
import com.design.paymentplatform.service.PaymentMethod;
import org.springframework.stereotype.Component;

/**
 * Payment method implementation for UPI payments.
 */
@Component
public class UpiPayment implements PaymentMethod {
    @Override
    public PaymentResponse pay(PaymentRequest request) {
        if (request.getUpiDetails() == null) {
            return new PaymentResponse(request.getTransactionId(), PaymentStatus.FAILURE);
        }

        String upiId = request.getUpiDetails().getUpiId();

        // Payment processing logic for UPI...
        System.out.println("Processing UPI payment for " + upiId + "...");

        return new PaymentResponse(request.getTransactionId(), PaymentStatus.SUCCESS);
    }

    @Override
    public boolean supports(PaymentMethodType type) {
        return type == PaymentMethodType.UPI;
    }
}
