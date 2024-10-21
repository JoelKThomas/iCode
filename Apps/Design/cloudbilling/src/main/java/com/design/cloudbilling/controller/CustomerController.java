package com.design.cloudbilling.controller;

import com.design.cloudbilling.dto.CustomerDTO;
import com.design.cloudbilling.dto.SubscriptionDTO; // Import SubscriptionDTO
import com.design.cloudbilling.exception.BillingException;
import com.design.cloudbilling.model.Customer;
import com.design.cloudbilling.model.Subscription; // Import Subscription
import com.design.cloudbilling.service.CustomerService;
import com.design.cloudbilling.service.BillingService; // Import BillingService
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private BillingService billingService; // Inject BillingService

    // Endpoint to create a new customer
    @PostMapping("/customers")
    public ResponseEntity<CustomerDTO> createCustomer(@RequestBody Customer customer) {
        Customer createdCustomer = customerService.createCustomer(customer);
        CustomerDTO customerDTO = new CustomerDTO(
                createdCustomer.getId(),
                createdCustomer.getName(),
                createdCustomer.getEmail(),
                null // Set subscriptions to null or fetch if needed
        );
        return ResponseEntity.ok(customerDTO);
    }

    @GetMapping("/customer/{id}")
    public ResponseEntity<CustomerDTO> getCustomer(@PathVariable Long id) {
        Customer customer = customerService.findById(id)
                .orElseThrow(() -> new BillingException("Customer not found"));

        // Fetch subscriptions for the customer
        List<SubscriptionDTO> subscriptionDTOs = billingService.getSubscriptionsForCustomer(customer.getId());

        CustomerDTO customerDTO = new CustomerDTO(
                customer.getId(),
                customer.getName(),
                customer.getEmail(),
                subscriptionDTOs // Set subscriptions to fetched subscriptionDTOs
        );
        return ResponseEntity.ok(customerDTO);
    }
}
