package com.mmgg.strategy;

import com.mmgg.strategy.payport.PayType;

public class Order {

    private String uid;
    private String orderId;
    private double amount;

    public Order(String uid, String orderId, double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }

    /**
     * 这个参数完全可以用Payment这个接口代替
     *
     *
     * 现在这么写完美的解决了if else等判断
     *
     * @param payType
     * @return
     */
    public PayState pay(PayType payType){
        return payType.getPayment().pay(this.uid,this.amount);
    }
}
