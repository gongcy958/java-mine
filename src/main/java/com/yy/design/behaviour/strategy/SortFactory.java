package com.yy.design.behaviour.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gongcy
 * @date 2023/12/13 10:32 上午
 * @Description
 */
public class SortFactory {

    private static final Map<SortType,ISortAlg> factories = new HashMap<>();

    static {
        factories.put(SortType.QUICK_SORT,new QuickSortImpl());
        factories.put(SortType.EXTERNAL_SORT,new ExternalSortImpl());
        factories.put(SortType.CONCURRENT_EXTERNAL_SORT,new ConcurrentExternalSortImpl());
        factories.put(SortType.MAP_REDUCE_SORT,new MapReduceSortImpl());
    }

    public static ISortAlg getStrategy(SortType type) {
        if (type == null) {
            return null;
        }
        return factories.get(type);
    }
}
