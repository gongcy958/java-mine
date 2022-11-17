package com.yy.design.create.singleton.packageone;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author gongcy
 * @date 2022/11/3 2:41 下午
 * @Description
 */
public class SampleIdGeneratorDemo {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        Long id = SampleIdGenerator.getInstance().getId();

//        Class<SampleIdGenerator> clazz = SampleIdGenerator.class;
//        Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
//        for (Constructor<?> constructor : declaredConstructors) {
//            constructor.setAccessible(true);
//            SampleIdGenerator o =(SampleIdGenerator) constructor.newInstance();
//            System.out.println("测试私有构造器访问权限");
//        }

        List<String> list = new ArrayList<>();
        list.add("jack");
        list.add("rose");
        list.add("tom");
        System.out.println(list.toString());

        System.out.println(id);
    }
}
