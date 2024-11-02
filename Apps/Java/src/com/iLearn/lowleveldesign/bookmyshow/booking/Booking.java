package com.iLearn.lowleveldesign.bookmyshow.booking;

import com.iLearn.lowleveldesign.bookmyshow.enums.BookingStatus;
import com.iLearn.lowleveldesign.bookmyshow.movie.Show;
import com.iLearn.lowleveldesign.bookmyshow.movie.ShowSeat;
import com.iLearn.lowleveldesign.bookmyshow.payment.Payment;

import java.util.Date;
import java.util.List;

public abstract class Booking {

    private String bookingId;
    private int seats;
    private Date createdOn;
    private BookingStatus bookingStatus;

    private Show show;
    private List<ShowSeat> showSeats;

    private Payment payment;

    public abstract boolean makePayment(Payment payment);
    public abstract boolean cancel();
    public abstract boolean assignSeats(List<ShowSeat> seats);
}
