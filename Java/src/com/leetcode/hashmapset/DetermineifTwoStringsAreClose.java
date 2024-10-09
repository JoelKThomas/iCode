package com.leetcode.hashmapset;

import java.util.*;

public class DetermineifTwoStringsAreClose {


    public boolean closeStrings(String word1, String word2) {

        if(word1.length() !=  word2.length()){
            return false;
        }

        HashMap<Character, Integer> countMap1 = new HashMap<>();
        HashMap<Character, Integer> countMap2 = new HashMap<>();


        for(char c : word1.toCharArray()){
            countMap1.put(c, countMap1.getOrDefault(c, 0) + 1);
        }

        for(char c : word2.toCharArray()){
            countMap2.put(c, countMap2.getOrDefault(c, 0) + 1);
        }


        if(!countMap1.keySet().equals(countMap2.keySet())){
            return false;
        }


        List<Integer> freq1 = new ArrayList<>(countMap1.values());
        List<Integer> freq2 = new ArrayList<>(countMap2.values());

        Collections.sort(freq1);
        Collections.sort(freq2);
        return freq1.equals(freq2);
    }

    public static void main(String[] args) {

        DetermineifTwoStringsAreClose determineifTwoStringsAreClose = new DetermineifTwoStringsAreClose();

        System.out.println(determineifTwoStringsAreClose.closeStrings("cabbba", "abbccc"));

    }
}
