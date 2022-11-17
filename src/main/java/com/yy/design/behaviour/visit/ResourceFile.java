package com.yy.design.behaviour.visit;

/**
 * @author gongcy
 * @date 2022/11/10 2:55 下午
 * @Description
 */
public abstract class ResourceFile {

    protected String filePath;

    public ResourceFile(String filePath) {
        this.filePath = filePath;
    }

//    public abstract void extractToTxt(Extractor extractor);

//    public abstract void accept(Extractor extractor);


//    public abstract void accept(Compressor compressor);

    public abstract void accept(Visitor visitor);
}
