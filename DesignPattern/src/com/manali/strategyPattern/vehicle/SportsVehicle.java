package com.manali.strategyPattern.vehicle;

import com.manali.strategyPattern.strategy.DriveStrategy;

public class SportsVehicle extends Vehicle {
    public SportsVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
