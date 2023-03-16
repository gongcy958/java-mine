package com.yy.template;

import java.util.LinkedList;
import java.util.List;

/**
 * @author gongcy
 * @date 2023/3/15 12:39 下午
 * @Description
 */
public class PreorderTree {

    List<Integer> res = new LinkedList<>();

    List<Integer> preorderTraverse(TreeNode root) {
        traverse(root);
        return res;
    }

    void traverse(TreeNode root) {
        if (root == null) {
            return;
        }

        // 前序位置
        res.add(root.val);
        traverse(root.left);
        traverse(root.right);
    }

    // 分解思路
    List<Integer> newPreorderTraverse(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        if (root == null) {
            return res;
        }

        res.add(root.val);
        res.addAll(newPreorderTraverse(root.left));
        res.addAll(newPreorderTraverse(root.right));
        return res;
    }
}
