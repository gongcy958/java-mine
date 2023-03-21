package com.yy.template;

/**
 * @author gongcy
 * @date 2023/3/21 3:33 下午
 * @Description
 */
public class BinaryTreeThree {

    static int maxDepth = 0;
    static int currDepth = 0;

    public static int maxDepth(TreeNode root) {
        traverse(root);
        return maxDepth;
    }

    static void traverse(TreeNode root) {
        if (root == null) {
            return;
        }

        currDepth++;
        if (root.left == null && root.right == null) {
            maxDepth = Math.max(maxDepth,currDepth);
        }
//        System.out.println("递归之前的节点是 " + root.val);
        traverse(root.left);
//        System.out.println("中序遍历的节点是 " + root.val);
        traverse(root.right);
        System.out.println("后序遍历的节点是 " + root.val);

        currDepth--;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        int i = maxDepth(root);
        System.out.println(i);
    }
}
