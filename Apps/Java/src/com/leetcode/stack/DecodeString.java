package com.leetcode.stack;

import java.util.Stack;

public class DecodeString {

    public String decodeString(String s) {

        Stack<StringBuilder> stringStack = new Stack<>();
        Stack<Integer> multiplierStack = new Stack<>();

        StringBuilder currentString = new StringBuilder();

        int k =0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                k = k * 10 + (c-'0');
            } else if (c == '[') {
                multiplierStack.push(k);
                stringStack.push(currentString);
                currentString = new StringBuilder();
                k =0;
            } else if (c == ']') {

                int repeatTimes  = multiplierStack.pop();
                StringBuilder decodedString = stringStack.pop();
                for(int i =0; i < repeatTimes; i++){
                    decodedString.append(currentString);
                }
                currentString = decodedString;

            } else {
                currentString.append(c);
            }
        }

        return currentString.toString();
    }

    public static void main(String[] args) {
        DecodeString decodeString1 = new DecodeString();

//        String input = "2[abc]3[cd]ef";
//        System.out.println(decodeString1.decodeString(input));
        String input2 = "3[a2[c]]";
        System.out.println(decodeString1.decodeString(input2));


    }
}
