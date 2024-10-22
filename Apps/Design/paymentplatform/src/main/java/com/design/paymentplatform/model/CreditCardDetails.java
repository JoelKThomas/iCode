package com.design.paymentplatform.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Model representing details for a credit card payment.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreditCardDetails {
    private String cardNumber;
    private String cardHolderName;
    private String expiryDate; // Format: MM/YY
    private String cvv;
}
