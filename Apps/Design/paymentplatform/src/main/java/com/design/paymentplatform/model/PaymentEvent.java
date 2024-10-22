package com.design.paymentplatform.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Model representing a payment event for observer notifications.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentEvent {
    private String transactionId;
    private PaymentStatus status;
}
