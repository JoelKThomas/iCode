package com.codingexams.salesforce;

import java.util.*;

public class LogRefinement {

    public static List<Integer> GetRefinedEntries(List<Integer> entries) {
        int n = entries.size();
        List<Integer> result = new ArrayList<>(entries);
        int operations = 0;

        for (int i = 0; i < n && operations < n - 1; i++) {
            // Find the index of the smallest element that can be moved to position i
            int minIndex = i;
            for (int j = i + 1; j < n && operations < n - 1; j++) {
                if (result.get(j) < result.get(minIndex)) {
                    minIndex = j;
                }
            }

            // Move the smallest element to position i if it is not already there
            while (minIndex > i) {
                Collections.swap(result, minIndex, minIndex - 1);
                minIndex--;
                operations++;
                if (operations >= n - 1) {
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Test cases
        List<Integer> entries1 = new ArrayList<>(Arrays.asList(5, 4, 1, 3, 2));
        System.out.println(GetRefinedEntries(entries1)); // Output should be: [1, 5, 2, 4, 3]

        List<Integer> entries2 = new ArrayList<>(Arrays.asList(4, 3, 2, 1));
        System.out.println(GetRefinedEntries(entries2)); // Output should be: [1, 4, 3, 2]

        List<Integer> entries3 = new ArrayList<>(Arrays.asList(1, 2));
        System.out.println(GetRefinedEntries(entries3)); // Output should be: [1, 2]
    }
}
