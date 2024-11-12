//Problem: First Non-repeating characters in the String. (HashMap approach is accepted).
package com.algoexpert.string;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatCharacter {
    public static char firstNonRepeatChar(String input) {
        Map<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            if (hashMap.containsKey(input.charAt(i))) {
                hashMap.put(input.charAt(i), hashMap.get(input.charAt(i)) + 1);
            } else {
                hashMap.put(input.charAt(i), 1);
            }
        }
        for (int i = 0; i < input.length(); i++) {
            if (hashMap.get(input.charAt(i)) == 1) {
                return input.charAt(i);
            }
        }
        return '_';
    }

    public static void main(String[] args) {
        System.out.println("The First Non Repeating Character in  geeksforgeeks is: " +
                firstNonRepeatChar("geeksforgeeks"));
    }
}
