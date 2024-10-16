package com.leetcode.binarytee.bfs;

public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public void printPreOrder() {
        System.out.print(this.val + " ");  // Print current node (this)
        if (this.left != null) {
            this.left.printPreOrder();     // Recur on left child
        }
        if (this.right != null) {
            this.right.printPreOrder();    // Recur on right child
        }
    }

}
