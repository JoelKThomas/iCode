package com.design.paymentplatform.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Model representing details for a UPI payment.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpiDetails {
    private String upiId;
}
