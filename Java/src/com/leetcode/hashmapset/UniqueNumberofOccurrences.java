package com.leetcode.hashmapset;

import java.util.*;

public class UniqueNumberofOccurrences {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i=0; i < arr.length; i++){
            hashMap.put(arr[i] , hashMap.getOrDefault(arr[i], 0) + 1);
        }

        List<Integer> countList = new ArrayList<>(hashMap.values());

        Set<Integer> countSet = new HashSet<>(countList);

        return countList.size() == countSet.size();
    }

    public static void main(String[] args) {
     UniqueNumberofOccurrences uniqueNumberofOccurrences = new UniqueNumberofOccurrences();
        System.out.println(uniqueNumberofOccurrences.uniqueOccurrences(new int[]{1,2,2,1,1,3}));
    }
}
