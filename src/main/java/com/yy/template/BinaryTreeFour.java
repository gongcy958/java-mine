package com.yy.template;

import java.util.LinkedList;
import java.util.List;

/**
 * @author gongcy
 * @date 2023/3/21 3:46 下午
 * @Description
 */
public class BinaryTreeFour {

    static List<Integer> res = new LinkedList<>();

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftMax = maxDepth(root.left);
        int rightMax = maxDepth(root.right);

        int max = Math.max(leftMax,rightMax) + 1;
        return max;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

//        int i = maxDepth(root);
//        System.out.println(i);

        List<Integer> result = preorder(root);
    }

    private static List<Integer> preorder(TreeNode root) {
        traverse(root);
        return res;
    }

    static void traverse(TreeNode root) {
        if (root == null) {
            return;
        }

        res.add(root.val);
        traverse(root.left);
        traverse(root.right);
    }
}
