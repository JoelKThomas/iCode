package com.codingexams.google.SpeedTyping;
import java.util.*;

public class SpeedTyping {

    public static String speedTyping(char[] target, char[] input) {
        int i = 0, j = 0;
        int count = 0;
        while (j < input.length) {
            if (i < target.length && target[i] == input[j] ) {
                i++;
                j++;
            } else {
                count++;
                j++;
            }
        }
        if (i == target.length) {
            return String.valueOf(count);
        } else {
            return "IMPOSSIBLE";
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = Integer.parseInt(s.nextLine());

        char[] input, target;
        for (int i = 1; i <= N; i++) {
            target = s.nextLine().toCharArray();
            input = s.nextLine().toCharArray();
            System.out.println("Case #"+ i +": " +speedTyping(target, input));
        }
    }
}

