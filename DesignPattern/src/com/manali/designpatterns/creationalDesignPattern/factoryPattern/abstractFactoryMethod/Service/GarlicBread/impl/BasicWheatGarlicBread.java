package com.manali.designpatterns.creationalDesignPattern.factoryPattern.abstractFactoryMethod.Service.GarlicBread.impl;

import com.manali.designpatterns.creationalDesignPattern.factoryPattern.abstractFactoryMethod.Service.GarlicBread.GarlicBread;

public class BasicWheatGarlicBread implements GarlicBread {
    @Override
    public void prepare() {
        System.out.println("Basic Wheat Garlic Bread");
    }
}
