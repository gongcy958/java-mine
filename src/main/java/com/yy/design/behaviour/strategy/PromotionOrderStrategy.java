package com.yy.design.behaviour.strategy;

/**
 * @author gongcy
 * @date 2023/12/12 5:25 下午
 * @Description
 */
public class PromotionOrderStrategy implements OrderStrategy{
    @Override
    public double discount(OrderType type) {
        System.out.println("促销订单折扣算法");
        return 0;
    }
}
