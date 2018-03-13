package com.mmgg.factory.example.staticfactory;

/**
 *
 * 长方形
 * @author king on 2018/3/13.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("我在画长方形...");
    }
}
