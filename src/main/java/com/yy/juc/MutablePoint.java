package com.yy.juc;

/**
 * @author gongcy
 * @date 2023/1/2 5:55 下午
 * @Description
 */
public class MutablePoint {

    public int x,y;

    public MutablePoint() {
        x = 0;
        y = 0;
    }

    public MutablePoint(MutablePoint p){
        this.x = p.x;
        this.y = p.y;
    }

}
