package com.design.cloudbilling.dto;

import java.time.LocalDate;
import java.util.List;

public class InvoiceDTO {
    private Long id;
    private LocalDate issueDate;
    private double totalAmount;
    private Long customerId; // Include customerId if needed
    private List<InvoiceItemDTO> invoiceItems; // If you want to include items

    // Constructors
    public InvoiceDTO() {}

    public InvoiceDTO(Long id, LocalDate issueDate, double totalAmount, Long customerId, List<InvoiceItemDTO> invoiceItems) {
        this.id = id;
        this.issueDate = issueDate;
        this.totalAmount = totalAmount;
        this.customerId = customerId;
        this.invoiceItems = invoiceItems;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public List<InvoiceItemDTO> getInvoiceItems() {
        return invoiceItems;
    }

    public void setInvoiceItems(List<InvoiceItemDTO> invoiceItems) {
        this.invoiceItems = invoiceItems;
    }
}
