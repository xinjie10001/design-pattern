package com.mmgg.proxy.cglibproxy;

public class cglibTest {

    public static void main(String[] args) {
        CMachine cMachine = (CMachine) new CgLibProxy().getInstance(CMachine.class);
        cMachine.mackNaiCha();
    }
}
