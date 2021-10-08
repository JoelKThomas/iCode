package com.algoexpert.Array.validatesequence;

import java.util.Arrays;
import java.util.List;

class ValidateSequenceUsingWhile {
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(1, 6, -1, 10);
        System.out.println(isValidSubsequence(array, sequence));
    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int arrayIndex = 0;
        int sequenceIndex = 0;
        while (arrayIndex < array.size() && sequenceIndex < sequence.size()) {
            if (array.get(arrayIndex).equals(sequence.get(sequenceIndex))) {
                sequenceIndex += 1;
            }
            arrayIndex+=1;
        }
        return sequenceIndex == sequence.size();
    }

}