package com.yy.design.behaviour.observer;

/**
 * @author gongcy
 * @date 2023/9/11 2:48 下午
 * @Description
 */
public class ObserverDemo {

    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        concreteSubject.registryObserver(new ObserverOne());
        concreteSubject.registryObserver(new ObserverTwo());
        concreteSubject.notifyObservers();
    }
}
