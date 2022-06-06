package com.test;//package com.test;
//
//
//public class Test {
//
//
//    public static void main(String[] args) {
//        System.out.println("Test");
//    }
//}
//
//
//1.  Median of Two Sorted Arrays
//
//        Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
//
//        Input: nums1 = [1,3], nums2 = [2]
//        Output: 2.00000
//        Explanation: merged array = [1,2,3] and median is 2.   [1,2,3,4] -> 2.5
//
//public int test(int[] num1, int[]num2){
//        int i=0, j=0, k=0;
//        double median =0.0;
//        while(true){
//        if(i < num1.length && num1[i] <= num2[j] ){
//        result[k] = num[i];
//        k++;
//        i++;
//        } else if(j < num2.length && num1[i] > num2[j] )  {
//        result[k] = num[j];
//        k++;
//        j++;
//        } else {
//        break;
//        }
//        }
//
//        int len= result.length;
//        if(result.length % 2 !=0){
//        median = result[len/2];
//        }
//        else {
//        median = (result[len/2] + result[(len/2)+1])/2 ;
//        }
//        return median;
//        }
//
//
//        2. Add Two Numbers
//
//        You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
//
//        Input: l1 = [2,4,3], l2 = [5,6,4]
//        Output: [7,0,8]
//        Explanation: 342 + 465 = 807.
//
//        Input: l1 = [2,4,9], l2 = [5,6,9]
//        Output: [7,0,18]
//
//        7----> 0---->8
//
//
//
//
//
//Input: l1 = [2,4,3], l2 = [5,6,4]
//        Output: [7,0,8]
//        Explanation: 342 + 465 = 807.
//
//
//        hashmap
//
//
//        key value pair
//
//        key value
//
//
//        0--> LinkedList-- key, value, hashcode, next
//        1
//        2
//        .
//        .
//        .
//        15
//
//
//        joel 100
//
//
//        joel --- 1166161---1 : joel
//        gopal -- 1234---2: gopal
//
//        jewel -p- 1243432344--1
//
//        1-1000
//        1000-2000
//        10000
//
//
//
////        failSafe
////        failFast
////
////
//package com.test;
//
//
//public class Test {
//    String s="";
//    public static String reverse(String input, int index){
//        if(index+1 < input.length()){
//            reverse(input, index+1);
//        }
//        System.out.print( input.charAt(index));
//        return input;
//    }
//
//    public static void main(String[] args) {
//        reverse("Test",0);
//    }
//}
//



//class SingleTon {
//    private static String str;
//
//    SingleTon(String value){
//        this.str = value;
//    }
//}