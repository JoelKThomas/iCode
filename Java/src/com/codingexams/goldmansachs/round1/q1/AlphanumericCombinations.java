//NOT OPTIMISED 1 Test case Failed- Time Exceeded Error
package com.codingexams.goldmansachs.round1.q1;

import java.util.Scanner;

public class AlphanumericCombinations {

    public static long findPossibleCombinations(int[] inputArray, int i, long count) {

        if (i == inputArray.length) {
            return count + 1;
        } else if (inputArray[i] == 0) {
            return count;
        }
        int sum = 0;
        for (int j = i; j <= Integer.min(i + 1, inputArray.length - 1); j++) {
            sum = (sum * 10) + inputArray[j];
            if (sum > 0 && sum <= 26) {
                count = findPossibleCombinations(inputArray, j + 1, count);
            }
        }
        return count;
    }

    public static long calculatePossibleCombinations(String inputStr) {

        String[] inputStringArray = inputStr.split("");
        long result = 0;
        int[] inputArray = new int[inputStringArray.length];
        for (int i = 0; i < inputStringArray.length; i++) {
            inputArray[i] = Integer.parseInt(inputStringArray[i]);
        }
        return findPossibleCombinations(inputArray, 0, result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string S containing characters from 0-9");
        String str = sc.next();
        System.out.println(calculatePossibleCombinations(str));
    }
}
