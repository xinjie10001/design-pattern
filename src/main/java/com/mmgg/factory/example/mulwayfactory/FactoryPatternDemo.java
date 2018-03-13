package com.mmgg.factory.example.mulwayfactory;

/**
 * @author king on 2018/3/13.
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        Shape circle = MulWayShapeFactory.createCircle();
        circle.draw();

        Shape rectangle = MulWayShapeFactory.createRectangle();
        rectangle.draw();

        Shape square = MulWayShapeFactory.createSquare();
        square.draw();
    }
}
