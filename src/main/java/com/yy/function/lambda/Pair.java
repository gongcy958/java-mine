package com.yy.function.lambda;

/**
 * @author gongcy
 * @date 2023/6/9 3:36 下午
 * @Description
 */
public class Pair<K,V> {

    private K name;
    private V value;

    public Pair(K name, V value) {
        this.name = name;
        this.value = value;
    }

    public K getName() {
        return name;
    }

    public void setName(K name) {
        this.name = name;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

