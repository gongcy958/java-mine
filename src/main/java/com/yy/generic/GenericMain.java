package com.yy.generic;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author gongcy
 * @date 2022/11/26 4:37 下午
 * @Description
 */
public class GenericMain {

    public static void main(String[] args) {

//        final Collection stmaps = new ArrayList();
//        stmaps.add(new Stamp());
//        stmaps.add(new Coin());
//
//        for (Iterator i = stmaps.iterator(); i.hasNext() ;) {
//            Stamp next = (Stamp) i.next();
//            System.out.println(next);
//        }

//        List<String> strings = new ArrayList<>();
//        unsafeAdd(strings,Integer.valueOf(42));
//        String s = strings.get(0);

//        List<?> lists = new ArrayList<>();
//        lists.add(null);

//        Set<String> set1 = new HashSet<>();
//        Set<Integer> set2 = new HashSet<>();
//
//        int i = numElementsInCommon(set1, set2);

//        Object[] objects = new Long[1];
//        objects[0] = "I don't fit in";

//       List<Object> o1 = new ArrayList<Long>();

        @SuppressWarnings("unchecked")Set<Stamp> extra = new HashSet();

//        List<String>[] stringLists = new List<String>[1];

//        Stack<Number> numberStack = new Stack<>();
//        Iterable<Integer> integers = new ArrayList<>();
//        numberStack.pushAll(integers);
//
//        Collection<Object> objects = new ArrayList<>();
//        numberStack.popAll(objects);

//        String[] attributes = pickTwo("Good","Fast","Cheap");

        Favorites f = new Favorites();
        f.putFavorite(String.class,"java");
        f.putFavorite(Integer.class,0xCafebabe);
        f.putFavorite(Class.class,Favorites.class);

        String favoriteString = f.getFavorite(String.class);
        Integer favoriteInteger = f.getFavorite(Integer.class);
        Class<?> favorite = f.getFavorite(Class.class);

        System.out.printf("%s %x %s%n",favoriteString,favoriteInteger,favorite.getSimpleName());


    }

    private static void unsafeAdd(List list, Object obj) {
        list.add(obj);
    }

    static int numElementsInCommon(Set<?> s1 , Set<?> s2){
        int result = 0;
        for (Object o1 : s1) {
            if (s2.contains(s1)) {
                result++;
            }
        }
        return result;
    }

    public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }

    static <T> T[] pickTwo(T a, T b, T c) {
        switch (ThreadLocalRandom.current().nextInt(3)) {
            case 0: return toArray(a,b);
            case 1: return toArray(a,c);
            case 2: return toArray(b,c);
        }
        throw new AssertionError();
    }

    private static <T> T[] toArray(T a, T b) {
        return null;
    }

}
