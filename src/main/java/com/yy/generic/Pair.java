package com.yy.generic;

import java.util.function.Supplier;

/**
 * @author gongcy
 * @date 2023/7/25 2:36 下午
 * @Description
 */
public class Pair<T> {

    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
//        first = T.class.getConstructor().newInstance();

    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public static <T> Pair<T> makePair(Supplier<T> constr) {
        return new Pair<>(constr.get(),constr.get());
    }

//    public static <T extends Comparable> T[] minmax(T... a){
//        // 不能构造泛型数组
////        T[] mm = new T[2];
//    }

    public static <T> Object jsonToObject(String json,Class<T> t) {
        T obj = null;
        try {
            obj = t.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return obj;
    }

}
