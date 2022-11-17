package com.yy.design.behaviour.visit.bak;

/**
 * @author gongcy
 * @date 2022/11/14 9:27 上午
 * @Description
 */
public interface BakVisitor {

    void visit(BakPPTFile pptFile);
    void visit(BakWordFile wordFile);
}
