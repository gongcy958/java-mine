package com.yy.template;


/**
 * @author gongcy
 * @date 2023/3/14 11:03 上午
 * @Description
 */
public class BinaryTreeTemplate {

//    void traverse(TreeNode root) {
//        // 前序位置
//        traverse(root.left);
//        // 中序位置
//        traverse(root.right);
//        // 后续位置
//    }
//
//    class TreeNode{
//        int val;
//        TreeNode left,right;
//
//        public TreeNode(int val) {
//            this.val = val;
//        }
//    }
//
//    int res = Integer.MIN_VALUE;
//    int oneSideMax(TreeNode root){
//        if (root == null) {
//            return 0;
//        }
//
//        int left = max(0, oneSideMax(root.left));
//        int right = max(0,oneSideMax(root.right));
//
//        res = Math.max(res,left + right + root.val);
//        return Math.max(left,right) + root.val;
//    }
//
//    TreeNode build(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
//        // 前序位置 寻找左右子树的索引
//        if (preStart > preEnd) {
//            return null;
//        }
//
//        int rootVal = preorder[preStart];
//        int index = 0;
//        for (int i = inStart; i <= inEnd; i++) {
//            if (inorder[i] == rootVal) {
//                index = i;
//                break;
//            }
//        }
//
//        int leftSize = index - inStart;
//        TreeNode root = new TreeNode(rootVal);
//
//        // 递归构造左右子树
//        root.left = build(preorder,preStart + 1,preStart + leftSize,inorder,inStart,index - 1);
//        root.right = build(preorder,preStart + leftSize + 1,preEnd,inorder,index + 1,inEnd);
//
//        return root;
//    }
//
//    int res_2 = 0;
//    int rank = 0;
//    void traverseK(TreeNode root,int k) {
//        if (root == null) {
//            return;
//        }
//
//        traverseK(root.left,k);
//
//        rank++;
//        if (k == rank) {
//            res_2 = root.val;
//            return;
//        }
//
//        traverseK(root.right,k);
//
//    }
}
