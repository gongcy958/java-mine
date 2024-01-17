package com.yy.structure;

import com.yy.function.lambda.Employee;
import com.yy.function.lambda.Manager;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author gongcy
 * @date 2023/7/20 3:38 下午
 * @Description
 */
public class ReflectionExample {

    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {

        Class<Manager> clazz = Manager.class;
        Field[] fields = clazz.getFields();
        Field[] declaredFields = clazz.getDeclaredFields();
        System.out.println(".....");

        Class<? super Manager> superclass = clazz.getSuperclass();
        Field[] declaredFields1 = superclass.getDeclaredFields();
        for (Field field : declaredFields1) {
            int modifiers = field.getModifiers();
        }
        System.out.println(".....");

        // 方法
        Method[] methods = clazz.getMethods();
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method method : declaredMethods) {
            Class<?>[] exceptionTypes = method.getExceptionTypes();
            int modifiers = method.getModifiers();
            String modifierStr = Modifier.toString(modifiers);
            printModifier(modifiers);
            Class<?> returnType = method.getReturnType();
            System.out.println("-----");
        }
        System.out.println(".....");

        // 构造器
        Constructor<?>[] constructors = clazz.getConstructors();
        Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor<?> constructor : declaredConstructors) {
            int modifiers = constructor.getModifiers();
            Class<?>[] exceptionTypes = constructor.getExceptionTypes();
            String name = constructor.getName();
            Class<?>[] parameterTypes = constructor.getParameterTypes();

        }
        System.out.println(".....");

        String name = clazz.getPackage().getName();
        Class<?> declaringClass = clazz.getDeclaringClass();
        System.out.println(".....");


        Employee employee = new Employee("jack",100);
        Class<? extends Employee> aClass = employee.getClass();
//        Field[] declaredFields2 = aClass.getDeclaredFields();
//        for (Field field : declaredFields2) {
//            Object obj =  field.get(employee);
//            System.out.println("*****");
//        }
        Field name1 = aClass.getDeclaredField("name");
        name1.setAccessible(true);
        boolean accessible = name1.isAccessible();

        Object o = name1.get(employee);
        name1.set(employee,"mine");
        System.out.println(name1.get(employee));
        System.out.println("****");
    }

    private static void printModifier(int modifiers) {
        if (Modifier.isPrivate(modifiers)) {
            System.out.println("访问修饰符是private");
        } else if (Modifier.isPublic(modifiers)) {
            System.out.println("访问修饰符是public");
        } else if (Modifier.isAbstract(modifiers)) {
            System.out.println("访问修饰符是abstract");
        } else if (Modifier.isInterface(modifiers)) {
            System.out.println("访问修饰符是接口");
        } else if (Modifier.isFinal(modifiers)) {
            System.out.println("访问修饰符是final");
        } else if (Modifier.isStatic(modifiers)) {
            System.out.println("访问修饰符是static");
        } else if (Modifier.isStrict(modifiers)) {
            System.out.println("访问修饰符是strict");
        } else if (Modifier.isNative(modifiers)) {
            System.out.println("访问修饰符是native");
        } else if (Modifier.isProtected(modifiers)) {
            System.out.println("访问修饰符是protected");
        } else if (Modifier.isSynchronized(modifiers)) {
            System.out.println("访问修饰符是synchronized");
        } else if (Modifier.isTransient(modifiers)) {
            System.out.println("访问修饰符是transient");
        } else if (Modifier.isVolatile(modifiers)) {
            System.out.println("访问修饰符是volatile");
        }
    }
}
