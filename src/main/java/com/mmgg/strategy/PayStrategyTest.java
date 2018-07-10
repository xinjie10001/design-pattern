package com.mmgg.strategy;

import com.mmgg.strategy.payport.PayType;

public class PayStrategyTest {

    public static void main(String[] args) {

        //省略商品添加到购物车...再从购物车下单

        //这里直接从订单开始
        Order order = new Order("1","201807010",324.00);

        //开始支付，选择支付方式：微信、支付宝、花呗、京东白条、银联卡...
        //每个支付方式的算法是不一样的
        System.out.println(order.pay(PayType.UNION_PAY));
    }
}
