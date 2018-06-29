package com.mmgg.proxy.blog.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JdkProxyMachine implements InvocationHandler {

    private Object object;

    public JdkProxyMachine(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(object,args);
        System.out.println("我是jdkProxy,我来添加各种花样。。。");
        return result;
    }
}
