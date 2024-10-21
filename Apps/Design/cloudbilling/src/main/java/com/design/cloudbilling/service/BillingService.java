package com.design.cloudbilling.service;

import com.design.cloudbilling.dto.SubscriptionDTO;
import com.design.cloudbilling.dto.UsageDTO;
import com.design.cloudbilling.model.Customer;
import com.design.cloudbilling.model.Invoice;
import com.design.cloudbilling.model.Subscription;
import com.design.cloudbilling.model.Usage;
import com.design.cloudbilling.repository.CustomerRepository;
import com.design.cloudbilling.repository.InvoiceRepository;
import com.design.cloudbilling.repository.SubscriptionRepository;
import com.design.cloudbilling.repository.UsageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BillingService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private SubscriptionRepository subscriptionRepository;

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Autowired
    private UsageRepository usageRepository;

    public Subscription createSubscription(Long customerId, String servicePlanId, String pricingModel) {
        // Fetch customer by ID
        Customer customer = customerRepository.findById(customerId)
                .orElseThrow(() -> new RuntimeException("Customer not found"));

        // Create a new subscription
        Subscription subscription = new Subscription();
        subscription.setServiceName(servicePlanId); // Assuming servicePlanId is the service name

        // Set pricing model based on servicePlanId
        subscription.setPricingModel(pricingModel); // Set the appropriate pricing model

        subscription.setCustomer(customer);

        // Save the subscription
        return subscriptionRepository.save(subscription);
    }

    public Invoice generateInvoice(Long subscriptionId) {
        // Fetch subscription by ID
        Subscription subscription = subscriptionRepository.findById(subscriptionId)
                .orElseThrow(() -> new RuntimeException("Subscription not found"));

        // Calculate total amount based on usage
        double totalAmount = calculateTotalAmount(subscription);

        // Create a new invoice
        Invoice invoice = new Invoice();
        invoice.setIssueDate(LocalDate.now());
        invoice.setTotalAmount(totalAmount);
        invoice.setCustomer(subscription.getCustomer());

        // Save the invoice
        return invoiceRepository.save(invoice);
    }

    private double calculateTotalAmount(Subscription subscription) {
        List<Usage> usages = usageRepository.findBySubscription(subscription);
        return usages.stream().mapToDouble(Usage::getAmountUsed).sum();
    }

    public List<Invoice> getInvoicesForCustomer(Long customerId) {
        return invoiceRepository.findByCustomerId(customerId);
    }

    public List<SubscriptionDTO> getSubscriptionsForCustomer(Long customerId) {
        List<Subscription> subscriptions = subscriptionRepository.findByCustomerId(customerId);
        return subscriptions.stream()
                .map(subscription -> new SubscriptionDTO(
                        subscription.getId(),
                        subscription.getServiceName(),
                        subscription.getPricingModel(),
                        getUsagesForSubscription(subscription.getId())))
                .collect(Collectors.toList());
    }
    private List<UsageDTO> getUsagesForSubscription(Long subscriptionId) {
        List<Usage> usages = usageRepository.findBySubscriptionId(subscriptionId);
        return usages.stream()
                .map(usage -> new UsageDTO(
                        usage.getId(),
                        usage.getAmountUsed(),
                        usage.getUsageDate()))
                .collect(Collectors.toList());
    }

}
