package com.mmgg.strategy.payport;


/**
 * 暂时当作一个常量维护
 */
public enum PayType {

    ALI_PAY(new AliPay()),
    WECHAT_PAY(new WeChatPay()),
    UNION_PAY(new UnionPay()),
    JDPAY(new JDPay());


    private  Payment payment;

    PayType(Payment payment){
        this.payment = payment;
    }

    public Payment getPayment() {
        return payment;
    }
}
