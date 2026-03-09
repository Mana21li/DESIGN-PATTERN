package com.manali.designpatterns.realLifeDesignPatterns.tomatoFoodDelivery.model;

public class DeliveryOrder extends Order {
    private String userAddress;

    public DeliveryOrder() {
        this.userAddress = "";
    }

    @Override
    public String getType() {
        return "Delivery";
    }

    public String getUserAddress() {
        return userAddress;
    }
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
}
