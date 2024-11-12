
package com.algoexpert.array.nonconstructiblechange;

import java.util.Arrays;

public class NonConstructibleChange {

    public static int nonConstructibleChange(int[] coins) {
        int maxChange = 0;
        Arrays.sort(coins);
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= maxChange + 1) {
                maxChange += coins[i];
            } else {
                return maxChange + 1;
            }
        }
        return maxChange+1;
    }


    public static void main(String[] args) {
        int[] input = new int[]{5, 7, 1, 1, 2, 3, 22, 20, 31};
        var actual = nonConstructibleChange(input);

        System.out.println("Change: " + actual);
    }
}
