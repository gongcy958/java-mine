package com.yy.design.behaviour.visit.bak;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gongcy
 * @date 2022/11/14 9:21 上午
 * @Description
 */
public class BakAnalysisToolMain {

    public static void main(String[] args) {

        List<BakIResource> resources = acquireResources();

        BakExtractor extractor = new BakExtractor();
        BakCompressor compressor = new BakCompressor();

        for (BakIResource resource : resources) {
            resource.accept(extractor);
            resource.accept(compressor);
        }

    }

    private static List<BakIResource> acquireResources() {
        List<BakIResource> resources = new ArrayList<>();
        resources.add(new BakPPTFile());
        resources.add(new BakWordFile());

        return resources;
    }
}
