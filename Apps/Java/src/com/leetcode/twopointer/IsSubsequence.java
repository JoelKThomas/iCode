package com.leetcode.twopointer;

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
       int first=0, second = 0;
       while(first < s.length() && second < t.length()){
           if(s.charAt(first) == t.charAt(second)){
               first++;
               if(first == s.length()){
                   return true;
               }
           }
           second++;
       }
       return false;
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
        System.out.println(isSubsequence("axc", "ahbgdc"));
    }
}
