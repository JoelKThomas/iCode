package com.design.paymentplatform.service;

import com.design.paymentplatform.model.PaymentRequest;
import com.design.paymentplatform.model.PaymentResponse;
import com.design.paymentplatform.model.PaymentMethodType;

/**
 * Strategy interface for payment methods.
 */
public interface PaymentMethod {
    PaymentResponse pay(PaymentRequest request);
    boolean supports(PaymentMethodType type);
}
