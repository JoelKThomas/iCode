package com.codingexams.zepto.rabbitsforest;

import java.util.HashMap;
import java.util.Map;

public class RabbitsForest {
    public static int numRabbits(int[] answers) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int answer : answers) {
            countMap.put(answer, countMap.getOrDefault(answer, 0) + 1);
        }

        int minRabbits = 0;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int answer = entry.getKey();
            int count = entry.getValue();
            int groupSize = answer + 1;
            int groups = (count + groupSize - 1) / groupSize; // ceiling division
            minRabbits += groups * groupSize;
        }

        return minRabbits;
    }

    public static void main(String[] args) {
        int[] answers = new int[]{1,1,2};
        System.out.println(numRabbits(answers));
    }
}
