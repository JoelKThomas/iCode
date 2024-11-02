package com.iLearn.lowleveldesign.bookmyshow.user;

import com.iLearn.lowleveldesign.bookmyshow.booking.Booking;

public abstract class FrontDeskOfficer extends Person {
    public abstract boolean createBooking(Booking booking);

}
