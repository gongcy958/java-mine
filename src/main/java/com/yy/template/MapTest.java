package com.yy.template;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gongcy
 * @date 2023/3/22 12:23 下午
 * @Description
 */
public class MapTest {

    public static void main(String[] args) {


        Map<String,String> map = new HashMap<>();
        String s = map.get(null);
        System.out.println(s);
    }
}
