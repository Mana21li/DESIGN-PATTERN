package com.manali.strategyPattern.strategy;

public class SportsDrive implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Driving capability: Sports");
    }
}
