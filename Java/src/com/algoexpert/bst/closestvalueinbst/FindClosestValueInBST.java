package com.algoexpert.bst.closestvalueinbst;

public class FindClosestValueInBST {

    public static int findClosestValueInBst(BST tree, int target) {
        return findClosestValueInBstHelper(tree, target, tree.value);
    }

    public static int findClosestValueInBstHelper(BST tree, int target, int closest) {
        if (Math.abs(target - tree.value) < Math.abs(target - closest)) {
            closest = tree.value;
        }
        if (target < tree.value && tree.left != null) {
            return findClosestValueInBstHelper(tree.left, target, closest);
        } else if (target > tree.value && tree.right != null) {
            return findClosestValueInBstHelper(tree.right, target, closest);
        } else {
            return closest;
        }
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
        var root = new BST(10);
        root.left = new BST(5);
        root.left.left = new BST(2);
        root.left.left.left = new BST(1);
        root.left.right = new BST(6);
        root.right = new BST(15);
        root.right.left = new BST(13);
        root.right.left.right = new BST(14);
        root.right.right = new BST(22);

        System.out.println("The Closest Value in the BST is :" + findClosestValueInBst(root, 7) );

    }
}
