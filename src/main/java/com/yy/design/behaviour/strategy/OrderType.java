package com.yy.design.behaviour.strategy;

/**
 * @author gongcy
 * @date 2023/12/12 5:15 下午
 * @Description
 */
public enum OrderType {

    NORMAL(1,"普通订单"),
    GROUPON(2,"团购订单"),
    PROMOTION(3,"促销订单");

    private final int val;
    private final String desc;

    OrderType(int val, String desc) {
        this.val = val;
        this.desc = desc;
    }


}
