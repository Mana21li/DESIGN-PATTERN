package com.manali.designpatterns.creationalDesignPattern.factoryPattern.abstractFactoryMethod.Service.GarlicBread.impl;

import com.manali.designpatterns.creationalDesignPattern.factoryPattern.abstractFactoryMethod.Service.GarlicBread.GarlicBread;

public class BasicGarlicBread implements GarlicBread {
    @Override
    public void prepare() {
        System.out.println("Basic Garlic Bread");
    }
}
