package com.codingexams.relevantz;

import java.util.*;
import java.util.stream.*;

public class NonRepeatingElements {

    // General method for finding non-repeating elements in an object array
    private static <T> List<T> findNonRepeating(T[] array) {
        // Convert array to a list and group by element count
        Map<T, Long> elementCount = Arrays.stream(array)
                .collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()));

        // Filter elements that appear only once
        return elementCount.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    // Overloaded method for primitive types (int)
    private static List<Integer> findNonRepeating(int[] array) {
        // Process int array
        Map<Integer, Long> elementCount = Arrays.stream(array)
                .boxed() // Convert to Integer
                .collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()));

        return elementCount.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    // Overloaded method for primitive types (char)
    private static List<Character> findNonRepeating(char[] array) {
        // Process char array
        Map<Character, Long> elementCount = IntStream.range(0, array.length)
                .mapToObj(i -> array[i])
                .collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()));

        return elementCount.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    // Overloaded method for primitive types (float)
    private static List<Float> findNonRepeating(float[] array) {
        if (array == null || array.length == 0) {
            return Collections.emptyList();
        }

        // Convert float[] to List<Float>
        List<Float> floatList = new ArrayList<>();
        for (float num : array) {
            floatList.add(num);
        }

        // Process List<Float> to count occurrences
        Map<Float, Long> elementCount = floatList.stream()
                .collect(Collectors.groupingBy(element -> element, LinkedHashMap::new, Collectors.counting()));

        return elementCount.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }


    // Overloaded method for primitive types (double)
    private static List<Double> findNonRepeating(double[] array) {
        // Process double array
        Map<Double, Long> elementCount = Arrays.stream(array)
                .boxed() // Convert to Double
                .collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()));

        return elementCount.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    // Overloaded method for List<Integer>
    private static List<Integer> findNonRepeating(List<Integer> list) {
        // Process List of Integer
        Map<Integer, Long> elementCount = list.stream()
                .collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()));

        return elementCount.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        // Example data
        int[] intArray = {1, 2, 3, 2, 4, 4, 5};
        char[] charArray = {'a', 'b', 'c', 'b', 'a', 'd'};
        float[] floatArray = {1.1f, 2.2f, 3.3f, 1.1f, 4.4f};
        double[] doubleArray = {1.1, 2.2, 3.3, 2.2, 4.4};
        String[] stringArray = {"apple", "banana", "apple", "orange"};
        List<Integer> integerList = Arrays.asList(1, 2, 3, 2, 4, 4, 5);

        // Process and print results for each array/list
        System.out.println("Non-repeating elements in int array: " + findNonRepeating(intArray));
        System.out.println("Non-repeating elements in char array: " + findNonRepeating(charArray));
        System.out.println("Non-repeating elements in float array: " + findNonRepeating(floatArray));
        System.out.println("Non-repeating elements in double array: " + findNonRepeating(doubleArray));
        System.out.println("Non-repeating elements in String array: " + findNonRepeating(stringArray));
        System.out.println("Non-repeating elements in Integer List: " + findNonRepeating(integerList));
    }


}
