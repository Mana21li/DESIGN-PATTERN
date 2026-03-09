package com.manali.designpatterns.realLifeDesignPatterns.tomatoFoodDelivery.model;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private static int nextRestaurantId = 0;
    private int restaurantId;
    private String name;
    private String address;
    private List<MenuItem> menu =  new ArrayList<>();

    public Restaurant(String name, String address) {
        this.restaurantId = ++nextRestaurantId;
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<MenuItem> getMenu() {
       return menu;
    }

    public void setMenu(MenuItem item) {
        menu.add(item);
    }
}
