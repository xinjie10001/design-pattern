package com.mmgg.factory.example.staticfactory;

/**
 * @author king on 2018/3/13.
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape square = factory.getShape("square");
        square.draw();

        Shape circle = factory.getShape("circle");
        circle.draw();

        Shape rectangle = factory.getShape("Rectangle");
        rectangle.draw();
    }
}
