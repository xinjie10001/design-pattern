package com.mmgg.proxy.blog.staticproxy;

import com.mmgg.proxy.blog.commom.BMachine;
import com.mmgg.proxy.blog.commom.FruitMachine;

/**
 * 静态动态代理，这种方式可以不用在已经封装好的水果蛋糕类中修改业务，把特殊添加的东西用代理类（服务员）来操作，扩展性也强
 * 如果下次来个客人需要b类蛋糕需要添加葡萄干，那我们要再建一个b蛋糕的代理类即可
 * 但是此种方式也有缺点，现实业务非常多变，如果没来一种特殊都要建立一个新的代理，那也是非常繁琐的
 *
 *
 * 总结缺点： 静态代理类只能代理一个类，不能代理其他类，接下来就可以引出动态代理类（可以代理多个类）
 */
public class Test {

    public static void main(String[] args) {
        FruitMachine fruitCakeMachine = new FruitMachine();
        CakeMachinStaticProxy proxy = new CakeMachinStaticProxy(fruitCakeMachine);
        proxy.addOther();

        BMachine bMachine = new BMachine();
        CakeMachinStaticProxy proxy1 = new CakeMachinStaticProxy(bMachine);
        proxy1.addOther();
    }
}
