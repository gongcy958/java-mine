package com.yy.template;

/**
 * @author gongcy
 * @date 2023/3/16 11:53 上午
 * @Description
 */
public class MaxPQ <T extends Comparable<T>> {

    private T[] pq;
    private int size = 0;

    // 父节点的索引
    int parent(int root) {
        return root / 2;
    }
    // 左孩子的索引
    int left(int root) {
        return root * 2;
    }
    // 右孩子的索引
    int right(int root) {
        return root * 2 + 1;
    }

    public MaxPQ(int cap) {
        pq = (T[]) new Comparable[cap + 1];
    }

    public T max() {
        return pq[1];
    }

    public void insert(T t) {
        size++;
        pq[size] = t;
        swim(size);
    }

    // 堆顶最大元素
    public T delMax() {
        T max = pq[1];
        swap(1,size);
        pq[size] = null;
        size--;
        sink(1);
        return max;
    }

    // 上浮
    private void swim(int x) {
        while (x > 1 && less(parent(x), x)) {
            swap(parent(x),x);
            x = parent(x);
        }
    }

    // 下沉
    private void sink(int x) {
        while (left(x) <= size) {
            int max = left(x);
            if (right(x) <= size && less(max, right(x))) {
                max = right(x);
            }

            if (less(max, x)) {
                break;
            }

            swap(x,max);
            x = max;
        }
    }

    private void swap(int i, int j) {
        T temp = pq[i];
        pq[i] = pq[j];
        pq[j] = temp;
    }

    // pq[i] 是否比 pq[j] 小
    private boolean less(int i, int j) {
        return pq[i].compareTo(pq[j]) < 0;
    }


}
