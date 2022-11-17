package com.yy.design.behaviour.visit;

/**
 * @author gongcy
 * @date 2022/11/10 2:59 下午
 * @Description
 */
public class WordFile extends ResourceFile{
    public WordFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

//    @Override
//    public void accept(Extractor extractor) {
//        extractor.extractToTxt(this);
//    }
//
//    @Override
//    public void accept(Compressor compressor) {
//        compressor.compress(this);
//    }

//    @Override
//    public void extractToTxt() {
//
//        // word -> txt
//
//        // save -> same.txt
//
//        System.out.println("Extract word .");
//    }
}
