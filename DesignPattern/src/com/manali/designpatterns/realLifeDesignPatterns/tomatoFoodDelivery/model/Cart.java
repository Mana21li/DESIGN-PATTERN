package com.manali.designpatterns.realLifeDesignPatterns.tomatoFoodDelivery.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    Restaurant restaurant;
    List<MenuItem> items;

    Cart() {
        restaurant = null;
        items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        if (restaurant == null) {
            System.err.println("cart: Set a restaurant before adding items.");
            return;
        }
        items.add(item);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (MenuItem item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    boolean isEmpty() {
        return restaurant == null ||  items.isEmpty();
    }

    public void clear() {
        items.clear();
        restaurant = null;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public List<MenuItem> getItems() {
        return items;
    }

}
