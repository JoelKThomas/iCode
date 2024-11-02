package com.codingexams.epam.anagrams;

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hashMap = new HashMap<>();
        for(int i=0 ; i < strs.length; i++){
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String s = new String(charArray);
            if(!hashMap.containsKey(s)){
                hashMap.put(s, new ArrayList<>());
            }
            hashMap.get(s).add(strs[i]);
        }
         return new ArrayList<>(hashMap.values());
    }
    public static void main(String[] args) {
        String[] strs= new String[]{"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
}
