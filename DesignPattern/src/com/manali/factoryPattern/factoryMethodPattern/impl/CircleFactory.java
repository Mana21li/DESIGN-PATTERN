package com.manali.factoryPattern.factoryMethodPattern.impl;

import com.manali.factoryPattern.factoryMethodPattern.Shape;
import com.manali.factoryPattern.factoryMethodPattern.ShapeFactory;

public class CircleFactory implements ShapeFactory {

    @Override
    public Shape createShape() {
        return new Circle();
    }
}
