package com.leetcode.binarytee.bfs;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {


    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if(root == null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();

            TreeNode rightMost = null;
            for(int i =0; i < size ; i++){
                TreeNode node = queue.poll();
                rightMost = node;

                if(node.left != null){
                    queue.offer(node.left);
                }

                if(node.right != null){
                    queue.offer(node.right);
                }
            }

            result.add(rightMost.val);
        }

     return result;

    }


    public static TreeNode createTreeNode(Integer[] array, int index){
        if(index >= array.length || array[index] ==  null){
            return null;
        }
        TreeNode root = new TreeNode(array[index]);
        root.left = createTreeNode(array, 2 * index + 1);
        root.right = createTreeNode(array, 2 * index + 2);
        return root;
    }


    public static void main(String[] args) {
        Integer[] values = new Integer[]{1,2,3,4};
        TreeNode root = createTreeNode(values, 0);

        System.out.println(rightSideView(root));
    }
}
