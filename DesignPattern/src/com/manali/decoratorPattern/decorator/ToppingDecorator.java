package com.manali.decoratorPattern.decorator;

import com.manali.decoratorPattern.component.BasePizza;

public abstract class ToppingDecorator implements BasePizza {
    BasePizza pizza;
    public ToppingDecorator(BasePizza pizza){
        this.pizza = pizza;
    }
}
