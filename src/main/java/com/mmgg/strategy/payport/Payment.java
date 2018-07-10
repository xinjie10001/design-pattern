package com.mmgg.strategy.payport;

import com.mmgg.strategy.PayState;

public interface Payment {

    //每次增加一个支付方式都需要维护接口一次
   /* public final static Payment ALI_PAY = new AliPay();
    public final static Payment WECHAT_PAY = new WeChatPay();
    public final static Payment UNION_PAY = new UnionPay();
    public final static Payment JD_PAY = new JDPay();*/

    public PayState pay(String uid,double amount);


}
