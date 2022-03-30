
// * Update BST Tree and set each node with sum of all greater elements

//       5
//    3	   8
// 1   4  6   9

package com.codingexams.amazon.updateBST;

public class UpdateSumBST {
    static class BST {

        BST left;
        BST right;
        int value;
        public BST(int value) {
            this.value = value;
        }

    }
    public static BST updateSum(BST tree) {
        return tree;
    }
    public static void main(String arg[]) {
        var root = new BST(5);
        root.left = new BST(3);
        root.right = new BST(8);
        root.left.left = new BST(1);
        root.left.right = new BST(4);
        root.right.left = new BST(6);
        root.right.right = new BST(9);

        updateSum(root);

    }
}
