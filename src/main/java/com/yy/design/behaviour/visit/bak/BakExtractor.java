package com.yy.design.behaviour.visit.bak;

/**
 * @author gongcy
 * @date 2022/11/14 9:28 上午
 * @Description
 */
public class BakExtractor implements BakVisitor{


    @Override
    public void visit(BakPPTFile pptFile) {
        System.out.println("PPT extract ");
    }

    @Override
    public void visit(BakWordFile wordFile) {
        System.out.println("Word extract ");
    }
}
