package com.mmgg.proxy.javaproxy;

import com.mmgg.proxy.common.CakeMachine;
import com.mmgg.proxy.common.ChocolateMachine;
import com.mmgg.proxy.common.FruitCakeMachine;

import java.lang.reflect.Proxy;

public class CakeShopJavaProxy {

    public static void main(String[] args) {
        /*FruitCakeMachine fruitCakeMachine = new FruitCakeMachine();
        FruitMachineGeneralProxy fruitMachineProxy = new FruitMachineGeneralProxy(fruitCakeMachine);
        fruitMachineProxy.makeCake();*/

        //水果蛋糕添加一些自定义材料
        CakeMachine fruitCakeMachin = new FruitCakeMachine();
        CustomHandler fruitCustomHandler = new CustomHandler(fruitCakeMachin);
        CakeMachine fruitCakeMachine = (CakeMachine) Proxy.newProxyInstance(fruitCakeMachin.getClass().getClassLoader(),
                fruitCakeMachin.getClass().getInterfaces(),fruitCustomHandler);

        fruitCakeMachine.makeCake();

        //巧克力蛋糕添加一些自定义额材料
        CakeMachine choloclateMachin = new ChocolateMachine();
        CustomHandler choloclatCustomHandler = new CustomHandler(choloclateMachin);
        CakeMachine choloclateCakeMachine = (CakeMachine) Proxy.newProxyInstance(choloclateMachin.getClass().getClassLoader(),
                choloclateMachin.getClass().getInterfaces(),choloclatCustomHandler);
        choloclateCakeMachine.makeCake();
    }
}
