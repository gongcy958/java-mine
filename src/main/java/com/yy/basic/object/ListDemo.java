package com.yy.basic.object;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gongcy
 * @date 2023/2/23 10:11 上午
 * @Description
 */
public class ListDemo {

    public static void main(String[] args) {

        List<String> bak = new ArrayList<>();
        bak.add("PATIENT_ID");
        bak.add("VISIT_ID");
        String join = String.join(",", bak);
        System.out.println(join);
    }
}
