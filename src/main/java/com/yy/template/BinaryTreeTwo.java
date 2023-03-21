package com.yy.template;

/**
 * @author gongcy
 * @date 2023/3/21 3:04 下午
 * @Description
 */
public class BinaryTreeTwo {

    void traverse(TreeNode root) {
        if (root == null) {
            return;
        }

        // 前序位置
        traverse(root.left);
        // 中序位置
        traverse(root.right);
        // 后序位置

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        traverseTwo(head);

    }

    static void traverseTwo(ListNode head) {
        if (head == null) {
            return;
        }

        traverseTwo(head.next);
        System.out.println(head.val);
    }
}
