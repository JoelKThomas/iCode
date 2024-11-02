package com.competitive.bst.kthlargestvalue;

public class KthLargestValueReverseInOrder {

    public static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }

    static class TreeInfo {
        public int noOfVisitedNodes;
        public int currentNodeValue;

        public TreeInfo(int noOfVisitedNodes, int currentNodeValue) {
            this.noOfVisitedNodes = noOfVisitedNodes;
            this.currentNodeValue = currentNodeValue;
        }

    }

    public static int findKthLargestValueInBst(BST tree, int k) {
        TreeInfo treeInfo = new TreeInfo(0, -1);
        reverseInOrderTraversal(treeInfo, tree, k);
        return treeInfo.currentNodeValue;
    }

    public static void reverseInOrderTraversal(TreeInfo treeInfo, BST tree, int k) {
        if (tree == null || treeInfo.noOfVisitedNodes >= k) return;
        reverseInOrderTraversal(treeInfo, tree.right, k);
        if (treeInfo.noOfVisitedNodes < k) {
            treeInfo.noOfVisitedNodes++;
            treeInfo.currentNodeValue = tree.value;
        }
        reverseInOrderTraversal(treeInfo, tree.left, k);
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
