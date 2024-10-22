package com.design.paymentplatform.observer;

import com.design.paymentplatform.model.PaymentEvent;
import org.springframework.stereotype.Component;

/**
 * Observer that records analytics for payment events.
 */
@Component
public class AnalyticsService implements PaymentObserver {
    @Override
    public void notify(PaymentEvent event) {
        System.out.println("Analytics recorded for transaction: " + event.getTransactionId());
    }
}
