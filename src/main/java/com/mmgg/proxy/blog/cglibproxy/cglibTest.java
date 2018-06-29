package com.mmgg.proxy.blog.cglibproxy;

import com.mmgg.proxy.blog.commom.BMachine;

public class cglibTest {

    public static void main(String[] args) {
        CMachine cMachine = (CMachine) new CgLibProxy().getInstance(CMachine.class);
        cMachine.mackNaiCha();
    }
}
