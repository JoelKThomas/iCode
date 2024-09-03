/*

151. Reverse Words in a String
Medium
Topics
Companies
Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.


Constraints:

1 <= s.length <= 104
s contains English letters (upper-case and lower-case), digits, and spaces ' '.
There is at least one word in s.


Follow-up: If the string data type is mutable in your language, can you solve it in-place with O(1) extra space?

 */
package com.leetcode;

public class ReverseWordsinaString {
    public static String reverseWords(String s) {
        StringBuilder output = new StringBuilder();
        int n = s.length();
        int i = n - 1;

        while (i >= 0) {
            // Skip any leading spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            // Find the end of the current word
            int end = i;

            // Find the start of the current word
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            int start = i + 1;

            // Append the current word to the result
            if (end >= start) {
                output.append(s, start, end + 1);
                output.append(" ");
            }
        }

        // Remove the trailing space
        if (!output.isEmpty()) {
            output.setLength(output.length() - 1);
        }

        return output.toString();
    }

    public static String reverseWords2(String sentence){

        sentence = sentence.trim();

        String[] words =sentence.split("\\s+");
        StringBuilder reverseWords = new StringBuilder();

        for(int i = words.length-1; i >=0; i--){
            reverseWords.append(words[i]);
            reverseWords.append(" ");
        }
        // Remove the trailing space
        if (!reverseWords.isEmpty()) {
            reverseWords.setLength(reverseWords.length() - 1);
        }
       return reverseWords.toString();
    }


    public static void main(String[] args) {
        String sentence  = "the sky    is blue";

        System.out.println(reverseWords2(sentence));
    }
}
