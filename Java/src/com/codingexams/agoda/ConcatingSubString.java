package com.codingexams.agoda;


import java.util.*;

/*

Find the starting indices of the substrings in string (S) which is made by concatenating all words from a list(L)
Last Updated : 01 Mar, 2023
You are given a string S, and a list of words L i.e array/vector of strings (Words in list L are all of the same length). Find the starting indices of the substrings in string S, which contains all the words present in list L. The order of words of list L appearing inside string S does not matter i.e if string S is “barfooapplefoobar” and list of words (L) is [“foo”, “bar”] then we have to look for substrings “foobar”, “barfoo” in string S. Note : Words inside the list L can repeat.

Examples :

Input : S: "barfoothefoobarman"
        L: ["foo", "bar"]
Output : 0 9
Explanation :
// at index 0 : barfoo
// at index 9 : foobar

Input : S: "catbatatecatatebat"
        L: ["cat", "ate", "bat"]
Output : 0 3 9
Explanation :
// at index 0 : catbatate
// at index 3 : batatecat
// at index 9 : catatebat

Input : S : "abcdababcd"
        L : ["ab", "ab", "cd"]
Output : 0 2 4
Explanation :
// at index 0 : abcdab
// at index 2 : cdabab
// at index 4 : ababcd

Input : S : "abcdababcd"
        L : ["ab", "ab"]
Output : 4


 */
public class ConcatingSubString {


        List<Integer> findStartingIndex(String s, String[] words) {
            List<Integer> result = new ArrayList<>();
            if (s == null || words == null || words.length == 0) {
                return result;
            }

            int wordLength = words[0].length();
            int totalWordsLength = wordLength * words.length;

            if (s.length() < totalWordsLength) {
                return result;
            }

            // Step 1: Create a frequency map for the words in the list
            Map<String, Integer> wordCount = new HashMap<>();
            for (String word : words) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }

            // Step 2: Sliding window over the string
            for (int i = 0; i <= s.length() - totalWordsLength; i++) {
                Map<String, Integer> seenWords = new HashMap<>();
                int j = 0;

                while (j < words.length) {
                    // Get the substring from current index
                    String currentWord = s.substring(i + j * wordLength, i + (j + 1) * wordLength);
                    // Check if this word is in the word list
                    if (wordCount.containsKey(currentWord)) {
                        seenWords.put(currentWord, seenWords.getOrDefault(currentWord, 0) + 1);
                        // If the word appears more times than expected, break the loop
                        if (seenWords.get(currentWord) > wordCount.get(currentWord)) {
                            break;
                        }
                    } else {
                        break;
                    }
                    j++;
                }

                // If all words are matched
                if (j == words.length) {




                    result.add(i);
                }
            }

            return result;
        }



    public static void main(String[] args) {
        ConcatingSubString concatingSubString = new ConcatingSubString();
        String S = "barfoothefoobarman";
        String[] words = new String[]{"foo", "bar"};
        System.out.println( "Result ---> "+ concatingSubString.findStartingIndex(S, words));
    }

}
