package com.leetcode.binarytee.dfs;

public class PathSumIII {


    public static int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;
        return dfs(root, targetSum, 0)
                + pathSum(root.left, targetSum)
                + pathSum(root.right, targetSum);
    }

    public static int dfs(TreeNode node, long targetSum, long currentSum){
        if (node == null) return 0;
        currentSum+= node.val;
        int noOfPaths = (currentSum == targetSum) ? 1 : 0;
        noOfPaths += dfs(node.left, targetSum, currentSum);
        noOfPaths += dfs(node.right, targetSum, currentSum);
        return noOfPaths;

    }


    public static TreeNode createTreeNode(Integer[] arr, int index){
        if (index >= arr.length || arr[index] == null) {
            return null;
        }
        TreeNode root = new TreeNode(arr[index]);
        root.left = createTreeNode(arr, 2 * index + 1);  // Left child index in array
        root.right = createTreeNode(arr, 2 * index + 2); // Right child index in array
        return root;
    }


    public static void main(String[] args) {

        Integer[] values2 = {1000000000,1000000000,null,294967296,null,1000000000,null,1000000000,null,1000000000};
        TreeNode root2 =  createTreeNode(values2, 0);

        System.out.println("Target Sum : "  + pathSum(root2, 0));


    }
}
