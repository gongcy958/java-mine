package com.yy.design.behaviour.observer;

/**
 * @author gongcy
 * @date 2023/9/11 2:44 下午
 * @Description
 */
public interface Subject {

    void registryObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
