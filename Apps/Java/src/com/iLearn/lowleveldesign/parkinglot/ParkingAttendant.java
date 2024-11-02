package com.iLearn.lowleveldesign.parkinglot;

public abstract class ParkingAttendant extends Account {
    Payment paymentService;

    public abstract boolean processVehicleEntry(Vehicle vehicle);
    public abstract PaymentInfo processPayment(ParkingTicket parkingTicket, PaymentType type);

}
