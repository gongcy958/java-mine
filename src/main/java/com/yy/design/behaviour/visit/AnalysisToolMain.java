package com.yy.design.behaviour.visit;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gongcy
 * @date 2022/11/10 3:01 下午
 * @Description
 */
public class AnalysisToolMain {

    public static void main(String[] args) {

        Visitor extractor = new Extractor();
        Visitor compressor = new Compressor();
        Visitor collector = new Collector();
        List<ResourceFile> resourceFiles = listAllResourceFiles();
        for (ResourceFile resourceFile : resourceFiles) {

            resourceFile.accept(extractor);
            resourceFile.accept(compressor);
            resourceFile.accept(collector);
        }


        System.out.println("art.");
    }

    private static List<ResourceFile> listAllResourceFiles() {
        List<ResourceFile> resourceFiles = new ArrayList<>();
        resourceFiles.add(new PPTFile("a.ppt"));
        resourceFiles.add(new PdfFile("b.pdf"));
        resourceFiles.add(new WordFile("c.word"));
        return resourceFiles;
    }
}
