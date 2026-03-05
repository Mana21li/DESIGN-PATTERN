package com.manali.designPatterns.factoryPattern.factoryMethod.Service.impl;

import com.manali.designPatterns.factoryPattern.factoryMethod.Service.Burger;

public class PremiumBurger implements Burger {
    public void prepareBurger() {
        System.out.println("Premium Burger");
    }
}
