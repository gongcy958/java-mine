package com.yy.template;

/**
 * @author gongcy
 * @date 2023/3/14 10:41 上午
 * @Description
 */
public class DataStructureTemplate {

    // 数组框架
    void traverse(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // 迭代访问 arr[i]
        }
    }

    // 链表框架 迭代
    void traverseLinked(ListNode head) {
        for (ListNode p = head; p != null; p = p.next) {
            // 迭代访问 p.val
        }
    }

    // 链表框架 递归
    void traverseRecursion(ListNode head) {
        traverseRecursion(head.next);
    }

    // 二叉树框架 非线性递归
    void traverseTree(TreeNode root) {
        traverseTree(root.left);
        traverseTree(root.right);
    }

    class TreeNode{
        int val;
        TreeNode left,right;
    }

    // N叉树遍历框架
    class TreeNewNode{
        int val;
        TreeNewNode[] children;
    }

    void traverseNTree(TreeNewNode root) {
        for (TreeNewNode child : root.children) {
            traverseNTree(child);
        }
    }

}

class ListNode{
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}


