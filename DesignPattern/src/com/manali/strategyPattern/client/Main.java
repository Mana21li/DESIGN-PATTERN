package com.manali.strategyPattern.client;

import com.manali.strategyPattern.strategy.NormalDrive;
import com.manali.strategyPattern.strategy.SportsDrive;
import com.manali.strategyPattern.vehicle.GoodVehicle;
import com.manali.strategyPattern.vehicle.SportsVehicle;
import com.manali.strategyPattern.vehicle.Vehicle;

//client Code --> context (has a)--> strategy(interface)
public class Main {
    public static void main(String[] args) {
        System.out.println("##### Strategy Design Pattern! #####");
        System.out.println("##### Vehicle Drive Modes! #####");

        Vehicle vehicle = new SportsVehicle(new SportsDrive());
        vehicle.drive();

        vehicle = new GoodVehicle(new NormalDrive());
        vehicle.drive();
    }
}