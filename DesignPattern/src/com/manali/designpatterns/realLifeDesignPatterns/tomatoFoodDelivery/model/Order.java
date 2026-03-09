package com.manali.designpatterns.realLifeDesignPatterns.tomatoFoodDelivery.model;

import com.manali.designpatterns.realLifeDesignPatterns.tomatoFoodDelivery.strategy.PaymentStrategy;

import java.util.List;

public abstract class Order {
    private static int nextOrderId = 0;

    protected int orderId;
    protected Restaurant restaurant;
    protected List<MenuItem> items;
    protected User user;
    protected PaymentStrategy paymentStrategy;
    protected double totalPrice;
    protected String scheduled;


    Order() {
        this.orderId = nextOrderId++;
        this.user = null;
        this.restaurant = null;
        this.paymentStrategy = null;
        this.totalPrice = 0.0;
        this.scheduled = "";
    }

    public boolean processPayment() {
        if(paymentStrategy != null) {
            paymentStrategy.pay(totalPrice);
            return true;
        } else {
            System.out.println("Please choose a payment mode first");
            return false;
        }
    }

    public abstract String getType();

    public int getOrderId() {
        return orderId;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setItems(List<MenuItem> items) {
        this.items = items;
        totalPrice = 0.0;
        for (MenuItem item : items) {
            totalPrice += item.getPrice();
        }
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setScheduled(String scheduled) {
        this.scheduled = scheduled;
    }

    public String getScheduled() {
        return scheduled;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }


}
