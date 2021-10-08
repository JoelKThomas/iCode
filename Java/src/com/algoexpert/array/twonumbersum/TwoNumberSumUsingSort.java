package com.algoexpert.array.twonumbersum;

import java.util.Arrays;

public class TwoNumberSumUsingSort {
    // O(nlogn) time | O(1) space
    public static int[] twoNumberSumUsingLoop(int[] arr, int target) {
        Arrays.sort(arr);
        int left= 0;
        int right = arr.length-1;
        for(int i = 0; i < arr.length; i++) {
            int currentSum=arr[left] + arr[right];
            if(currentSum == target){
                return new int[]{arr[left], arr[right]};
            } else if(currentSum > target){
                right--;
            } else {
                left ++;
            }

        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, -4, 8, 11, 1, -1, 6};
        int target = 10;
        int[] result = twoNumberSumUsingLoop(arr, target);
        System.out.println(result[0] + " + " + result[1] + " = " + target);
    }
}
