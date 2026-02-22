package com.manali.factoryPattern.simpleFactoryPattern;

import com.manali.factoryPattern.ShapeType;
import com.manali.factoryPattern.simpleFactoryPattern.impl.Circle;
import com.manali.factoryPattern.simpleFactoryPattern.impl.Square;

public class ShapeFactory {
    public static Shape createShape(ShapeType shapeType) {
        /**
         * violates open closed principle - if any shape is introduced then we have to touch this class
         * Factory class can become bloated : if one object creation logic is complex, then this class
         * becomes difficult to manage
         * Also it will violate Single responsibility principle : Factory does 2 things selection
         * and construction logic if it becomes complex
         */

        if(shapeType == ShapeType.CIRCLE) {
            return new Circle();
        } else if(shapeType == ShapeType.SQUARE) {
            return new Square();
        } else {
            return null;
        }
    }
}
