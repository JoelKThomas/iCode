package com.design.cloudbilling.service;

import com.design.cloudbilling.exception.BillingException;
import com.design.cloudbilling.model.Customer;
import com.design.cloudbilling.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    // Method to create a new customer
    public Customer createCustomer(Customer customer) {
        if (customer.getName() == null || customer.getEmail() == null) {
            throw new BillingException("Customer name and email cannot be null");
        }

        try {
            return customerRepository.save(customer);
        } catch (DataIntegrityViolationException e) {
            throw new BillingException("Customer data violates database constraints: " + e.getMessage());
        }
    }

    public Optional<Customer> findById(Long id) {
        return customerRepository.findById(id);
    }

}
