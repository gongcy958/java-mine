package com.yy.design.behaviour.visit;

/**
 * @author gongcy
 * @date 2022/11/10 2:56 下午
 * @Description
 */
public class PPTFile extends ResourceFile{

    public PPTFile(String filePath) {
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
//        // ppt -> txt
//
//        // save same.txt
//
//        System.out.println("Extract PPT .");
//    }
}
