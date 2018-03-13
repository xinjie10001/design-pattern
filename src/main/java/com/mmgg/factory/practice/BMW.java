package com.mmgg.factory.practice;

/**
 * @author king on 2018/3/13.
 */
public class BMW implements Car {
    @Override
    public void create() {
        System.out.println("我在生产宝马...");
    }
}
