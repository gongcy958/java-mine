package com.yy.io;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * @author gongcy
 * @date 2022/12/14 9:46 下午
 * @Description
 */
public class Stack {

    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        Object result = elements[--size];
        // Eliminate obsolete reference
        elements[size] = null;
        return result;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements,2 * size + 1);
        }
    }

}
