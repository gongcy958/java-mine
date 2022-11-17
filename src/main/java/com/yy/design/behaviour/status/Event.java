package com.yy.design.behaviour.status;

/**
 * @author gongcy
 * @date 2022/11/10 4:48 下午
 * @Description
 */
public enum Event {

    GOT_MUSHROOM(0),
    GOT_CAPE(1),
    GOT_FIRE(2),
    MEET_MONSTER(3);

    private int value;

    Event(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }


}
