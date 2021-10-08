package com.algoexpert.BST.closestvalueinbst;

public class FindClosestValueInBSTUsingWhile {

    public static int findClosestValueInBst(BST tree, int target) {
        return findClosestValueInBstHelper(tree, target, tree.value);
    }

    public static int findClosestValueInBstHelper(BST tree, int target, int closest) {
        BST currentNode = tree;
        while(currentNode != null){
            if (Math.abs(target - currentNode.value) < Math.abs(target - closest)) {
                closest = currentNode.value;
            }
            if (target <  currentNode.value) {
                currentNode = currentNode.left;
            } else if (target >  currentNode.value) {
                currentNode = currentNode.right;
            } else {
                break;
            }
        }
        return closest;
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

        System.out.println("The Closest Value in the BST is :" + findClosestValueInBst(root, 11) );

    }
}
