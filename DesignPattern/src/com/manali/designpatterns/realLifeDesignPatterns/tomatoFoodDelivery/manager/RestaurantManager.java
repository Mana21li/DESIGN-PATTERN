package com.manali.designpatterns.realLifeDesignPatterns.tomatoFoodDelivery.manager;

import com.manali.designpatterns.creationalDesignPattern.SingletonPattern.Singleton;
import com.manali.designpatterns.realLifeDesignPatterns.tomatoFoodDelivery.model.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class RestaurantManager {
    private List<Restaurant> restaurants = new ArrayList<>();

    private static class Holder {
        private static final RestaurantManager INSTANCE = new RestaurantManager();
    }

    private RestaurantManager(){
    }

    public static RestaurantManager getInstance(){
        return Holder.INSTANCE;
    }

    public void addRestaurant(Restaurant restaurant) {
        restaurants.add(restaurant);
    }

    public List<Restaurant> getRestaurantsByAddress(String address) {
        List<Restaurant> result = new ArrayList<>();
        for (Restaurant restaurant : restaurants) {
            if (restaurant.getAddress().equalsIgnoreCase(address)) {
                result.add(restaurant);
            }
        }
        return result;
    }



}
