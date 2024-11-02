package com.codingexams.amadeus;

public class SortAscending {

    public static void main(String[] args) {
        int[] array = new int[]{12, 10, 15, 11, 14, 13, 16};

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


    }
}

