package com.leetcode.binarytee.dfs;

public class CountGoodNodesinBinaryTree {

    public int goodNodes(TreeNode root) {
        return dfs(root, root.val);
    }

    int dfs(TreeNode node, int maxNode){
        if(node == null){
            return 0;
        }
        int goodNodes = 0;
        if(node.val >= maxNode){
            maxNode = node.val;
            goodNodes++;
        }
        goodNodes+= dfs(node.left, maxNode);
        goodNodes+= dfs(node.right, maxNode);
        return goodNodes;
    }

    public static void main(String[] args) {


        TreeNode root = new TreeNode(3,
                new TreeNode(1,
                        new TreeNode(3, null, null),
                        null),
                new TreeNode(4,
                        new TreeNode(1, null, null),
                        new TreeNode(5, null, null)));

        CountGoodNodesinBinaryTree countGoodNodesinBinaryTree = new CountGoodNodesinBinaryTree();

        System.out.println(countGoodNodesinBinaryTree.goodNodes(root));


    }
}
