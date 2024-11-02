package com.leetcode.binarytee.dfs;

public class LowestCommonAncestorofaBinaryTree {

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
         return dfs(root,p,q);
    }

    public static TreeNode dfs(TreeNode node, TreeNode p, TreeNode q){
        if(node == null|| node.val == p.val || node.val == q.val){
            return node;
        }

        TreeNode leftFound = dfs(node.left, p, q);
        TreeNode rightFound = dfs(node.right, p, q);

        if(leftFound != null && rightFound != null){
            return node;
        }

        return leftFound != null ? leftFound : rightFound;

    }






    public static void main(String[] args) {

        TreeNode p = new TreeNode(5,
                new TreeNode(6, null, null),
                new TreeNode(2,
                        new TreeNode(7, null, null),
                        new TreeNode(4, null, null)));

        TreeNode q = new TreeNode(1,
                new TreeNode(0, null, null),
                new TreeNode(8, null, null));

        TreeNode root = new TreeNode(3, p, q);


        TreeNode result = lowestCommonAncestor(root, root.right.left, root.right.right
        );

        System.out.println("Root  = " + result.val);

    }
}
