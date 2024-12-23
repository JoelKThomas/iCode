package com.leetcode.arraystring;

import java.util.Arrays;

public class ProductofArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {

        int length = nums.length;
        int result[] = new int[length];

        result[0] =1;
        for(int i=1; i < length;i++){
            result[i] = result[i-1] * nums[i-1];
        }

        int rightProduct=1;
        for(int i=length-1; i >= 0;i--){
            result[i] = result[i] * rightProduct;
            rightProduct *= nums[i];
        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1,2,3,4})));

        System.out.println(Arrays.toString(productExceptSelf(new int[]{-1,1,0,-3,3})));

    }
}
