package com.leetcode;

public class NumberofVowelsinaSubstringofGivenLength {
    public static int maxVowels(String s, int k) {
       String vowels = "aeiou";
       int maxVowels = 0;

       for(int i = 0; i < k; i++){
           if(vowels.indexOf(s.charAt(i)) > -1){
               maxVowels++;
           }
       }
       int currentVowelsCount =  maxVowels;
       for(int i=k; i < s.length(); i++){
           if((vowels.indexOf(s.charAt(i)) > -1)){
               currentVowelsCount+= 1;
           }
           if((vowels.indexOf(s.charAt(i-k)) > -1)){
               currentVowelsCount -= 1;
           }
           maxVowels = Math.max(maxVowels, currentVowelsCount);
       }
       return maxVowels;

    }

    public static void main(String[] args) {
        System.out.println(maxVowels("abciiidef", 3));
    }

}
