package com.yy.juc;

import java.util.HashSet;
import java.util.Set;

/**
 * @author gongcy
 * @date 2023/1/2 11:29 上午
 * @Description
 */
public final class ThreeStooges {

    private final Set<String> stooges = new HashSet<>();

    public ThreeStooges() {
        stooges.add("Moe");
        stooges.add("Larry");
        stooges.add("Curly");
    }

    public boolean isStooge(String name) {
        return stooges.contains(name);
    }

}
