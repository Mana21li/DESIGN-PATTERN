package com.manali.strategyPattern.vehicle;

import com.manali.strategyPattern.strategy.DriveStrategy;

public class GoodVehicle extends Vehicle {
    public GoodVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
