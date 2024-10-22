package com.design.paymentplatform.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Model representing a payment request.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentRequest {
    private String transactionId;
    private PaymentMethodType paymentMethod;
    private double amount;
    private CreditCardDetails creditCardDetails; // For Credit Card payments
    private UpiDetails upiDetails; // For UPI payments
    private WalletDetails walletDetails; // For Wallet payments
}
