package com.iLearn.lowleveldesign.bookmyshow.payment;


import com.iLearn.lowleveldesign.bookmyshow.enums.PaymentStatus;

import java.util.Date;

public class Payment {
    private double amount;
    private int transactionid;
    private PaymentStatus paymentStatus;
    private Date createdOn;
}
