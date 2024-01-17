package com.yy.design.behaviour.observer;

/**
 * @author gongcy
 * @date 2023/9/11 2:47 下午
 * @Description
 */
public class ObserverTwo implements Observer{
    @Override
    public void update() {
        System.out.println("观察者2号 更新消息");
    }
}
