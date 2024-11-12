package com.algoexpert.string;

public class ReverseStringPreserveSpace {
    public static char[] reverseString(String input) {
        int length = input.length();
        char[] result = new char[length];
        String str =  input.replace(" ", "");
        int j = str.length();

        for (int i=0; i < length; i++) {
            if (input.charAt(i) == ' '){
                result[i]= input.charAt(i);
            } else {
                j--;
                result[i] = str.charAt(j);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseString("I am joel"));
    }
}
