package com.codingexams.chubbma;

import java.util.HashMap;
import java.util.Map;

public class CountingBinarySubstrings {

    /*
     * Complete the function below.
     */
    static int counting(String s) {
        int ans = 0;
        int i = 0;
        int n = s.length();
        while(i < n){
            int countZero = 0, countOne= 0;
            if(s.charAt(i) == '0'){
                while (i < n && s.charAt(i) == '0'){
                    countZero++;
                    i++;
                }
                int j=i;
                while (j < n  && s.charAt(j) == '1'){
                    countOne++;
                    j++;
                }
            } else {
                while (i < n && s.charAt(i) == '1'){
                    countOne++;
                    i++;
                }
                int j=i;
                while (j < n  && s.charAt(j) == '0'){
                    countZero++;
                    j++;
                }
            }
            ans += Math.min(countZero, countOne);

        }
        return ans;
    }

    public static void main(String[] args) {
    }


}

