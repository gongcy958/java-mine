package com.yy.template;

/**
 * @author gongcy
 * @date 2023/3/13 7:12 下午
 * @Description
 */
public class UF {

    // 记录连通分量
    private int count;

    // 节点x的父节点是parent[x]
    private int[] parent;

    private int[] size;

    // 构造函数、n为图的节点总数
    public UF(int n){
        // 一开始互不连通
        this.count = n;
        // 父节点指针初始指向自己
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        if (rootP == rootQ) {
            return;
        }

        // 将两棵树合并为一颗
//        parent[rootP] = rootQ;

        // 小树到大树下面，较平衡
        if (size[rootP] > size[rootQ]) {
            parent[rootQ] = rootP;
            size[rootP] += size[rootQ];
        }else {
            parent[rootP] = rootQ;
            size[rootQ] += size[rootP];
        }
        count--;
    }

    // 返回某个节点x的根节点
    private int find(int x) {
        // 根节点的 parent[x] == x
        while (parent[x] != x) {
            // 这段代码进行路径压缩
            parent[x] = parent[parent[x]];
            x = parent[x];
        }
        return x;
    }

    public boolean connected(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        return rootP == rootQ;
    }
}
