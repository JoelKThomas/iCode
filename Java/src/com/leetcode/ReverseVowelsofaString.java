/*

345. Reverse Vowels of a String
Easy
Topics
Companies
Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.



Example 1:

Input: s = "hello"
Output: "holle"
Example 2:

Input: s = "leetcode"
Output: "leotcede"


Constraints:

1 <= s.length <= 3 * 105
s consist of printable ASCII characters.

 */

package com.leetcode;

import java.util.Arrays;

public class ReverseVowelsofaString {

    public static String reverseVowels(String s) {
      char[] chars = s.toCharArray();

      String vowels = "aeiouAEIOU";

      int left =0, right = chars.length-1;

      while(left < right){
          while(left < right && vowels.indexOf(chars[left]) == -1){
              left++;
          }
          while(left < right && vowels.indexOf(chars[right]) == -1){
              right--;
          }

          char temp = chars[left];
          chars[left] = chars[right];
          chars[right] = temp;

          left++;
          right--;
      }

      return new String(chars);

    }

    public static void main(String[] args) {
        String input = "leetcode";
        System.out.print(reverseVowels(input));
    }
}
