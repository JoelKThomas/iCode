package com.codingexams.google.ChallengeNine;

import java.util.Scanner;

public class ChallengeNineAns2 {

    public static String challengeNine(String input) {
        int sum = 0;
        char[] inputArray = input.toCharArray();
        for (int i = 0; i < inputArray.length; i++) {
                int a = inputArray[i] - 48;
                sum  += a;
        }
        int value = 9 - sum%9;
       for(int i=0; i< inputArray.length; i++ ){
           if(value < Integer.parseInt(String.valueOf(inputArray[i]))){
              return input.substring(0, i) + value + input.substring(i);
           }
       }
        return input+value;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = Integer.parseInt(s.nextLine());

        for (int i = 1; i <= N; i++) {
            String input = s.nextLine();
            System.out.println("Case #"+ i +": " + challengeNine(input));
        }
    }
}
