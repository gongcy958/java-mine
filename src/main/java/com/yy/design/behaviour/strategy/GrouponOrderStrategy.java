package com.yy.design.behaviour.strategy;

/**
 * @author gongcy
 * @date 2023/12/12 5:24 下午
 * @Description
 */
public class GrouponOrderStrategy implements OrderStrategy{
    @Override
    public double discount(OrderType type) {
        System.out.println("团购订单折扣算法");
        return 0;
    }
}
