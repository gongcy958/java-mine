package com.yy.design.behaviour.strategy;

/**
 * @author gongcy
 * @date 2023/12/12 5:02 下午
 * @Description
 */
public class ConcreteStrategyA implements AStrategy{
    @Override
    public void algorithmInterface() {
        System.out.println("算法A");
    }
}
