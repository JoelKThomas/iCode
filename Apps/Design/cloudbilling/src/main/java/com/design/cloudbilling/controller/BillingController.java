package com.design.cloudbilling.controller;

import com.design.cloudbilling.dto.InvoiceDTO;
import com.design.cloudbilling.dto.SubscriptionDTO;
import com.design.cloudbilling.dto.CustomerDTO;
import com.design.cloudbilling.dto.SubscriptionRequest;
import com.design.cloudbilling.model.Invoice;
import com.design.cloudbilling.model.Subscription;
import com.design.cloudbilling.service.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/billing")
public class BillingController {

    @Autowired
    private BillingService billingService;

    // Endpoint to create a subscription for a customer
    @PostMapping("/customers/{customerId}/subscriptions")
    public ResponseEntity<SubscriptionDTO> createSubscription(
            @PathVariable Long customerId,
            @RequestBody SubscriptionRequest subscriptionRequest) {
        Subscription subscription = billingService.createSubscription(customerId, subscriptionRequest.getServicePlanId(),
                subscriptionRequest.getPricingModel());
        SubscriptionDTO subscriptionDTO = new SubscriptionDTO(
                subscription.getId(),
                subscription.getServiceName(),
                subscription.getPricingModel(),
                null // Set usages to null or fetch if needed
        );
        return ResponseEntity.ok(subscriptionDTO);
    }

    // Endpoint to generate an invoice for a subscription
    @PostMapping("/subscriptions/{subscriptionId}/invoices")
    public ResponseEntity<InvoiceDTO> generateInvoice(@PathVariable Long subscriptionId) {
        Invoice invoice = billingService.generateInvoice(subscriptionId);
        InvoiceDTO invoiceDTO = new InvoiceDTO(
                invoice.getId(),
                invoice.getIssueDate(),
                invoice.getTotalAmount(),
                invoice.getCustomer().getId(), // Assuming customer ID is needed
                null // Set invoice items to null or fetch if needed
        );
        return ResponseEntity.ok(invoiceDTO);
    }

    // Endpoint to fetch all invoices for a specific customer
    @GetMapping("/customers/{customerId}/invoices")
    public ResponseEntity<List<InvoiceDTO>> fetchCustomerInvoices(@PathVariable Long customerId) {
        List<Invoice> invoices = billingService.getInvoicesForCustomer(customerId);
        List<InvoiceDTO> invoiceDTOs = invoices.stream()
                .map(invoice -> new InvoiceDTO(
                        invoice.getId(),
                        invoice.getIssueDate(),
                        invoice.getTotalAmount(),
                        invoice.getCustomer().getId(),
                        null // Set invoice items to null or fetch if needed
                ))
                .collect(Collectors.toList());
        return ResponseEntity.ok(invoiceDTOs);
    }

    // Endpoint to fetch all subscriptions for a specific customer
    @GetMapping("/customers/{customerId}/subscriptions")
    public ResponseEntity<List<SubscriptionDTO>> fetchCustomerSubscriptions(@PathVariable Long customerId) {
        List<SubscriptionDTO> subscriptions = billingService.getSubscriptionsForCustomer(customerId);
        return ResponseEntity.ok(subscriptions);
    }

}
