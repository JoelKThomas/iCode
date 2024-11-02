package com.competitive.array.twonumbersum;

import java.util.HashSet;
import java.util.Set;

public class TwoNumberSumUsingSet {
    // O(n^2) time | O(N) space
    public static int[] twoNumberSumUsingLoop(int[] arr, int target) {
        Set<Integer> nums = new HashSet<Integer>();
        for (int num : arr) {
            int potentialMatch = target - num;
            if (nums.contains(potentialMatch)) {
                return new int[]{potentialMatch, num};
            } else {
                nums.add(num);
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
