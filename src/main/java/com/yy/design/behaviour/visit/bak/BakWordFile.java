package com.yy.design.behaviour.visit.bak;

/**
 * @author gongcy
 * @date 2022/11/14 9:40 上午
 * @Description
 */
public class BakWordFile implements BakIResource{

    @Override
    public void accept(BakVisitor bakVisitor) {
        bakVisitor.visit(this);
    }
}
