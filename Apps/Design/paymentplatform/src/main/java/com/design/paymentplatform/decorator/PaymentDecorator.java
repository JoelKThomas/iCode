package com.design.paymentplatform.decorator;

import com.design.paymentplatform.model.PaymentMethodType;
import com.design.paymentplatform.service.PaymentMethod;
import com.design.paymentplatform.model.PaymentRequest;
import com.design.paymentplatform.model.PaymentResponse;

/**
 * Abstract decorator class for payment methods.
 */
public abstract class PaymentDecorator implements PaymentMethod {
    protected PaymentMethod decoratedPayment;

    public PaymentDecorator(PaymentMethod decoratedPayment) {
        this.decoratedPayment = decoratedPayment;
    }

    @Override
    public PaymentResponse pay(PaymentRequest request) {
        return decoratedPayment.pay(request);
    }

    @Override
    public boolean supports(PaymentMethodType type) {
        return decoratedPayment.supports(type);
    }
}
