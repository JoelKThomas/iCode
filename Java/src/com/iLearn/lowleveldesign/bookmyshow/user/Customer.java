package com.iLearn.lowleveldesign.bookmyshow.user;

import com.iLearn.lowleveldesign.bookmyshow.booking.Booking;

import java.util.List;

public abstract class Customer extends Person {
    public abstract boolean makeBooking(Booking booking);

    public abstract List<Booking> getBookings();
}
