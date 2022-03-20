package com.iLearn.lowleveldesign.parkinglot;

public abstract class Admin extends Account {
    public abstract boolean addParkingFloor(ParkingLot parkinglot, ParkingFloor parkingFloor);
    public abstract boolean addParkingSpace( ParkingFloor parkingFloor, ParkingSpace parkingSpace);
    public abstract boolean addParkingDisplayBoard( ParkingFloor parkingFloor, ParkingDisplayBoard parkingDisplayBoard);
}
