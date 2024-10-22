package com.design.paymentplatform.observer;

import com.design.paymentplatform.model.PaymentEvent;

/**
 * Interface for payment observers.
 */
public interface PaymentObserver {
    void notify(PaymentEvent event);
}
