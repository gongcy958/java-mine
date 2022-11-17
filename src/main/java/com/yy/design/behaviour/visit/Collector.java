package com.yy.design.behaviour.visit;

/**
 * @author gongcy
 * @date 2022/11/10 4:06 下午
 * @Description
 */
public class Collector implements Visitor{

    @Override
    public void visit(PdfFile pdfFile) {

        // ..

        System.out.println("Collect PDF .");
    }

    @Override
    public void visit(PPTFile pptFile) {

        // ..

        System.out.println("Collect PPT .");
    }

    @Override
    public void visit(WordFile wordFile) {

        // ..

        System.out.println("Collect WORD .");
    }
}
