package com.manali.factoryPattern.factoryMethodPattern;

import com.manali.factoryPattern.factoryMethodPattern.impl.CircleFactory;
import com.manali.factoryPattern.ShapeType;
import com.manali.factoryPattern.factoryMethodPattern.impl.SquareFactory;

public class ShapeFactoryMethod {

    static Shape getShapeInstance(ShapeType shapeType){
        Shape shape;
        /**
         * - whichever class needs a particular shape object, can invoke this factory method class
         * - In future if there is any change in creation logic of any particular shape, it will be changed
         * only at particular shape factory class, instead of multiple classes accross the project.
         * - solves bloating issue and single responsibility violation issue.
         * - Shape Factory class is responsible for its shape creation logic only. And selection logic we
         * have moved outside.
         */

        /**
         * - Still violates open closed principle - if any new shapes comes, we have the flexibility to
         * create new shape factory class which support open closed principle, but the place where we select
         * this factory still breaks this principle.
         */
        if(shapeType==ShapeType.CIRCLE){
            ShapeFactory circleFactory = new CircleFactory();
            shape = circleFactory.createShape();
        } else if(shapeType==ShapeType.SQUARE){
            ShapeFactory squareFactory = new SquareFactory();
            shape = squareFactory.createShape();
        } else {
            throw new IllegalArgumentException("Shape Type Not Found");
        }
        return shape;
    }
}
