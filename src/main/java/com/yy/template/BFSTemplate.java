package com.yy.template;

import javax.xml.soap.Node;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * @author gongcy
 * @date 2023/3/13 10:40 上午
 * @Description
 */
public class BFSTemplate {

//    int BFS(Node start, Node target) {
//        Queue<Node> q;
//        Set<Node> visited;
//
//        q.offer(start);
//        visited.add(start);
//        int step = 0;
//
//        while (q != null) {
//            int sz = q.size();
//
//            for (int i = 0; i < sz; i++) {
//                Node curr = q.poll();
//                if (curr == target) {
//                    return step;
//                }
//
//                for (Node x : curr.adj()) {
//                    if (x not in visited){
//                        q.offer(x);
//                        visited.add(x);
//                    }
//                }
//            }
//            step++;
//        }
//    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        root.val = 3;
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(11);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(17);
        int i = minDepth(root);
        System.out.println(i);
    }

    public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int depth = 1;

        while (!q.isEmpty()) {
            int sz = q.size();

            // 将当前队列中所有节点向四周扩散
            for (int i = 0; i < sz; i++) {
                TreeNode curr = q.poll();
                if (curr.left == null && curr.right == null) {
                    return depth;
                }
                // 将相邻节点加入队列
                if (curr.left != null) {
                    q.offer(curr.left);
                }
                if (curr.right != null) {
                    q.offer(curr.right);
                }
            }

            depth++;
        }

        return depth;
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
      }
  }
