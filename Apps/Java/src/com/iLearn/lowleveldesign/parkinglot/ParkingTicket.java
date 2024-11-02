package com.iLearn.lowleveldesign.parkinglot;

import java.util.Date;

public abstract class ParkingTicket {
    int ticketId;
    int levelId;
    int spaceId;
    Date vehicleEntryDateTime;
    Date vehicleExitDateTime;
    ParkingSpaceType parkingSpaceType;
    double totalCost;
    ParkingTicketStatus parkingTicketStatus;

    public abstract void updateTotalCost();
    public abstract void updateVehicleExitTime(Date vehicleExitDateTime);

}
