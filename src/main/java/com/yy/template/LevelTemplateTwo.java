package com.yy.template;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author gongcy
 * @date 2023/3/21 4:40 下午
 * @Description
 */
public class LevelTemplateTwo {

    List<List<Integer>> res = new ArrayList<>();

    List<List<Integer>> levelTraverse(TreeNode root) {
        if (root == null) {
            return res;
        }

        traverse(root,0);
        return res;
    }

    private void traverse(TreeNode root, int level) {
        if (root == null) {
            return;
        }

        if (res.size() <= level) {
            res.add(new LinkedList<>());
        }

        res.get(level).add(root.val);
        traverse(root.left,level + 1);
        traverse(root.right,level + 1);
    }
}
