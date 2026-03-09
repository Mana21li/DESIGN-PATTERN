package com.manali.designpatterns.realLifeDesignPatterns.tomatoFoodDelivery.strategy.impl;

import com.manali.designpatterns.realLifeDesignPatterns.tomatoFoodDelivery.strategy.PaymentStrategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {
    private String cardNumber;

    public  CreditCardPaymentStrategy(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs: " + amount + "using credit card: " +  cardNumber);
    }
}
