package com.mmgg.factory.example.reflexfactory;


/**
 *
 * 反射
 * @author king on 2018/3/13.
 */
public class StaticNodeFactory {

    public static <T extends Shape> T createShape(Class<T> clz) {
        T result = null;
        try {
            result = (T) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
