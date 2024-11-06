package com.codingexams.bitgo;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringKDistinct {

    public static String longestSubstring(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        // Get the maximum allowed distinct characters from the first character of the string
        int maxCharLength = input.charAt(0) - '0';
        String maxLenString = "";
        int length = input.length();
        int left = 1;  // Start the left pointer from 1 to skip the first character
        int right = 1;
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        int currentLength = 0;

        while (right < length) {
            char rightChar = input.charAt(right);

            // Add right character to the map
            characterIntegerMap.put(rightChar, characterIntegerMap.getOrDefault(rightChar, 0) + 1);

            // If this is a new character, increment the distinct count
            if (characterIntegerMap.get(rightChar) == 1) {
                currentLength++;
            }

            // If we have more than 'maxCharLength' distinct characters, move the left pointer
            while (currentLength > maxCharLength) {
                char leftChar = input.charAt(left);
                int count = characterIntegerMap.get(leftChar);

                // If removing the left character reduces its count to zero, decrease the distinct count
                if (count == 1) {
                    characterIntegerMap.remove(leftChar);
                    currentLength--;
                } else {
                    characterIntegerMap.put(leftChar, count - 1);
                }
                left++; // Move the left pointer to shrink the window
            }

            // Check if the current window is the largest substring found so far
            if (right - left + 1 > maxLenString.length()) {
                maxLenString = input.substring(left, right + 1);
            }

            right++; // Move the right pointer to expand the window
        }
        return maxLenString;
    }

    public static void main(String[] args) {
        // Test the function with example inputs
        String input1 = "3abbbaeacahbaa";
        System.out.println("Max Sub String: " + longestSubstring(input1)); // Output: "bbbaeac"

        String input2 = "2aabbccc";
        System.out.println("Max Sub String: " + longestSubstring(input2)); // Output: "aabb"

        String input3 = "1abcabc";
        System.out.println("Max Sub String: " + longestSubstring(input3)); // Output: "a"
    }
}
