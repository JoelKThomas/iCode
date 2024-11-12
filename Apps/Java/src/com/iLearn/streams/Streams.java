package com.iLearn.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {

        // Stream Creation Examples
        createStreams();

        // Intermediate Operations Examples
        demonstrateIntermediateOperations();

        // Terminal Operations Examples
        demonstrateTerminalOperations();

        // Working with Primitive Types
        demonstratePrimitiveStreams();

        // Parallel Streams
        demonstrateParallelStream();
    }

    private static void createStreams() {
        // From a Collection
        System.out.println("Stream Creation : From a Collection");
        List<String> list = Arrays.asList("a", "b", "c");
        list.stream().forEach(s -> System.out.print(s + " "));
        System.out.println();  // New line for better readability

        // From an Array
        System.out.println("Stream Creation : From an Array");
        String[] array = {"a", "b", "c"};
        Arrays.stream(array).forEach(s -> System.out.print(s + " "));
        System.out.println();  // New line for better readability

        // From Static Methods (Stream.of)
        System.out.println("Stream Creation : From Static Methods (Stream.of)");
        Stream.of("a", "b", "c").forEach(s -> System.out.print(s + " "));
        System.out.println();  // New line for better readability
    }

    private static void demonstrateIntermediateOperations() {
        // map()
        System.out.println("\nIntermediate Operations : map()");
        Stream.of("apple", "banana", "cherry")
                .map(String::length)
                .forEach(s -> System.out.print(s + " "));
        System.out.println();  // New line for better readability

        // filter()
        System.out.println("\nIntermediate Operations : filter()");
        Stream.of("apple", "banana", "cherry")
                .filter(s -> s.startsWith("a"))
                .forEach(s -> System.out.print(s + " "));
        System.out.println();  // New line for better readability

        // distinct()
        System.out.println("\nIntermediate Operations : distinct()");
        Stream.of(1, 2, 2, 3, 4, 4)
                .distinct()
                .forEach(s -> System.out.print(s + " "));
        System.out.println();  // New line for better readability

        // sorted()
        System.out.println("\nIntermediate Operations : sorted()");
        Stream.of("apple", "banana", "cherry")
                .sorted()
                .forEach(s -> System.out.print(s + " "));
        System.out.println();  // New line for better readability

        // flatMap()
        System.out.println("\nIntermediate Operations : flatMap()");
        Stream.of(Arrays.asList("a", "b"), Arrays.asList("c", "d"))
                .flatMap(List::stream)
                .forEach(s -> System.out.print(s + " "));
        System.out.println();  // New line for better readability
    }

    private static void demonstrateTerminalOperations() {
        // collect()
        System.out.println("\nTerminal Operations : collect()");
        List<String> collectedList = Stream.of("apple", "banana", "cherry")
                .collect(Collectors.toList());
        System.out.println(collectedList);

        // forEach()
        System.out.println("\nTerminal Operations : forEach()");
        Stream.of("apple", "banana", "cherry")
                .forEach(s -> System.out.print(s + " "));
        System.out.println();  // New line for better readability

        // reduce()
        System.out.println("\nTerminal Operations : reduce()");
        int sum = Stream.of(1, 2, 3, 4)
                .reduce(0, Integer::sum);
        System.out.println(sum);  // Output: 10

        // anyMatch()
        System.out.println("\nTerminal Operations : anyMatch()");
        boolean anyStartsWithA = Stream.of("apple", "banana", "cherry")
                .anyMatch(s -> s.startsWith("a"));
        System.out.println(anyStartsWithA);  // Output: true

        // count()
        System.out.println("\nTerminal Operations : count()");
        long count = Stream.of("apple", "banana", "cherry")
                .count();
        System.out.println(count);  // Output: 3
    }

    private static void demonstratePrimitiveStreams() {
        // Working with Primitive Types: IntStream
        System.out.println("\nWorking with Primitive Types : IntStream");
        IntStream.of(1, 2, 3, 4)
                .forEach(s -> System.out.print(s + " "));
        System.out.println();  // New line for better readability
    }

    private static void demonstrateParallelStream() {
        // Parallel Streams
        System.out.println("\nParallel Streams:");
        List<String> list = Arrays.asList("a", "b", "c");
        list.parallelStream().forEach(s -> System.out.print(s + " "));
        System.out.println();  // New line for better readability
    }
}
