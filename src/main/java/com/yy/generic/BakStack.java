package com.yy.generic;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * @author gongcy
 * @date 2022/11/29 9:43 下午
 * @Description
 */

public class BakStack<E> {

    private Object[] elements;
    // 初始size
    private int size = 0;
    // 默认容量
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public BakStack() {
        // 构造
        elements =  new Object[DEFAULT_INITIAL_CAPACITY];
    }

    // 入栈
    public void push(E e) {
        // 确认容量
        ensureCapacity();
        // 增加元素
        elements[size++] = e;
    }

    // 出栈
    public E pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }

        // push requires elements to be of type E，so cast is correct
        @SuppressWarnings("unchecked") E result = (E) elements[--size];
        elements[size] = null;
        return result;
    }

    // 是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    // 扩容
    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size  + 1);
        }
    }

    public void pushAll(Iterable<E> src) {
        for (E e : src) {
            push(e);
        }
    }
}
