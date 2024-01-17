package com.yy.structure;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author gongcy
 * @date 2023/7/20 5:59 下午
 * @Description
 */
public class ArrayExample {

    public static void main(String[] args) {
        int[] a = {1,2,3};
        a = (int[]) goodCopyOf(a,10);
        System.out.println(Arrays.toString(a));

        String[] b = {"Tom","Dick","Harry"};

        Object o = Array.get(b, 2);
        System.out.println(o);
        int length = Array.getLength(b);
        System.out.println(length);

        b = (String[]) goodCopyOf(b,10);
        System.out.println(Arrays.toString(b));

//        b = (String[]) badCopyOf(b,10);
    }

    public static Object[] badCopyOf(Object[] a,int newLength){
        Object[] newArray = new Object[newLength];
        System.arraycopy(a,0,newArray,0,Math.min(a.length,newLength));
        return newArray;
    }

    public static Object goodCopyOf(Object a, int newLength) {
        Class<?> clazz = a.getClass();
        if (!clazz.isArray()) {
            return null;
        }

        Class<?> componentType = clazz.getComponentType();
        int length = Array.getLength(a);

        Object newArray = Array.newInstance(componentType, newLength);
        System.arraycopy(a,0,newArray,0,Math.min(length,newLength));
        return newArray;
    }
}
