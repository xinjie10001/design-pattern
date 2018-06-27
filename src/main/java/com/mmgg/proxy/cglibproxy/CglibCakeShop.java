package com.mmgg.proxy.cglibproxy;

import com.mmgg.proxy.common.ChocolateMachine;
import com.mmgg.proxy.common.FruitCakeMachine;
import org.springframework.cglib.proxy.Enhancer;

public class CglibCakeShop {

    public static void main(String[] args) {
        /*Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(FruitCakeMachine.class);
        enhancer.setCallback(new ApricotInterceptor());
        FruitCakeMachine fruitCakeMachine = (FruitCakeMachine) enhancer.create();
        fruitCakeMachine.makeCake();*/

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(ChocolateMachine.class);
        enhancer.setCallback(new ApricotInterceptor());
        ChocolateMachine chocolateMachine = (ChocolateMachine) enhancer.create();
        chocolateMachine.makeCake();

    }
}
