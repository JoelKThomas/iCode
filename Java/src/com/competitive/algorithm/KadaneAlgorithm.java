package com.competitive.algorithm;

public class KadaneAlgorithm {

   public static int kadaneAlgorithm(int[] array){
       int maxEnding = array[0];
       int maxSoFar = array[0];
       for (int i=1;i < array.length; i++){
           int num = array[i];
           maxEnding = Math.max(num, maxEnding+ num);
           maxSoFar  = Math.max(maxSoFar, maxEnding);
       }
       return maxSoFar;
   }

    public static void main(String[] args) {
         System.out.println(kadaneAlgorithm(new int[] {3, 5, -9, 1, 3, -2, 3, 4, 7, 2, -9, 6, 3, 1, -5, 4}));
    }
}
