package com.mmgg.factory.practice;

/**
 * @author king on 2018/3/13.
 */
public class CarPatternDemo {

    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car benz = carFactory.getCreateCar("Benz");
        benz.create();

        Car bmw = carFactory.getCreateCar("BMW");
        bmw.create();

        Car ferrari = carFactory.getCreateCar("Ferrari");
        ferrari.create();
    }
}
