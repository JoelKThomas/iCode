package com.design.paymentplatform.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * Represents a log entry for a payment transaction.
 */
@Entity
@Table(name = "payment_logs")
public class PaymentLog {
    @Id
    @GeneratedValue
    private Long id;

    private String transactionId;
    private String paymentMethod;
    private double amount;
    private String requestDetails;
    private String responseDetails;
    private LocalDateTime timestamp;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getRequestDetails() {
        return requestDetails;
    }

    public void setRequestDetails(String requestDetails) {
        this.requestDetails = requestDetails;
    }

    public String getResponseDetails() {
        return responseDetails;
    }

    public void setResponseDetails(String responseDetails) {
        this.responseDetails = responseDetails;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
