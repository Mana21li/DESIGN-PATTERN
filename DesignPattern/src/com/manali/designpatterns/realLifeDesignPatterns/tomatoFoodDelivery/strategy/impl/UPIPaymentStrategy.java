package com.manali.designpatterns.realLifeDesignPatterns.tomatoFoodDelivery.strategy.impl;

import com.manali.designpatterns.realLifeDesignPatterns.tomatoFoodDelivery.strategy.PaymentStrategy;

public class UPIPaymentStrategy implements PaymentStrategy {
    private String mobile;

    public UPIPaymentStrategy(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs: " + amount + " using UPI: " + mobile);
    }
}
