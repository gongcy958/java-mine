package com.yy.io;

import java.util.Set;

/**
 * @author gongcy
 * @date 2022/12/16 3:31 下午
 * @Description
 */
public class Point {

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
//        if (!(obj instanceof Point)) {
//            return false;
//        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        Point p = (Point) obj;
        return p.x == x && p.y == y;
    }

//    private static final Set<Point> unitCircle = Set.of(
//            new Point(1,0),new Point(0,1),
//            new Point(-1,0),new Point(0,-1)
//    );

//    public static boolean onUnitCircle(Point p){
//        return unitCircle.contains(p);
//    }
}
