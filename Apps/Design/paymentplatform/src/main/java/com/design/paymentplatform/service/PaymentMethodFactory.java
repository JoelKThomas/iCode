package com.design.paymentplatform.factory;

import com.design.paymentplatform.model.PaymentMethodType;
import com.design.paymentplatform.service.PaymentMethod;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Factory for creating payment method instances.
 */
@Component
public class PaymentMethodFactory {

    private final List<PaymentMethod> paymentMethods;

    public PaymentMethodFactory(List<PaymentMethod> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    /**
     * Gets the payment method implementation based on the type.
     *
     * @param type The payment method type.
     * @return The corresponding payment method.
     */
    public PaymentMethod getPaymentMethod(PaymentMethodType type) {
        return paymentMethods.stream()
                .filter(method -> method.supports(type))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Invalid Payment Method"));
    }
}
