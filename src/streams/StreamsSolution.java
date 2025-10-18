package streams;

import java.util.Arrays;
import java.util.List;

public class StreamsSolution {

    public static void answers() {
        System.out.println("Date: October 17, 2025");
        /*
            1. Create a stream from a list of integers and print each element.

            Input: List of integer = {1,2,3,4,5,6,7,8,9,0}
            Process:
                Intermediate Operator: N/A
                Terminal Operator: toList()
            Output: Integer List = {1,2,3,4,5,6,7,8,9,0}
         */
        System.out.println("PROBLEM: Create a stream from a list of integers and print each element.");
        // Input:
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        System.out.println("Input: " + integerList);

        // Process:
        List<Integer> output = integerList.stream()
                                          .toList();

        // Output:
        System.out.println("Output: " + output);
        System.out.println();

        /*
            2. Given a list of strings, convert all of them to uppercase using streams.

            Input: List of string
            Process: map(String::toUpperCase()) → transform data to all uppercase
                Intermediate Operator:
                Terminal Operator: toList()
            Output: Integer List = {1,2,3,4,5,6,7,8,9,0}
         */
        System.out.println("PROBLEM: Given a list of strings, convert all of them to uppercase using streams.");
        // Input:
        List<String> wordList = Arrays.asList("madam", "toy", "plane", "book", "pen", "sky");
        System.out.println("Input: " + wordList);

        // Process:
        List<String> uppercaseStringList = wordList.stream()
                                                   .map(String::toUpperCase)
                                                   .toList();

        // Output:
        System.out.println("Output: " + uppercaseStringList);
        System.out.println();
        /*
            Convert a list of integers to their squares using map.

            Input: List of Integers = {1,2,3,4,5,6,7,8,9,0}
            Process:
                Intermediate Operator: map(n -> n * n) → transform into squared numbers
                Terminal Operator: toList()
            Output: Integer List = {1,4,9,16,26,36,49,64,81,0}
         */
        System.out.println("PROBLEM: Convert a list of integers to their squares using map.");
        // Input:
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        System.out.println("Input: " + numbers);

        // Process:
        List<Integer> squaredList = numbers.stream()
                                           .map(n -> n * n)
                                           .toList();

        // Output:
        System.out.println("Output: " + squaredList);
        System.out.println();
        /*
            From a list of strings, get the length of each string as a list of integers.

            Input: List of Strings = {"cat", "lion", "parrot"}
            Process:
                Intermediate Operator: map(String::length) → transform into the word length (Integers)
                Terminal Operator: toList()
            Output: Integer List = {3,4,6}
         */
        System.out.println("PROBLEM: From a list of strings, get the length of each string as a list of integers.");
        // Input:
        List<String> randomWords = Arrays.asList("cat", "lion", "parrot");
        System.out.println("Input: " + randomWords);

        // Process:
        List<Integer> wordLengthList = randomWords.stream()
                                                  .map(String::length)
                                                  .toList();

        // Output:
        System.out.println("Output: " + wordLengthList);
        System.out.println();
        /*


            Input: List of
            Process:
                Intermediate Operator:
                Terminal Operator:
            Output: Integer List = {1,2,3,4,5,6,7,8,9,0}
         */

        // Input:

        // Process:

        // Output:

        /*


            Input: List of
            Process:
                Intermediate Operator:
                Terminal Operator:
            Output: Integer List = {1,2,3,4,5,6,7,8,9,0}
         */

        // Input:

        // Process:

        // Output:

        /*


            Input: List of
            Process:
                Intermediate Operator:
                Terminal Operator:
            Output: Integer List = {1,2,3,4,5,6,7,8,9,0}
         */

        // Input:

        // Process:

        // Output:

        /*


            Input: List of
            Process:
                Intermediate Operator:
                Terminal Operator:
            Output: Integer List = {1,2,3,4,5,6,7,8,9,0}
         */

        // Input:

        // Process:

        // Output:

        /*


            Input: List of
            Process:
                Intermediate Operator:
                Terminal Operator:
            Output: Integer List = {1,2,3,4,5,6,7,8,9,0}
         */

        // Input:

        // Process:

        // Output:

        /*


            Input: List of
            Process:
                Intermediate Operator:
                Terminal Operator:
            Output: Integer List = {1,2,3,4,5,6,7,8,9,0}
         */

        // Input:

        // Process:

        // Output:

        /*


            Input: List of
            Process:
                Intermediate Operator:
                Terminal Operator:
            Output: Integer List = {1,2,3,4,5,6,7,8,9,0}
         */

        // Input:

        // Process:

        // Output:

        /*


            Input: List of
            Process:
                Intermediate Operator:
                Terminal Operator:
            Output: Integer List = {1,2,3,4,5,6,7,8,9,0}
         */

        // Input:

        // Process:

        // Output:

        /*


            Input: List of
            Process:
                Intermediate Operator:
                Terminal Operator:
            Output: Integer List = {1,2,3,4,5,6,7,8,9,0}
         */

        // Input:

        // Process:

        // Output:

        /*


            Input: List of
            Process:
                Intermediate Operator:
                Terminal Operator:
            Output: Integer List = {1,2,3,4,5,6,7,8,9,0}
         */

        // Input:

        // Process:

        // Output:

        /*


            Input: List of
            Process:
                Intermediate Operator:
                Terminal Operator:
            Output: Integer List = {1,2,3,4,5,6,7,8,9,0}
         */

        // Input:

        // Process:

        // Output:

        /*


            Input: List of
            Process:
                Intermediate Operator:
                Terminal Operator:
            Output: Integer List = {1,2,3,4,5,6,7,8,9,0}
         */

        // Input:

        // Process:

        // Output:

        /*


            Input: List of
            Process:
                Intermediate Operator:
                Terminal Operator:
            Output: Integer List = {1,2,3,4,5,6,7,8,9,0}
         */

        // Input:

        // Process:

        // Output:

        /*


            Input: List of
            Process:
                Intermediate Operator:
                Terminal Operator:
            Output: Integer List = {1,2,3,4,5,6,7,8,9,0}
         */

        // Input:

        // Process:

        // Output:
    }
}
