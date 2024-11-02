package com.codingexams.nielsen;
import java.util.*;

public class MinimalSubarrayLength {
    public static int minSubArrayLen(int target, List<Integer> nums) {
        int n = nums.size();
        int minLength = Integer.MAX_VALUE; // Initialize with max value
        int left = 0; // Left pointer for the sliding window
        int sum = 0;  // Current window sum

        // Traverse through the array with a sliding window
        for (int right = 0; right < n; right++) {
            sum += nums.get(right); // Expand the window by adding the right element

            // Shrink the window until the sum is less than the target
            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1); // Update minimum length
                sum -= nums.get(left); // Shrink the window from the left
                left++; // Move the left pointer forward
            }
        }

        // If no valid subarray was found, return 0
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 3, 1, 2, 4, 3);
        int target = 7;
        int result = minSubArrayLen(target, nums);
        System.out.println("Minimal length of the subarray: " + result);
    }
}
