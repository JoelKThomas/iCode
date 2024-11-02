package com.leetcode.binarytee.binarysearchtree;

public class DeleteNodeInABST {


    public static TreeNode deleteNode(TreeNode root, int key) {

        TreeNode dummy = root;
        TreeNode node = searchNode(root, key);ccc.mmmkhkczafaaaaxcccccc,,,,,,,,,,asswhdbbyjjfjgxfkovlh aasdwaasdw   1111111111111
        return dummy;
    }


    public static TreeNode searchNode(TreeNode node, int key){
        if(node == null){
            return null;
        }
        if(node.val == key){
            return node;
        } else if (node.val > key) {
            return searchNode(node.left, key);
        } else {
            return searchNode(node.right, key);
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

        Integer[] values = new Integer[]{5,3,6,2,4,null,7};
        TreeNode root = createBinaryTree(values,0);

        int key = 3;

        TreeNode result = deleteNode(root, key);
        if(result != null){
            result.printPreOrder();
        } else {
            System.out.println(result);
        }

    }


}
