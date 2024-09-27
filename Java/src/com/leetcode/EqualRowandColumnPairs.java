package com.leetcode;

import java.util.*;

public class EqualRowandColumnPairs {
    public int equalPairs(int[][] grid) {

        int n  = grid.length;
        int result= 0;

        Map<String, Integer> rowMap = new HashMap<>();
       for(int i = 0; i < n; i++){
           String s = Arrays.toString(grid[i]);
           rowMap.put(s,rowMap.getOrDefault(s, 0) + 1 );
       }

        for(int i = 0; i < n; i++){
            int[] colArray = new int[n];
            for(int j=0; j < n; j++){
                colArray[j] = grid[j][i];
            }

            result+= rowMap.getOrDefault(Arrays.toString(colArray), 0);

        }
       return result;
    }


    public static void main(String[] args) {
        EqualRowandColumnPairs equalRowandColumnPairs = new EqualRowandColumnPairs();
//        int[][] grid = new int[][]{{3,2,1},{1,7,6},{2,7,7}};
//        System.out.println(equalRowandColumnPairs.equalPairs(grid));

//        int[][] grid2 = new int[][]{{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}};
//        System.out.println(equalRowandColumnPairs.equalPairs(grid2));

        int[][] grid3 = new int[][]{{11,1},{1,11}};
        System.out.println(equalRowandColumnPairs.equalPairs(grid3));



    }

}
