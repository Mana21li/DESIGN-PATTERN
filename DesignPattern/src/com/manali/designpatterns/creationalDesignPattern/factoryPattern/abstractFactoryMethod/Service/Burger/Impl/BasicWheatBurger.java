package com.manali.designpatterns.creationalDesignPattern.factoryPattern.abstractFactoryMethod.Service.Burger.Impl;

import com.manali.designpatterns.creationalDesignPattern.factoryPattern.abstractFactoryMethod.Service.Burger.Burger;

public class BasicWheatBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Basic Wheat Burger");
    }
}
