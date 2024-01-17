package com.yy.design.behaviour.strategy;

import org.springframework.beans.factory.BeanNameAware;

/**
 * @author gongcy
 * @date 2023/12/12 5:20 下午
 * @Description
 */
public class Order implements BeanNameAware {

    private OrderType type;

    public OrderType getType() {
        return type;
    }

    public void setType(OrderType type) {
        this.type = type;
    }

    public void test() {
        System.out.println("test..");
    }

    @Override
    public void setBeanName(String name) {

    }
}
