package com.iLearn.lowleveldesign.parkinglot;

public abstract class Exit extends Gate{
    public abstract ParkingTicket payForParking(ParkingTicket parkingTicket, PaymentType paymentType);
}
