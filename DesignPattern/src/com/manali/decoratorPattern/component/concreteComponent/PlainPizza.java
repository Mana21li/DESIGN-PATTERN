package com.manali.decoratorPattern.component.concreteComponent;

import com.manali.decoratorPattern.component.BasePizza;

public class PlainPizza implements BasePizza {
    @Override
    public double getCost() {
        return 200.0;
    }

    @Override
    public String getDescription() {
        return "Plain Pizza ";
    }
}
