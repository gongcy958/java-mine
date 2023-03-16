package com.yy.template;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author gongcy
 * @date 2023/3/15 1:14 下午
 * @Description
 */
public class TreeTemplate {

    void traverse(TreeNode root, int level) {
        if (root == null) {
            return;
        }

        // 前序位置
        System.out.printf("节点%s 在第%d 层,",root,level);
        traverse(root.left,level + 1);
        traverse(root.right, level + 1);
    }

    void test(){
        traverse(new TreeNode(5),1);
    }

    int count(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftCount = count(root.left);
        int rightCount = count(root.right);

        // 后序位置
        System.out.printf("节点 %s 的左子树有 %d 个节点，右子树有 %d 个节点",root,leftCount,rightCount);
        return leftCount + rightCount + 1;
    }

    void levelTraverse(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        // 从上到下遍历二叉树的每一层
        while (!q.isEmpty()) {

            int sz = q.size();

            // 从左到右遍历每一层的每个节点
            for (int i = 0; i < sz; i++) {
                TreeNode cur = q.poll();

                // 将下一层的节点放入队列
                if (cur.left != null) {
                    q.offer(cur.left);
                }

                if (cur.right != null) {
                    q.offer(cur.right);
                }
            }
        }
    }
}
