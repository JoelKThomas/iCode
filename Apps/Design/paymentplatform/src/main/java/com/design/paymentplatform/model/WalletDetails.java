package com.design.paymentplatform.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Model representing details for a wallet payment.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WalletDetails {
    private String walletId;
}
