package com.codingexams.mercedesbenz;

public class ClosedValueInArray {

    public static void main(String[] args){

        int arr[] = {8, 20, 16, -20, -2 };
        int target = 12;
        int closet= arr[0];
        for(int i=1; i< arr.length;i++){
            if(Math.abs(arr[i]-target) < Math.abs(closet-target)){
                closet= arr[i];
            }
        }
        System.out.println(closet);
      }


}
