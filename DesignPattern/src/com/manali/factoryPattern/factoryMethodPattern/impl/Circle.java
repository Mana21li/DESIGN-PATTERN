package com.manali.factoryPattern.factoryMethodPattern.impl;

import com.manali.factoryPattern.factoryMethodPattern.Shape;

public class Circle implements Shape {
    @Override
    public void computeArea() {
        System.out.println("Circle compute area");
    }

    @Override
    public void draw() {
        System.out.println("Circle draw area");
    }
}
