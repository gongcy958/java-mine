package com.yy.design.behaviour.status;

/**
 * @author gongcy
 * @date 2022/11/10 4:31 下午
 * @Description
 */
public enum State {

    SMALL(0),
    SUPER(1),
    FIRE(2),
    CAPE(3);

    private int value;

    private State(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
