package com.leetcode.binarytee.dfs;


public class LongestZigZagPathinaBinaryTree {

    public static int longestZigZag(TreeNode root) {
        return Math.max(
                dfs(root, true, 0),
                dfs(root, false, 0));

    }


    public static int dfs(TreeNode node,  boolean isLeft, int currentLength){
        if(node == null) return currentLength-1;
        if (isLeft) {
            return Math.max(
                    dfs(node.right, false, currentLength + 1),
                    dfs(node.left, true, 1));
        } else {
            return Math.max(
                    dfs(node.left, true, currentLength + 1),
                    dfs(node.right, false, 1));
        }
    }


    public static TreeNode createTreeNode(Integer[] arr, int index) {
        if (index >= arr.length || arr[index] == null) {
            return null;
        }
        TreeNode root = new TreeNode(arr[index]);
        root.left = createTreeNode(arr, 2 * index + 1);  // Left child index in array
        root.right = createTreeNode(arr, 2 * index + 2); // Right child index in array
        return root;
    }


    public static void main(String[] args) {
        Integer[] values = new Integer[]{1,1,1,null,1,null,null,1,1,null,1};
        TreeNode root = createTreeNode(values, 0);

        System.out.println(longestZigZag(root));


    }
}
