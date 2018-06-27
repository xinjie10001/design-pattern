package com.mmgg.proxy.javaproxy;

import com.mmgg.proxy.common.CakeMachine;

/**
 * 普通水果机代理类
 */
public class FruitMachineGeneralProxy implements CakeMachine {

    private CakeMachine cakeMachine;

    public FruitMachineGeneralProxy(CakeMachine cakeMachine) {
        this.cakeMachine = cakeMachine;
    }

    @Override
    public void makeCake() {
        cakeMachine.makeCake();
        System.out.println("添加自定义的");

    }
}
