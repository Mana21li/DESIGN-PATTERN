package com.manali.decoratorPattern.component.concreteComponent;

import com.manali.decoratorPattern.component.BasePizza;

public class FarmhousePizza implements BasePizza {
    @Override
    public double getCost() {
        return 300.0;
    }

    @Override
    public String getDescription() {
        return "Farmhouse Pizza ";
    }
}
