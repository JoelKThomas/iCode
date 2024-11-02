package com.leetcode.hashmapset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindtheDifferenceofTwoArrays {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> result = new ArrayList<>();

        Set<Integer> nums1Set = new HashSet<>(){};
        for(int i : nums1){
            nums1Set.add(i);
        }

        Set<Integer> nums2Set = new HashSet<>();
        for(int i : nums2){
            nums2Set.add(i);
        }

        List<Integer> nums1List = new ArrayList<>(nums1Set);
        nums1List.removeAll(nums2Set);

        List<Integer> nums2List = new ArrayList<>(nums2Set);
        nums2List.removeAll(nums1Set);

        result.add(nums1List);
        result.add(nums2List);
        return result;
    }

    public static void main(String[] args) {
        FindtheDifferenceofTwoArrays findtheDifferenceofTwoArrays = new FindtheDifferenceofTwoArrays();

        int[] nums1= new int[]{1,2,3}, nums2 = new int[]{2,4,6};
        System.out.println(findtheDifferenceofTwoArrays.findDifference(nums1, nums2));
    }
}
