package com.iLearn.lowleveldesign.parkinglot;

public abstract class Payment {
    public abstract PaymentInfo makePayment(ParkingTicket parkingTicket, PaymentType paymentType);
}
