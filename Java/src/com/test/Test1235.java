package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Test1235 {

        static final int NO_OF_CHARS = 256;

        static int[] getCharCountArray(String str)
        {
            int count[] = new int[NO_OF_CHARS];
            for (int i = 0; i < str.length(); i++)
                count[str.charAt(i)]++;
            return count;
        }

        static String removeDirtyChars(String str,
                                       String mask_str)
        {
            int count[] = getCharCountArray(mask_str);
            int ip_ind = 0, res_ind = 0;

            char arr[] = str.toCharArray();

            while (ip_ind != arr.length)
            {
                char temp = arr[ip_ind];
                if (count[temp] == 0) {
                    arr[res_ind] = arr[ip_ind];
                    res_ind++;
                }
                ip_ind++;
            }

            str = new String(arr);

            return str.substring(0, res_ind);
        }



    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            int index = line.indexOf(',');
            String text = line.substring(0,index);
            String charsToRemove = line.substring(index+1);
           System.out.println(removeDirtyChars(text,charsToRemove));

        }


    }
}
