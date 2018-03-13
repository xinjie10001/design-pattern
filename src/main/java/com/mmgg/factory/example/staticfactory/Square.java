package com.mmgg.factory.example.staticfactory;

/**
 *
 * 正方形
 * @author king on 2018/3/13.
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("我在画正方形...");
    }
}
