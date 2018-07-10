package com.mmgg.singleton.hungry;

public class Hungry {

    public Hungry() {
    }

    //先静态，后动态
    //先属性，后方法
    //先上后下

    private static final Hungry hungry = new Hungry();

    public static Hungry getInstance(){
        System.out.println(System.currentTimeMillis()+":"+hungry);
        return hungry;
    }
}
