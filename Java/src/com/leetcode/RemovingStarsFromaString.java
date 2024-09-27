package com.leetcode;

import java.util.Stack;

public class RemovingStarsFromaString {

    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '*'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            } else {
                stack.push(c);
            }
        }

        StringBuilder s1 = new StringBuilder();
        for(int i = 0; i< stack.size(); i++){
            s1.append(stack.get(i));
        }
        return s1.toString();

    }
    public static void main(String[] args) {
        RemovingStarsFromaString removingStarsFromaString = new RemovingStarsFromaString();
        String input1 = "leet**cod*e";
        System.out.println(input1 + "--->" +removingStarsFromaString.removeStars(input1));


        String input2 = "erase*****";
        System.out.println(input2 + "--->" +removingStarsFromaString.removeStars(input2));

    }

}
