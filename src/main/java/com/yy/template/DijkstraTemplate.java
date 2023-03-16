package com.yy.template;

import java.util.*;

/**
 * @author gongcy
 * @date 2023/3/16 9:29 上午
 * @Description
 */
public class DijkstraTemplate {

    void levelTraverse(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int depth = 1;
        while (!q.isEmpty()) {
            int sz = q.size();

            for (int i = 0; i < sz; i++) {
                TreeNode curr = q.poll();
                // 节点在第几层

                if (curr.left != null) {
                    q.offer(curr.left);
                }

                if (curr.right != null) {
                    q.offer(curr.right);
                }


            }

            depth++;
        }
    }

//    int BFS(TreeNode start) {
//        Queue<TreeNode> q = new LinkedList<>();
//        Set<TreeNode> visited = new HashSet<>();
//
//        q.offer(start);
//        visited.add(start);
//
//        // 记录搜索的步数
//        int step = 0;
//        while (!q.isEmpty()) {
//            int sz = q.size();
//            for (int i = 0; i < sz; i++) {
//
//                TreeNode curr = q.poll();
//
//                for (TreeNode x : curr.adj()) {
//                    if (!visited.contains(x)) {
//                        q.offer(x);
//                        visited.add(x);
//                    }
//                }
//            }
//            step++;
//        }
//    }

    // 返回节点 from 到 to 之间的边的权重
    int weight(int from,int to){
        return 0;
    }

    // 输入节点s 返回s的相邻节点
    List<Integer> adj(int s) {
        return null;
    }

    // 输入一幅图和一个起点start，计算start到其他节点的最短距离
    int[] dijkstra(int start, List<Integer>[] graph) {
        // 图中节点的个数
        int V = graph.length;

        // 记录最短路径的权重，理解为dp table
        // 定义：distTo[i]的值就是节点 start到达节点 i 的最短路径权重
        int[] distTo = new int[V];

        // 求最小值 所以 dp table 初始化为正无穷
        Arrays.fill(distTo,Integer.MAX_VALUE);
        // base case start到start的最短距离就是0
        distTo[start] = 0;

        // 优先级队列 distFromStart 较小的排在前面
        Queue<State> pq = new PriorityQueue<>((a,b) ->{
            return a.distFromStart - b.distFromStart;
        });

        // 从起点start开始进行BFS
        pq.offer(new State(start,0));

        while (!pq.isEmpty()) {
            State curState = pq.poll();
            int curNodeID = curState.id;
            int curDistFromStart = curState.distFromStart;

            if (curDistFromStart > distTo[curNodeID]) {
                continue;
            }

            for (int nextNodeID : adj(curNodeID)) {
                int distToNextNode = distTo[curNodeID] + weight(curNodeID,nextNodeID);
                if (distTo[nextNodeID] > distToNextNode) {
                    distTo[nextNodeID] = distToNextNode;
                    pq.offer(new State(nextNodeID,distToNextNode));
                }
            }
        }

        return distTo;
    }
}

class State{
    int id;
    // 从 start 节点到当前节点的距离
    int distFromStart;

    State(int id, int distFromStart) {
        this.id = id;
        this.distFromStart = distFromStart;
    }
}
