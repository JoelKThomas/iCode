package com.design.paymentplatform.decorator;

import com.design.paymentplatform.service.PaymentMethod;
import com.design.paymentplatform.model.PaymentRequest;
import com.design.paymentplatform.model.PaymentResponse;

/**
 * Decorator that adds fees to the payment process.
 */
public class FeeDecorator extends PaymentDecorator {

    public FeeDecorator(PaymentMethod decoratedPayment) {
        super(decoratedPayment);
    }

    @Override
    public PaymentResponse pay(PaymentRequest request) {
        // Applying fees logic
        System.out.println("Applying fees...");
        return super.pay(request);
    }
}
