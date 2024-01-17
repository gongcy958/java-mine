package com.yy.jvm.oom;


import java.lang.reflect.Field;

/**
 * @author gongcy
 * @date 2022/10/25 5:00 下午
 * @Description
 */
public class DirectMemoryOOM {

    private static final int _1MB = 1024 * 1024;

//    public static void main(String[] args) throws IllegalAccessException {
//        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
//        unsafeField.setAccessible(true);
//        Unsafe unsafe =(Unsafe) unsafeField.get(null);
//        while (true) {
//            unsafe.allocateMemory(_1MB);
//        }
//    }

    public static void main(String[] args) {
        while (true) {
            System.out.println(1);
        }
    }
}
