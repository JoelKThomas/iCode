package com.algorithm;

public class KadaneAlgorithm {

    public static int kadaneAlgorithm(int[] array) {
        // Initialize the maximum sums
        int maxEndingHere = array[0];
        int maxSoFar = array[0];

        // Iterate through the array starting from the second element
        for (int i = 1; i < array.length; i++) {
            int num = array[i];

            // Update the max sum ending at the current position
            maxEndingHere = Math.max(num, maxEndingHere + num);

            // Update the global max sum so far
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        // Test case: Example usage of the Kadane’s Algorithm
        int[] inputArray = {3, 5, -9, 1, 3, -2, 3, 4, 7, 2, -9, 6, 3, 1, -5, 4};
        int maxSum = kadaneAlgorithm(inputArray);

        // Print the result
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}
