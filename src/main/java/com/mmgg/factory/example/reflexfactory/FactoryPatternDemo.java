package com.mmgg.factory.example.reflexfactory;

/**
 * @author king on 2018/3/13.
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        Shape circle = StaticNodeFactory.createShape(Circle.class);
        circle.draw();

        Shape rectangle = StaticNodeFactory.createShape(Rectangle.class);
        rectangle.draw();

        Shape square = StaticNodeFactory.createShape(Square.class);
        square.draw();
    }
}
