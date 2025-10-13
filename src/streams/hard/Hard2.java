package streams.hard;

import java.util.*;
import java.util.stream.Collectors;

public class Hard2 {

    public static void streamsHard() {
        System.out.println("*--- Streams for Hard category ---*");
        System.out.println("Problem: Find the Longest String");

        /*
            FIND THE LONGEST STRING
            Task: Given a list of strings, find the longest one using streams.
            Example:
                Input: ["java", "stream", "collector", "lambda"]
                Output: "collector"

            INPUT: List of strings
            INTERMEDIATE OPERATION: None
            TERMINAL OPERATION: max(Comparator.comparingInt(String::Length)) → getting the string that have
                                                                                   max value in word length
            OUTPUT: string.get() → collector
         */

        // Input
        List<String> wordList = Arrays.asList("java", "stream", "collector", "lambda");
        System.out.println("Input - List of raw data: " + wordList);

        // Process
        Optional<String> longestWord = wordList.stream()
                                               .max(Comparator.comparingInt(String::length));

        // Output
        System.out.println("Output: " + longestWord.get());
        System.out.println();

        System.out.println("Problem: Sum of Squares of Odd Numbers");
        /*
            SUM OF SQUARES OF ODD NUMBERS
            Task: Find the sum of the squares of all odd numbers in a list.

            Example:
                Input: [1, 2, 3, 4, 5]
                Output: 35
            INPUT: List of numbers
            INTERMEDIATE OPERATION: filter(n n%2 != 0) → to filter odd numbers
                                    reduce(n -> n * n) → total squared numbers
            TERMINAL OPERATION: sum() → get the total amount of squared odd numbers
            OUTPUT: value
         */

        // Input
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Input - List of raw data: " + numbers);

        // Process
        Integer sumOfSquaredOddNumbers = numbers.stream()
                                                .filter(e -> e%2 != 0)
                                                .map(n -> n * n)
                                                .reduce(0, Integer::sum);

        // Output
        System.out.println("Output: " + sumOfSquaredOddNumbers);
        System.out.println();

        System.out.println("Problem: Partition Numbers by Even/Odd");
        /*
            PARTITION NUMBERS BY EVEN/ODD
            Task: Use Collectors.partitioningBy to split numbers into even and odd groups.
            Example:
                Input: [1, 2, 3, 4, 5, 6]
                Output: {true=[2, 4, 6], false=[1, 3, 5]}

            INPUT: List of integers
            INTERMEDIATE OPERATION: None
            TERMINAL OPERATION: partitioningBy() → to separate even number as 'true' List
            OUTPUT:
         */

        // Input
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("Input - List of raw data: " + integerList);

        // Process
        Map<Boolean, List<Integer>> categorizedNumbers =
                integerList.stream().collect(Collectors.partitioningBy(n -> n%2 == 0));

        // Output
        System.out.println("Output: " + categorizedNumbers);
        System.out.println();
    }
}
