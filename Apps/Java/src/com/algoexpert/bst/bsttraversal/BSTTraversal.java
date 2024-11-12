package com.algoexpert.bst.bsttraversal;

import java.util.ArrayList;
import java.util.List;

public class BSTTraversal {
    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

    }
    public static List<Integer> inOrderTraverse(BST tree, List<Integer> array) {
        // Write your code here.
        if(tree == null){
            return array;
        }

        inOrderTraverse(tree.left,  array);
        array.add(tree.value);
        inOrderTraverse(tree.right,  array);

        return array;
    }

    public static List<Integer> preOrderTraverse(BST tree, List<Integer> array) {
        if(tree == null){
            return array;
        }

        array.add(tree.value);
        preOrderTraverse(tree.left,  array);
        preOrderTraverse(tree.right,  array);
        return array;
    }

    public static List<Integer> postOrderTraverse(BST tree, List<Integer> array) {
        if(tree == null){
            return array;
        }

        postOrderTraverse(tree.left,  array);
        postOrderTraverse(tree.right,  array);
        array.add(tree.value);

        return array;
    }


    public static void main(String[] args) {
        var root = new BST(10);
        root.left = new BST(5);
        root.left.left = new BST(2);
        root.left.left.left = new BST(1);
        root.left.right = new BST(5);
        root.right = new BST(15);
        root.right.right = new BST(22);

        System.out.println(inOrderTraverse(root, new ArrayList<>()));
        System.out.println(preOrderTraverse(root, new ArrayList<>()));
        System.out.println(postOrderTraverse(root, new ArrayList<>()));


    }
}

