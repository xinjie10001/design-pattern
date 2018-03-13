package com.mmgg.factory.practice;

/**
 * @author king on 2018/3/13.
 */
public class CarFactory {

    public Car getCreateCar(String carType){
        if(null == carType){
            return null;
        }
        if(carType.equalsIgnoreCase("Benz")){
            return new Benz();
        }
        if(carType.equalsIgnoreCase("BMW")){
            return new BMW();
        }
        if(carType.equalsIgnoreCase("Ferrari")){
            return new Ferrari();
        }
        return null;
    }
}
