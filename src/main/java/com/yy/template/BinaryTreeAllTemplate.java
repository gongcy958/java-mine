package com.yy.template;

/**
 * @author gongcy
 * @date 2023/3/15 11:01 上午
 * @Description
 */
public class BinaryTreeAllTemplate {

    // 迭代遍历数组
    void traverseArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // ...
        }
    }

    // 递归遍历数组
    void traverseRecursion(int[] arr, int i) {
        if (i == arr.length) {
            return;
        }

        // 前序位置
        traverseRecursion(arr,i+1);
        // 后序位置

    }

    // 迭代遍历单链表
    void traverseLinked(ListNode head) {
        for (ListNode p = head; p != null; p = p.next) {
            // ...
        }
    }

    // 递归遍历单链表
    void traverseLinkedRecursion(ListNode head) {
        if (head == null) {
            return;
        }

        // 前序位置
        traverseLinkedRecursion(head.next);
        // 后序位置

    }

    // 倒序打印单链表
    void traverseReversePrint(ListNode head) {
        if (head == null) {
            return;
        }

        traverseReversePrint(head.next);
        System.out.println(head.val);
    }
}
