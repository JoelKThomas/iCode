package com.competitive.array.twonumbersum;

public class TwoNumberSumUsingLoop {
    // O(n^2) time | O(N) space
    public static int[] twoNumberSumUsingLoop(int[] arr, int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            int firstNum = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                int secondNum = arr[j];
                if (firstNum + secondNum == target) {
                    return new int[]{firstNum, secondNum};
                }
            }

        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, -4, 8, 11, 1, -1, 6};
        int target = 10;
        int[] result = twoNumberSumUsingLoop(arr, target);
        System.out.println(result[0] +" + "+ result[1] +" = "+ target);
    }
}
