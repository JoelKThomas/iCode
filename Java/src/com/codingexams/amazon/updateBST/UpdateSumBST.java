package com.codingexams.amazon.updateBST;

public class UpdateSumBST {
    private static int sum = 0;

    static class BST {

        BST left;
        BST right;
        int value;

        public BST(int value) {
            this.value = value;
        }

    }

    public static BST updateSum(BST tree) {
        if (tree == null) {
            return null;
        }

        updateSum(tree.right);
        sum += tree.value;
        tree.value = sum;
        updateSum(tree.left);
        return tree;
    }

    public static void printInOrderBST(BST tree) {
        if (tree == null) {
            return;
        }

        printInOrderBST(tree.left);
        System.out.print(tree.value + " ");
        printInOrderBST(tree.right);
    }

    public static void main(String arg[]) {
        var root = new BST(5);
        root.left = new BST(3);
        root.right = new BST(8);
        root.left.left = new BST(1);
        root.left.right = new BST(4);
        root.right.left = new BST(6);
        root.right.right = new BST(9);
        System.out.println("Before updating");
        printInOrderBST(root);

        var result = updateSum(root);
        System.out.println("\nAfter updating");

        printInOrderBST(result);

    }


}


