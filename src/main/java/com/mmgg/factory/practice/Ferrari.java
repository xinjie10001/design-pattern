package com.mmgg.factory.practice;

/**
 * @author king on 2018/3/13.
 */
public class Ferrari implements Car {
    @Override
    public void create() {
        System.out.println("我在生产法拉利...");
    }
}
