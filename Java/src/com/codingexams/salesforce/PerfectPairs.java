package com.codingexams.salesforce;

public class PerfectPairs {

    public static int countPerfectPairs(int[] array) {
        int n = array.length;
        int perfectPairsCount = 0;

        // Loop through each pair of elements
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int x = array[i];
                int y = array[j];

                int minModulus = Math.min(Math.abs(x - y), Math.abs(x + y));
                int maxModulus = Math.max(Math.abs(x - y), Math.abs(x + y));

                int minXY = Math.min(Math.abs(x), Math.abs(y));
                int maxXY = Math.max(Math.abs(x), Math.abs(y));

                // Check if the pair (x, y) is perfect
                if (minModulus <= minXY && maxModulus >= maxXY) {
                    perfectPairsCount++;
                }
            }
        }
        return perfectPairsCount;
    }

    public static void main(String[] args) {
        int[] array = {2, 5, -3};
        int n = array.length;

        int result = countPerfectPairs(array);
        System.out.println("Number of perfect pairs: " + result);
    }
}

