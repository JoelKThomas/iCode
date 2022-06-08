package com.codingexams.google.ChallengeNine;

import java.util.Scanner;

public class ChallengeNine {

    public static int challengeNine(String input, int index) {
        int current, i, target;
        if (index == input.length()) {
            target = 10;
        } else {
            target = Integer.parseInt(String.valueOf(input.charAt(index)));
        }
        for (i = 1; i < target; i++) {
            String s = input.substring(0, index) + i + input.substring(index);
            current = Integer.parseInt(s);
            if (current % 9 == 0) {
                return current;
            }
        }
        if (index < input.length()) {
            return challengeNine(input, ++index);
        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = Integer.parseInt(s.nextLine());

        for (int i = 1; i <= N; i++) {
            String input = s.nextLine();
            System.out.println("Case #"+ i +": " +challengeNine(input,0));
        }
    }
}

