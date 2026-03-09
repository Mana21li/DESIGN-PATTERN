package com.manali.designpatterns.realLifeDesignPatterns.tomatoFoodDelivery;

import com.manali.designpatterns.realLifeDesignPatterns.tomatoFoodDelivery.model.Order;
import com.manali.designpatterns.realLifeDesignPatterns.tomatoFoodDelivery.model.Restaurant;
import com.manali.designpatterns.realLifeDesignPatterns.tomatoFoodDelivery.model.User;
import com.manali.designpatterns.realLifeDesignPatterns.tomatoFoodDelivery.strategy.impl.UPIPaymentStrategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TomatoApp  tomatoApp = new TomatoApp();

        User user = new User(101, "Aditya", "Delhi");
        System.out.println("User: " + user.getName() + " is active.");

        List<Restaurant> restaurants = tomatoApp.searchRestaurant("Delhi");

        if(restaurants.isEmpty()){
            System.out.println("Restaurant not found.");
            return;
        }

        System.out.println("Restaurants found:");
        for (Restaurant restaurant : restaurants) {
            System.out.println(" - " + restaurant.getName());
        }

        tomatoApp.selectRestaurant(user, restaurants.get(0));
        System.out.println("Restaurant selected : " + restaurants.get(0).getName());

        tomatoApp.addToCart(user, "M1");
        tomatoApp.addToCart(user, "M2");

        tomatoApp.printUserCart(user);

        Order order = tomatoApp.checkoutNow(user, "Delivery", new UPIPaymentStrategy("9876543210"));
        tomatoApp.payForOrder(user, order);

    }
}
