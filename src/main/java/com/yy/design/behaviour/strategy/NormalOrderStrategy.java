package com.yy.design.behaviour.strategy;

/**
 * @author gongcy
 * @date 2023/12/12 5:24 下午
 * @Description
 */
public class NormalOrderStrategy implements OrderStrategy{
    @Override
    public double discount(OrderType type) {
        System.out.println("普通订单折扣算法");
        return 0;
    }
}
