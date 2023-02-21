package com.competitive.string.longestPalindrome;


public class LongestPalindrome {

    public static String longestPalindromicSubstring(String str) {
    int[] longest = new int[]{0,1};
    for(int i=1; i < str.length(); i++){
        int[] odd = getLongestPalindrome(str, i-1, i+1);
        int[] even = getLongestPalindrome(str, i-1,i);
        int[] currentLongest = odd[1] - odd[0] > even[1] - odd[0] ? odd : even;
        longest = currentLongest[1] - currentLongest[0] > longest[1] - longest[0] ? currentLongest : longest;
    }
    return str.substring( longest[0], longest[1]);
    }


    public static int[] getLongestPalindrome(String str,int left, int right){
        while(left >= 0 && right < str.length()){
            if(str.charAt(left) != str.charAt(right)){
                break;
            }
            left--;
            right++;
        }

        return new int[]{left+1, right};
    }

    public static void main(String[] args) {
        System.out.println(longestPalindromicSubstring("abaxyzzyxf"));
    }
}
