package com.yy.template;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author gongcy
 * @date 2023/3/21 4:31 下午
 * @Description
 */
public class LevelTemplate {

    void levelTraverse(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int sz = q.size();
            for (int i = 0; i < sz; i++) {
                TreeNode curr = q.poll();
                if (curr != null && curr.left != null) {
                    q.offer(curr.left);
                }

                if (curr != null && curr.right != null) {
                    q.offer(curr.right);
                }


            }
        }
    }
}
