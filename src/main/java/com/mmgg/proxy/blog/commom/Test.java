package com.mmgg.proxy.blog.commom;


/**
 * 这是用普通Java代码实现的不同的机器生产不同的蛋糕，
 * 如果客户需要水果蛋糕并且添加杏仁，我只需要在水果蛋糕机器类添加杏仁方法即可，
 * 如果某天客户需要的蛋糕非常特别，不仅要添加杏仁而且要各种造型，各种水果，各种汽车玩具，
 * 那么按照现在需求只能大幅度修改水果机器的程序，但是这样不仅改造成本很高，
 * 而且改造后水果机器的复用性就较差了，下次客户不需要那么大特殊需求又得改程序。
 * 那这种情况怎么解决了？
 *
 *
 * 解决这种办法就得用到代理模式，蛋糕制造员工就可以充当代理类，水果蛋糕负责水果蛋糕的制作，
 * 特殊需求交给店面员工来操作
 *
 */
public class Test {

    public static void main(String[] args) {
        FruitMachine fruitMachine = new FruitMachine();
        fruitMachine.MakeCake();

        BMachine bMachine = new BMachine();
        bMachine.MakeCake();
    }
}
