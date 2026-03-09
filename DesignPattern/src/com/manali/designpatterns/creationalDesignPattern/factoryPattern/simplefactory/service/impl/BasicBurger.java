package com.manali.designpatterns.creationalDesignPattern.factoryPattern.simplefactory.service.impl;

import com.manali.designpatterns.creationalDesignPattern.factoryPattern.simplefactory.service.Burger;

public class BasicBurger implements Burger {
    @Override
    public void prepareBurger() {
        System.out.println("Basic Burger");
    }
}
