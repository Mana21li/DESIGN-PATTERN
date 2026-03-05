package com.manali.designPatterns.factoryPattern.abstractFactoryMethod.Service.GarlicBread.impl;

import com.manali.designPatterns.factoryPattern.abstractFactoryMethod.Service.GarlicBread.GarlicBread;

public class CheeseWheatGarlicBread implements GarlicBread {
    @Override
    public void prepare() {
        System.out.println("Cheese Wheat Garlic Bread");
    }
}
