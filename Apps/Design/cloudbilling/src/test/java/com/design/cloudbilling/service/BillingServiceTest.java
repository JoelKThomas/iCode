package com.design.cloudbilling.service;

import com.design.cloudbilling.model.*;
import com.design.cloudbilling.repository.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class BillingServiceTest {

    @Autowired
    private BillingService billingService;

    @MockBean
    private SubscriptionRepository subscriptionRepository;

    @MockBean
    private InvoiceRepository invoiceRepository;

    @Test
    public void testGenerateInvoice() {
    }
}
