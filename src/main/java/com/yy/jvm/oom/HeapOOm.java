package com.yy.jvm.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gongcy
 * @date 2022/10/25 1:52 下午
 * @Description
 *
 * VM Args: -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 */
public class HeapOOm {

    static class OOMObject{

    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();

        while (true) {
            list.add(new OOMObject());
        }
    }
}
