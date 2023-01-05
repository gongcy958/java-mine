package com.yy.io;

import java.awt.*;

/**
 * @author gongcy
 * @date 2022/12/16 3:45 下午
 * @Description
 */
public class ColorPoint extends Point{

    private final java.awt.Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof Point)) {
            return false;
        }

        if (!(obj instanceof ColorPoint)) {
            return obj.equals(this);
        }
        return super.equals(obj) && ((ColorPoint) obj).color == color;
    }
}
