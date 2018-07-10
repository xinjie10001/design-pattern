package com.mmgg.proxy.staticproxy;


import com.mmgg.proxy.commom.CakeMachine;

public class CakeMachinStaticProxy {

    private CakeMachine cakeMachine;

    public CakeMachinStaticProxy(CakeMachine cakeMachine) {
        this.cakeMachine = cakeMachine;
    }

    public void addOther(){
        cakeMachine.MakeCake();
        System.out.println("我是来添加杏仁...");
    }
}
