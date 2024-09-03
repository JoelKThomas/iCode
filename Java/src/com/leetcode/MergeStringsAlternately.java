/*


You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.


Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
Example 2:

Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b
word2:    p   q   r   s
merged: a p b q   r   s
Example 3:

Input: word1 = "abcd", word2 = "pq"
Output: "apbqcd"
Explanation: Notice that as word1 is longer, "cd" is appended to the end.
word1:  a   b   c   d
word2:    p   q
merged: a p b q c   d


Constraints:

1 <= word1.length, word2.length <= 100
word1 and word2 consist of lowercase English letters.


 */

package com.leetcode;

public class MergeStringsAlternately {


    public static String mergeAlternately(String word1, String word2) {
      StringBuilder mergedWord = new StringBuilder();


      int first = 0, second =0;
      int word1length = word1.length();
      int word2length = word2.length();

      while(first < word1length && second < word2length){
          mergedWord.append(word1.charAt(first));
          mergedWord.append(word2.charAt(second));
          first++;
          second++;
      }

      if(first< word1length){
          mergedWord.append(word1, first, word1length);
      }

        if(second< word2length){
            mergedWord.append(word2, second, word2length);
        }

      return mergedWord.toString();
    }

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2));

    }

}
