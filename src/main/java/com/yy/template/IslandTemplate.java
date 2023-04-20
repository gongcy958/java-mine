package com.yy.template;

/**
 * @author gongcy
 * @date 2023/4/9 10:08 上午
 * @Description
 */
public class IslandTemplate {

    // 二叉树遍历框架
    void traverse(TreeNode root) {
        traverse(root.left);
        traverse(root.right);
    }

    void dfs(int[][] grid, int i, int j, boolean[][] visited) {
        int m = grid.length,n = grid[0].length;
        if (i < 0 || j < 0 || i >= m || j >= n) {
            return;
        }

        if (visited[i][j]) {
            return;
        }

        visited[i][j] = true;
        dfs(grid,i - 1,j,visited);
        dfs(grid,i + 1,j,visited);
        dfs(grid,i,j - 1,visited);
        dfs(grid,i,j+1,visited);
    }

    int[][] dirs = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};


}
