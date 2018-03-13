package com.mmgg.factory.example.mulwayfactory;


/**
 *
 * 反射
 * @author king on 2018/3/13.
 */
public class MulWayShapeFactory {

     public static Shape createCircle(){
         return new Circle();
     }

     public static Shape createRectangle(){
         return new Rectangle();
     }

     public static Shape createSquare(){
         return new Square();
     }
}
