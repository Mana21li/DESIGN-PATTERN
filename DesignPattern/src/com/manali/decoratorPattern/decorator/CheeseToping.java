package com.manali.decoratorPattern.decorator;

import com.manali.decoratorPattern.component.BasePizza;

public class CheeseToping extends ToppingDecorator{
    public CheeseToping(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 20.0;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "Extra cheese";
    }
}
