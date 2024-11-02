package com.leetcode.binarytee.binarysearchtree;

public class SearchInABinarySearchTree {

    public static TreeNode searchBST(TreeNode root, int val) {
        if(root == null){
            return null;
        }
        if(root.val == val){
            return root.left;
        } else if(root.val < val){
            return searchBST(root.right, val);
        } else {
            return searchBST(root.left, val);
        }
    }

    public static  TreeNode createBinaryTree(Integer[] array, int index) {

    if (index >= array.length || array[index] == null ){
        return null;
    }
        TreeNode root = new TreeNode(array[index]);
        root.left = createBinaryTree(array, 2 * index + 1);
        root.right = createBinaryTree(array, 2 * index + 2);
        return root;
    }

    public static void main(String[] args) {

        Integer[] values = new Integer[]{4,2,7,1,3};
        int val =5;
        TreeNode root = createBinaryTree(values,0);


        TreeNode result = searchBST(root, val);
        if(result != null){
            result.printPreOrder();
        } else {
            System.out.println(result);
        }

    }
}
