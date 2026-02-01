package com.manali.decoratorPattern.decorator;

import com.manali.decoratorPattern.component.BasePizza;

public class MushroomTopping extends ToppingDecorator {

    public MushroomTopping(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return pizza.getCost()+30.0;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "Mushroom";
    }
}
