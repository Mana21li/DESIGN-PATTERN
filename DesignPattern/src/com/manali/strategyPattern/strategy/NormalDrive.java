package com.manali.strategyPattern.strategy;

public class NormalDrive implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Driving capability: Normal");
    }
}
