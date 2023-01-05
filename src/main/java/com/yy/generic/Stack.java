package com.yy.generic;

import java.util.Arrays;
import java.util.Collection;
import java.util.EmptyStackException;

/**
 * @author gongcy
 * @date 2022/11/28 10:36 上午
 * @Description
 */
public class Stack<E> {

    private E[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    @SuppressWarnings("unchecked")
    public Stack() {
        elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(E e){
        ensureCapacity();
        elements[size++] = e;
    }

    public E pop() {
        if (size == 0) {
            throw  new EmptyStackException();
        }

        E result = elements[--size];
        elements[size] = null;
        return result;
    }

    private void ensureCapacity() {

        if (elements.length == size) {
            elements = Arrays.copyOf(elements,2 * size + 1);
        }

    }

    // add
    public void pushAll(Iterable<? extends E> src) {
        for (E e : src) {
            push(e);
        }
    }

    public void popAll(Collection<? super E> dst) {
        while (!dst.isEmpty()) {
            dst.add(pop());
        }
    }
}
