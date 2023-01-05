package com.yy.generic;

import java.util.*;
import java.util.function.UnaryOperator;

/**
 * @author gongcy
 * @date 2022/11/29 11:53 上午
 * @Description
 */
public class ArticleMain {

    private static UnaryOperator<Object> IDENTITY_FN = (t) -> t;

    @SuppressWarnings("unchecked")
    public static <T> UnaryOperator<T> identifyFunction() {
        return (UnaryOperator<T>) IDENTITY_FN;
    }

//    public static void main(String[] args) {
//
//        List stamps = new ArrayList();
//        stamps.add(new Stamp());
//
//        // 误添加
//        stamps.add(new Coin());
//
//        // 假设某处取集合元素处理
//
//        for (Iterator i = stamps.iterator(); i.hasNext(); ) {
//            Stamp stamp = (Stamp) i.next();
//            System.out.println("do ..");
//        }
//
//    }

    public static void main(String[] args){

        Stack<Number> numberStack = new Stack<>();
        Iterable<Integer> integers = new ArrayList<>();
        numberStack.pushAll(integers);

    }




    public static <E> Set<E> union(Set<E> s1,Set<E> s2) {
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }


    public static void unsafeAdd(List<?> list,Object o){
        if (o instanceof Set<?>) {
            Set<?> s = (Set<?>) o;
        }
    }



}
