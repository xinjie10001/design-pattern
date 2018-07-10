package com.mmgg.proxy.jdkproxy;

import com.mmgg.proxy.commom.CakeMachine;
import com.mmgg.proxy.commom.FruitMachine;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.lang.reflect.Proxy;

public class JdkProxyTest {

    public static void main(String[] args) throws Exception {
        //水果蛋糕添加各种花样
        FruitMachine fruitMachine = new FruitMachine();
        JdkProxyMachine jdkProxyMachine = new JdkProxyMachine(fruitMachine);
        CakeMachine fruitMachineProxy = (CakeMachine) Proxy.newProxyInstance(fruitMachine.getClass().getClassLoader(),
                fruitMachine.getClass().getInterfaces(),jdkProxyMachine);
        fruitMachineProxy.MakeCake();


        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{FruitMachine.class});
        FileOutputStream os = new FileOutputStream("/Users/wangxinjie/IdeaProjects/$Proxy0.class");
        os.write(bytes);
        os.close();
    }
}
