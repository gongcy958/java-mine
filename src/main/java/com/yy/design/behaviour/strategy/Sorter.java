package com.yy.design.behaviour.strategy;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author gongcy
 * @date 2023/12/13 10:02 上午
 * @Description
 */
public class Sorter {

    private static final long GB = 1024 * 1024 * 1024;

    private static final List<AllRange> allRanges = new ArrayList<>();

    static {
        allRanges.add(new AllRange(0,6 * GB,SortFactory.getStrategy(SortType.QUICK_SORT)));
        allRanges.add(new AllRange(6 * GB,10 * GB,SortFactory.getStrategy(SortType.QUICK_SORT)));
        allRanges.add(new AllRange(10 * GB,100 * GB,SortFactory.getStrategy(SortType.QUICK_SORT)));
        allRanges.add(new AllRange(100 * GB,Long.MAX_VALUE,SortFactory.getStrategy(SortType.QUICK_SORT)));
    }

    private static void sort(String filePath) {
        File file = new File(filePath);
        long fileSize = file.length();
        ISortAlg sortAlg = null;
        for (AllRange allRange : allRanges) {
            if (allRange.inRange(fileSize)) {
                sortAlg = allRange.getAlg();
                break;
            }
        }
        sortAlg.sort(filePath);
    }

//    public static void sortFilter(String filePath){
//        File file = new File(filePath);
//        long length = file.length();
//        if (length < 6 * GB) {
//            quickSort(filePath);
//        } else if (length < 10 * GB) {
//            externalSort(filePath);
//        } else if (length < 100 * GB) {
//            concurrentExternalSort(filePath);
//        } else {
//            mapreduceSort(filePath);
//        }
//    }

//    private static void sort(String filePath) {
//        File file = new File(filePath);
//        long fileSize = file.length();
//        ISortAlg sortAlg;
//        if (fileSize < 6 * GB) {
//            sortAlg = new QuickSortImpl();
//        } else if (fileSize < 10 * GB) {
//            sortAlg = new ExternalSortImpl();
//        } else if (fileSize < 100 * GB) {
//            sortAlg = new ConcurrentExternalSortImpl();
//        } else {
//            sortAlg = new MapReduceSortImpl();
//        }
//        sortAlg.sort(filePath);
//    }

//    private static void sort(String filePath) {
//        File file = new File(filePath);
//        long fileSize = file.length();
//        ISortAlg sortAlg;
//        if (fileSize < 6 * GB) {
//            sortAlg = SortFactory.getStrategy(SortType.QUICK_SORT);
//        } else if (fileSize < 10 * GB) {
//            sortAlg = SortFactory.getStrategy(SortType.EXTERNAL_SORT);
//        } else if (fileSize < 100 * GB) {
//            sortAlg = SortFactory.getStrategy(SortType.CONCURRENT_EXTERNAL_SORT);
//        } else {
//            sortAlg = SortFactory.getStrategy(SortType.MAP_REDUCE_SORT);
//        }
//        sortAlg.sort(filePath);
//    }

    private static void mapreduceSort(String filePath) {

    }

    private static void concurrentExternalSort(String filePath) {

    }

    private static void externalSort(String filePath) {

    }

    private static void quickSort(String filePath) {

    }

    private static class AllRange {
        private long start;
        private long end;
        private ISortAlg alg;

        public AllRange(long start, long end, ISortAlg alg) {
            this.start = start;
            this.end = end;
            this.alg = alg;
        }

        public ISortAlg getAlg() {
            return alg;
        }

        private boolean inRange(long fileSize) {
            return fileSize >= start && fileSize < end;
        }


    }
}
