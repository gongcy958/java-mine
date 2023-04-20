package com.yy.template;

import java.util.HashMap;

/**
 * @author gongcy
 * @date 2023/3/23 11:02 上午
 * @Description
 */
public class LRUNormal {
    private HashMap<Integer,Node> map;
    private DoubleList cache;
    private int cap;

    public LRUNormal(int capacity) {
        this.cap = capacity;
        map = new HashMap<>();
        cache = new DoubleList();
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        makeRecently(key);
        return map.get(key).val;
    }

    public void put(int key, int val) {
        if (map.containsKey(key)) {
            deleteKey(key);
            addRecently(key,val);
            return;
        }

        if (cap == cache.size()) {
            removeLeastRecently();
        }

        addRecently(key,val);
    }

    private void makeRecently(int key) {
        Node x = map.get(key);
        cache.remove(x);
        cache.addLast(x);
    }

    private void addRecently(int key, int val) {
        Node x = new Node(key,val);
        cache.addLast(x);
        map.put(key,x);
    }

    private void deleteKey(int key) {
        Node x = map.get(key);
        cache.remove(x);
        map.remove(key);
    }

    private void removeLeastRecently() {
        Node deletedNode = cache.removeFirst();
        int deletedKey = deletedNode.key;
        map.remove(deletedKey);
    }

    class Node {
        public int key,val;
        public Node next,prev;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    class DoubleList {
        private Node head,tail;
        private int size;

        public DoubleList() {

            head = new Node(0,0);
            tail = new Node(0,0);
            head.next = tail;
            tail.prev = head;
            size = 0;
        }

        public void addLast(Node x) {
            x.prev = tail.prev;
            x.next = tail;
            tail.prev.next = x;
            tail.prev = x;
            size++;
        }

        public void remove(Node x) {
            x.prev.next = x.next;
            x.next.prev = x.prev;
            size--;
        }

        public Node removeFirst() {
            if (head.next == null) {
                return null;
            }

            Node first = head.next;
            remove(first);
            return first;
        }

        public int size() {
            return size;
        }
    }
}
