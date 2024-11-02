package com.competitive.bst.kthlargestvalue;

import java.util.ArrayList;
import java.util.Arrays;

public class KthLargestValue {

    public static int findKthLargestValueInBst(BST tree, int k) {
        ArrayList<Integer> sortedList = new ArrayList<>();
        inOrderTraversal(tree, sortedList);
        return sortedList.get(sortedList.size() -k);
    }

    public static void inOrderTraversal(BST tree, ArrayList<Integer> sortedList) {
        if(tree == null) return;
        inOrderTraversal(tree.left, sortedList);
        sortedList.add(tree.value);
        inOrderTraversal(tree.right, sortedList);
    }

    public static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        var root = new BST(15);
        root.left = new BST(5);
        root.right = new BST(20);
        root.left.left = new BST(2);
        root.left.right = new BST(5);
        root.right.left = new BST(17);
        root.right.right = new BST(22);
        root.left.left.left = new BST(1);
        root.left.left.right = new BST(3);

        System.out.println(findKthLargestValueInBst(root, 3));
    }
}
