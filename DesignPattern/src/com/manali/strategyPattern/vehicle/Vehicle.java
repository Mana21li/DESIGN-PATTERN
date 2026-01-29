package com.manali.strategyPattern.vehicle;

import com.manali.strategyPattern.strategy.DriveStrategy;

//context class: holds a reference to a strategy object
public class Vehicle {
    DriveStrategy driveStrategy;

    //constructor injection
    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        System.out.println("\n" + this.getClass().getSimpleName() + ": Driving ...");
        driveStrategy.drive();
    }
}
