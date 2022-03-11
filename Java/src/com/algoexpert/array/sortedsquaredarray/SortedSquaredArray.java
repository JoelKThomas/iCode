package com.algoexpert.array.sortedsquaredarray;

import java.util.Arrays;

public class SortedSquaredArray {

    public static int[] sortedSquaredArray(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i] * array[i];
        }
        Arrays.sort(result);
        return result;

    }

    public static void main(String[] args) {
        int[] arrayList = new int[]{1, 2, 3, 5, 6, 8, 9};
        int[] result = sortedSquaredArray(arrayList);
        for (int i : result) {
            System.out.print(i + " ");
        }

    }
}
