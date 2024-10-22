package com.design.paymentplatform.service.methods;

import com.design.paymentplatform.model.PaymentRequest;
import com.design.paymentplatform.model.PaymentResponse;
import com.design.paymentplatform.model.PaymentStatus;
import com.design.paymentplatform.model.PaymentMethodType;
import com.design.paymentplatform.service.PaymentMethod;
import org.springframework.stereotype.Component;

/**
 * Payment method implementation for wallet payments.
 */
@Component
public class WalletPayment implements PaymentMethod {
    @Override
    public PaymentResponse pay(PaymentRequest request) {
        System.out.println("Processing Wallet payment...");
        return new PaymentResponse(request.getTransactionId(), PaymentStatus.SUCCESS);
    }

    @Override
    public boolean supports(PaymentMethodType type) {
        return type == PaymentMethodType.WALLET;
    }
}
