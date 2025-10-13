package streams.easy;

import java.util.Arrays;
import java.util.List;

public class Easy2 {

    public static void streamsEasy() {
        System.out.println("*--- Streams for Easy category ---*");
        System.out.println("Problem: Convert to uppercase");

        /*
            CONVERT
            Task: Given a list of strings, convert all elements to uppercase.
            Example:
                Input: ["java", "stream", "api"]
                Output: ["JAVA", "STREAM", "API"]

            INPUT: List of Strings
            INTERMEDIATE OPERATION: map(String::toUpperCase)
            TERMINAL OPERATION: toList()
            OUTPUT: Uppercased strings
         */

        // Input
        List<String> wordList = Arrays.asList("java", "stream", "api");
        System.out.println("Input - List of raw data: " + wordList);

        // Process
        List<String> capitalizedWords = wordList.stream()
                                                .map(String::toUpperCase)
                                                .toList();
        // Output
        System.out.println("Output: " + capitalizedWords);
        System.out.println();

        System.out.println("Problem: Count Strings Starting with 'A' Letter");
        /*
            COUNT STRING STARTING WITH A LETTER
            Task: Count how many strings in a list start with the letter "A".
            Example:
                Input: ["Apple", "Banana", "Avocado", "Apricot", "Berry"]
                Output: 3

            INPUT: List of fruits
            INTERMEDIATE OPERATION: filter() → accepts only word that starts with A
            TERMINAL OPERATION: count() → get total string count
            OUTPUT:
         */

        // Input
        List<String> fruitList = Arrays.asList("Apple", "Banana", "Avocado", "Apricot", "Berry");
        System.out.println("Input - List of raw data: " + fruitList);

        // Process
        int aWordCount = Math.toIntExact(fruitList.stream()
                                                  .filter(word -> word.startsWith("A"))
                                                  .count());
        // Output
        System.out.println("Output: " + aWordCount);
        System.out.println();

        System.out.println("Problem: Find Average of Numbers");
        /*
            FIND AVERAGE OF NUMBERS
            Task: Find the average of a list of integers using streams.
            Example:
                Input: [10, 20, 30, 40]
                Output: 25.0

            INPUT: List of numbers
            INTERMEDIATE OPERATION: mapToInt() → casting int values to prepare getting a total average
                                    average() → to compute average of the int values
                                    orElse() → to handle empty list
            TERMINAL OPERATION:
            OUTPUT:
         */

        // Input
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
        System.out.println("Input - List of raw data: " + numbers);

        // Process
        double average = numbers.stream()
                                .mapToInt(Integer::intValue)
                                .average()
                                .orElse(0);

        // Output
        System.out.println("Output: " + average);
        System.out.println();
    }
}
