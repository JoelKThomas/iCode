package com.leetcode.binarytee.dfs;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {


    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaf1 = dfs(root1, new ArrayList<>());
        List<Integer> leaf2 = dfs(root2, new ArrayList<>());
        return leaf1.equals(leaf2);
    }


    List<Integer> dfs(TreeNode node, List<Integer> leafList  ){
        if(node.left == null && node.right == null){
            leafList.add(node.val);
            return leafList;
        }

        if (node.left != null) {
            dfs(node.left, leafList);
        }

        if (node.right != null){
            dfs(node.right, leafList);
        }
        return leafList;
    }


        public static void main(String[] args) {
        TreeNode root1 = new TreeNode(3,
                new TreeNode(5,
                        new TreeNode(6, null, null),
                        new TreeNode(2,
                                new TreeNode(7, null, null),
                                new TreeNode(4, null, null))),
                new TreeNode(1,
                        new TreeNode(9, null, null),
                        new TreeNode(8, null, null)));

        TreeNode root2 = new TreeNode(3,
                new TreeNode(5,
                        new TreeNode(6, null, null),
                        new TreeNode(7, null, null)),
                new TreeNode(1,
                        new TreeNode(4, null, null),
                        new TreeNode(2,
                                new TreeNode(9, null, null),
                                new TreeNode(8, null, null))));

            LeafSimilarTrees leafSimilarTrees = new LeafSimilarTrees();
            leafSimilarTrees.leafSimilar(root1, root2);


    }
}
