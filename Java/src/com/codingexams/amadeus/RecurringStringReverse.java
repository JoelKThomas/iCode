package com.codingexams.amadeus;

import java.util.Scanner;

public class RecurringStringReverse {

    static String str = "";

    public static void function(char[] input, int index) {
        if (index < input.length - 1) {
            int nextIndex = index + 1;
            function(input, nextIndex);
        }
        str = str + input[index];
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        char[] input = s.nextLine().toCharArray();
        function(input, 0);
        System.out.println(str);
    }
}

