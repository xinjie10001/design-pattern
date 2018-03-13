package com.mmgg.factory.example.staticfactory;

/**
 * @author king on 2018/3/13.
 */
public class ShapeFactory {

    /**
     * 使用 getShape 方法获取形状类型的对象
     */
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("square")){
            return new Square();
        }
        if(shapeType.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }
        if(shapeType.equalsIgnoreCase("circle")){
            return new Circle();
        }
        return null;
    }
}
