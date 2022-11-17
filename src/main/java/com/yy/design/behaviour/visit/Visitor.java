package com.yy.design.behaviour.visit;

/**
 * @author gongcy
 * @date 2022/11/10 3:42 下午
 * @Description
 */
public interface Visitor {

    void visit(PdfFile pdfFile);
    void visit(PPTFile pptFile);
    void visit(WordFile wordFile);
}
