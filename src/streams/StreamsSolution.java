package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
            Given an array of integers, create a stream and print only the even numbers.

            Input: List of Integers = {12,43,35,26,86,75,99,22,3,5,63,5,77,44}
            Process:
                Intermediate Operator: filter(n -> n%2 == 0) → filters all even numbers
                Terminal Operator: toList()
            Output: Integer List = {12,26,86,22,44}
         */
        System.out.println("PROBLEM: Given an array of integers, create a stream and print only the even numbers.");
        // Input:
        List<Integer> randomNumbers = Arrays.asList(12,43,35,26,86,75,99,22,3,5,63,5,77,44);
        System.out.println("Input: " + randomNumbers);

        // Process:
        List<Integer> allEvenNumbers = randomNumbers.stream()
                                                    .filter(n -> n%2 == 0)
                                                    .toList();
        // Output:
        System.out.println("Output: " + allEvenNumbers);
        System.out.println();

        /*
            Generate the first 10 natural numbers using Stream.iterate() and print them.

            Input: No need
            Process:
                Intermediate Operator: Stream.iterate(1, n -> n+1) → iterate number referencing value '1'.
                                             limit(10) → limit iteration up to 10 only.
                Terminal Operator: toList()
            Output: 10 natural numbers
         */
        System.out.println("PROBLEM: Generate the first 10 natural numbers using Stream.iterate() and print them.");
        // Input:

        // Process:
        List<Integer> listOfNaturalNumbers = Stream.iterate(1, n -> n + 1)
                                                   .limit(10)
                                                   .toList();
        // Output:
        System.out.println("Output: " + listOfNaturalNumbers);
        System.out.println();
        /*
            Create a stream from a list of names and sort them alphabetically.

            Input: List of names {"John", "Arthur", "Richard", "Tony", "Barbara", "Nicole"}
            Process:
                Intermediate Operator: sorted(Comparator.naturalOrder()) -> to sort names in ascending order
                Terminal Operator: toList()
            Output: Integer List = {Arthur, Barbara, John, Nicole, Richard, Tony}
         */
        System.out.println("PROBLEM: Create a stream from a list of names and sort them alphabetically.");
        // Input:
        List<String> randomNames = Arrays.asList("John", "Arthur", "Richard", "Tony", "Barbara", "Nicole");
        System.out.println("Input: " + randomNames);
        // Process:
        List<String> sortedNames = randomNames.stream()
                                              .sorted(Comparator.naturalOrder())
                                              .toList();
        // Output:
        System.out.println("Output: " + sortedNames);
        System.out.println();
        /*
            Convert a list of words into a single comma-separated string using Collectors.joining().

            Input: List of
            Process:
                Intermediate Operator:
                Terminal Operator: toList(Collectors.joining(",")) → to join all string into 1
            Output: Integer List = {1,2,3,4,5,6,7,8,9,0}
         */
        System.out.println("PROBLEM: Convert a list of words into a single comma-separated " +
                           "string using Collectors.joining()");
        // Input:
        List<String> listOfWords = Arrays.asList("John", "Arthur", "Richard", "Tony", "Barbara", "Nicole");
        System.out.println("Input: " + randomNames);
        // Process:
        String combinedString = listOfWords.stream().collect(Collectors.joining(","));

        // Output:
        System.out.println("Output: " + combinedString);
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
    }
}
