package com.design.paymentplatform.service.methods;

import com.design.paymentplatform.model.PaymentRequest;
import com.design.paymentplatform.model.PaymentResponse;
import com.design.paymentplatform.model.PaymentStatus;
import com.design.paymentplatform.model.PaymentMethodType;
import com.design.paymentplatform.service.PaymentMethod;
import org.springframework.stereotype.Component;

/**
 * Payment method implementation for credit card payments.
 */
@Component
public class CreditCardPayment implements PaymentMethod {
    @Override
    public PaymentResponse pay(PaymentRequest request) {
        if (request.getCreditCardDetails() == null) {
            return new PaymentResponse(request.getTransactionId(), PaymentStatus.FAILURE);
        }

        // Access credit card details
        String cardNumber = request.getCreditCardDetails().getCardNumber();
        String cardHolderName = request.getCreditCardDetails().getCardHolderName();
        String expiryDate = request.getCreditCardDetails().getExpiryDate();
        String cvv = request.getCreditCardDetails().getCvv();

        // Payment processing logic for credit card...
        System.out.println("Processing Credit Card payment for " + cardHolderName + "...");

        return new PaymentResponse(request.getTransactionId(), PaymentStatus.SUCCESS);
    }

    @Override
    public boolean supports(PaymentMethodType type) {
        return type == PaymentMethodType.CREDIT_CARD;
    }
}
