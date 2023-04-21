package com.yy.template;

//import com.sun.corba.se.impl.orbutil.graph.Graph;

import java.util.List;

/**
 * @author gongcy
 * @date 2023/3/16 6:40 上午
 * @Description
 */
public class GraphTemplate {

    // 临接表 有向无权图
    List<Integer>[] graph;

    // 临接矩阵 有向无权图
    boolean[][] matrix;

    // 临接表 有向加权图
    List<int[]>[] graphQ;

    // 临界矩阵 有向加权图
    int[][] matrixQ;

    // 多叉树遍历框架
    void traverse(DataStructureTemplate.TreeNewNode root) {
        if (root == null) {
            return;
        }

        // 前序位置
        for (DataStructureTemplate.TreeNewNode child : root.children) {
            traverse(child);
        }
    }

    // 图遍历

    // 记录被遍历过的节点
    boolean[] visited;

    // 记录从起点到当前节点的路径
    boolean[] onPath;

    // 图遍历框架
//    void traverseGraph(Graph graph, int s) {
//        if (visited[s]) {
//            return;
//        }
//
//        visited[s] = true;
//
//        onPath[s] = true;
//
//        for (int neighbor : graph.neighbors) {
//            traverseGraph(graph,neighbor);
//        }
//
//        onPath[s] = false;
//    }



}
