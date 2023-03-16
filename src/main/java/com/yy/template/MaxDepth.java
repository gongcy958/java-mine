package com.yy.template;

/**
 * @author gongcy
 * @date 2023/3/15 12:02 下午
 * @Description
 */
public class MaxDepth {

    static int res = 0;
    static int depth = 0;

    public static int maxDepth(TreeNode root) {
        traverse(root);
        return res;
    }

    static void traverse(TreeNode root) {
        if (root == null) {
            return;
        }

        depth++;
        if (root.left == null && root.right == null) {
            res = Math.max(res,depth);
        }

        traverse(root.left);
        traverse(root.right);
        depth--;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        int result = maxDepth(root);
        System.out.println(result);
    }


}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }}
