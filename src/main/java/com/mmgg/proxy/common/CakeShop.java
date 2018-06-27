package com.mmgg.proxy.common;

public class CakeShop {

    public static void main(String[] args) {
        FruitCakeMachine fruitCakeMachine = new FruitCakeMachine();
        fruitCakeMachine.makeCake();

        ChocolateMachine chocolateMachine = new ChocolateMachine();
        chocolateMachine.makeCake();
    }
}
