package com.yy.spring;

import com.yy.design.behaviour.strategy.Order;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author gongcy
 * @date 2023/12/15 4:26 下午
 * @Description
 */
public class SpringHelloWorld {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Order order = (Order) context.getBean("order");
        order.test();
    }

}
