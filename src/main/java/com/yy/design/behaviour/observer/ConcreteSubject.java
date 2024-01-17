package com.yy.design.behaviour.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gongcy
 * @date 2023/9/11 2:45 下午
 * @Description
 */
public class ConcreteSubject implements Subject{

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registryObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
