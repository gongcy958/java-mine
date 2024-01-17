package com.yy.interface0;

import java.util.Comparator;

/**
 * @author gongcy
 * @date 2023/7/21 11:57 上午
 * @Description
 */
public class LengthComparator implements Comparator<String> {

    @Override
    public int compare(String first, String second) {
        return first.length() - second.length();
    }
}
