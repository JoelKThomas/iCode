package com.design.paymentplatform.observer;

import com.design.paymentplatform.model.PaymentEvent;
import org.springframework.stereotype.Component;

/**
 * Observer that sends email notifications for payment events.
 */
@Component
public class EmailNotificationService implements PaymentObserver {
    @Override
    public void notify(PaymentEvent event) {
        System.out.println("Email sent for transaction: " + event.getTransactionId());
    }
}
