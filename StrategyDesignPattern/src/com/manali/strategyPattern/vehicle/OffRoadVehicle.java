package com.manali.strategyPattern.vehicle;

import com.manali.strategyPattern.strategy.DriveStrategy;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
