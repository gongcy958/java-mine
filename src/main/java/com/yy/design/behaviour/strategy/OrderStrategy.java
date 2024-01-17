package com.yy.design.behaviour.strategy;

/**
 * @author gongcy
 * @date 2023/12/12 5:23 下午
 * @Description
 */
public interface OrderStrategy {

    double discount(OrderType type);
}
