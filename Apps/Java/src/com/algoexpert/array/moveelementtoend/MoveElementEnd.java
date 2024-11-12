package com.algoexpert.array.moveelementtoend;

import java.util.Arrays;

public class MoveElementEnd {

    public static void main(String args[]) {
        int array[] = new int[]{2, 1, 2, 2, 2, 3, 4, 2};
        int toMove = 2;
        int i= 0;
        int j = array.length -1;
        while(i < j ){
            while(i < j && array[j] == toMove){
                j--;
            }
            if(array[i] == toMove){
                int temp = array[i];
                array[i]= array[j];
                array[j] =temp;
            }
            i++;
        }
        System.out.println(Arrays.toString(array));
    }
}