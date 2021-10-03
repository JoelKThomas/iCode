package com.codingexams.goldmansachs.q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NumberChecker {
    static String findQualifiedNumbers(int[] numberArray) {
        ArrayList<Integer> list = new ArrayList<>();
        //default set result as -1
        String result = "-1";
        for (int array : numberArray) {
            String str = Integer.toString(array);
            //check the string contains 1, 2, 3 for each number
            if (str.contains("1") && str.contains("2") && str.contains("3")) {
                list.add(array);
            }
        }
        //sort the numbers in ascending order
        Collections.sort(list);
        if (!list.isEmpty()) {
            result = list.stream().map(Object::toString).collect(Collectors.joining(","));
        }
        return result;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(findQualifiedNumbers(array));
    }
}
