package com.mmgg.proxy.javaproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class CustomHandler implements InvocationHandler {

    private Object object;

    public CustomHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(object,args);
        System.out.println("添加一些自定义材料");
        return result;
    }
}
