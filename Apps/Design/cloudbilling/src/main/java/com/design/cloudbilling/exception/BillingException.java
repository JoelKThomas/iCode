package com.design.cloudbilling.exception;

public class BillingException extends RuntimeException {
    public BillingException(String message) {
        super(message);
    }

    public BillingException(String message, Throwable cause) {
        super(message, cause);
    }
}
