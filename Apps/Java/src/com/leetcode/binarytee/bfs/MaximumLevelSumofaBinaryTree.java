package com.leetcode.binarytee.bfs;


import java.util.LinkedList;
import java.util.Queue;

public class MaximumLevelSumofaBinaryTree {

    public static int maxLevelSum(TreeNode root) {
     int result = 0;
     int maxSum = Integer.MIN_VALUE;

     int currentLevel = 0;

     if(root == null) return 0;

     Queue<TreeNode> queue = new LinkedList<>();

     queue.offer(root);


     while(!queue.isEmpty()){
         int size = queue.size();
         int currentSum = 0;
         currentLevel++;
         for(int i = 0; i < size; i++){
             TreeNode node = queue.poll();
             currentSum+= node.val;

             if(node.left != null)  queue.offer(node.left);
             if(node.right !=null)  queue.offer(node.right);
         }

         if(currentSum > maxSum){
             maxSum = currentSum;
             result = currentLevel;
         }
     }
     return result;
    }
    public static TreeNode createTreeNode(Integer[] array, int index){



        if(index >= array.length || array[index] == null){
             return null;
        }

        TreeNode root = new TreeNode(array[index]);

        root.left = createTreeNode(array, 2* index + 1);
        root.right = createTreeNode(array, 2* index + 2);

        return root;
    }

    public static void main(String[] args) {
        Integer[] values = new Integer[]{-100,-200,-300,-20,-5,-10,null};

        TreeNode root = createTreeNode(values, 0);

        System.out.println(maxLevelSum(root));
    }
}
