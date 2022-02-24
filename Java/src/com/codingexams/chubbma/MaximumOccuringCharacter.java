package com.codingexams.chubbma;

import java.util.HashMap;
import java.util.Map;

public class MaximumOccuringCharacter {

    public static char maximumOccurringCharacter(String text) {
        Map<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            if (hashMap.containsKey(text.charAt(i))) {
                hashMap.put(text.charAt(i), hashMap.get(text.charAt(i)) + 1);
            } else {
                hashMap.put(text.charAt(i), 1);
            }
        }
        int index = 0;
        for (int i = 1; i < text.length(); i++) {
            if (hashMap.get(text.charAt(index)) < hashMap.get(text.charAt(i))) {
                index = i;
            }
        }
        return text.charAt(index);
    }

    public static void main(String[] args) {
    }


}

