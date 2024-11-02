package com.leetcode.binarytee.dfs;

public class MaximumDepthofBinaryTree {

    public static int maxDepth(TreeNode root) {
      return dfs(root, 0);
    }

    public static int dfs(TreeNode root, int maxLength) {
        if(root == null){
            return maxLength;
        }

        return Math.max(dfs(root.left, maxLength), dfs(root.right, maxLength)) + 1;
    }




    public static void main(String[] args) {

        TreeNode root = new TreeNode(3,
                new TreeNode(9,null, null),
                new TreeNode(20,
                        new TreeNode(15, null, null),
                        new TreeNode(7, null, null)));

        root.printPreOrder();

        System.out.println("\nMaximum Depth : " +  maxDepth(root));
    }

}
