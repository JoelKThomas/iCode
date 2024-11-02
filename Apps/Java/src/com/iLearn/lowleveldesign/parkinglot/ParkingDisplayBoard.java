package com.iLearn.lowleveldesign.parkinglot;

import java.util.Map;

public abstract class ParkingDisplayBoard {

    Map<ParkingSpaceType, Integer> freeSpotsAvailableMap;
    public abstract void updateFreeSpotsAvailable(ParkingSpaceType parkingSpaceType, int spaces);
}
