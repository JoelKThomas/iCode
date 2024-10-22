package com.design.paymentplatform.observer;

import com.design.paymentplatform.model.PaymentEvent;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Notifier for managing payment observers.
 */
@Component
public class PaymentNotifier {

    private final List<PaymentObserver> observers = new ArrayList<>();

    public void registerObserver(PaymentObserver observer) {
        observers.add(observer);
    }

    /**
     * Notifies all registered observers about a payment event.
     *
     * @param event The payment event to notify.
     */
    public void notifyObservers(PaymentEvent event) {
        observers.forEach(observer -> observer.notify(event));
    }
}
