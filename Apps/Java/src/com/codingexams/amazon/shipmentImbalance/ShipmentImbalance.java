package com.codingexams.amazon.shipmentImbalance;

import java.util.Arrays;
import java.util.List;

public class ShipmentImbalance {
    public static long subArrayRanges(List<Integer> weight) {

        long sum=0;
        int[] nums = weight.stream().mapToInt(i->i).toArray();
        for(int i=0;i<nums.length;i++)
        {
            int max=nums[i];
            int min=nums[i];

            for(int j=i;j<nums.length;j++)
            {
                max= Math.max(max,nums[j]);
                min= Math.min(min,nums[j]);
                int range= max-min;
                sum=sum+range;
            }
        }

        return sum;
    }

     public static void main(String[] args) {
        List<Integer> array = Arrays.asList(3,2,3);
        System.out.println(subArrayRanges(array));
     }
}
