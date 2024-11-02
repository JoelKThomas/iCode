package com.iLearn.lowleveldesign.parkinglot;

import java.util.List;

public abstract class ParkingLot {

    List<ParkingFloor> parkingFloors;
    List<Entrances> entrances;
    List<Exit> exits;

    Address address;
    String parkingLotName;

    public abstract boolean isParkingSpaceAvailableForVehicle(Vehicle vehicle);
    public abstract boolean updateParkingAttndent(ParkingAttendant  parkingAttendant, int gateId);

}
