package com.yy.structure;

import java.util.Iterator;

/**
 * @author gongcy
 * @date 2023/7/18 11:24 上午
 * @Description
 */
public class ArrayListPlus<T> {

    private Object[] elementData = new Object[10];

    private int size;

    public boolean add(T e) {
        elementData[size++] = e;
        return true;
    }

    private class ItrPlus implements Iterator<T>{

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public T next() {
            final Object[] elementData = ArrayListPlus.this.elementData;
            return null;
        }
    }

    public ItrPlus iterator() {
        return new ItrPlus();
    }
}
