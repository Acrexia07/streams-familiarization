package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Easy {

    public static void streamsEasy() {
        System.out.println("*--- Streams for Easy category ---*");

        System.out.println("OCTOBER 12, 2025");
        System.out.println("Problem: Get the sum of even numbers");

        /*
            SUM OF EVEN NUMBER

            INPUT: LIST OF INTEGERS
            INTERMEDIATE OPERATION: FILTER (EVEN NUMBER: n%2 == 0)
                                    REDUCE (SUM EACH NUMBER: 0, (a,b) -> a + b)
            TERMINAL OPERATION: toList()
            OUTPUT: Single value of integer

         */

        // Input
        List<Integer> listOfInteger = Arrays.asList(2,3,4,5,6,7,8,9,2,3,4,4,5,6,7);
        System.out.println("Input - List of raw data (integers): " + listOfInteger);
        // Process
        final Integer sumOfEvenNumber = listOfInteger.stream()
                                                     .filter(n -> n % 2 == 0)
                                                     .reduce(0, Integer::sum);

        System.out.println("Output - Sum of all even numbers: " + sumOfEvenNumber);
        System.out.println();
        System.out.println("Problem: Get a list of unique names");

        /*
            UNIQUE NAMES

            INPUT: LIST OF NAMES
            INTERMEDIATE OPERATION: DISTINCT
            TERMINAL OPERATION: toList()
            OUTPUT: Unique names

         */

        // Input
        List<String> listOfNames =
                Arrays.asList("John", "Peter", "Joshua", "Sophia", "Peter", "Mark", "Joshua");
        System.out.println("Input - List of raw data (names): " + listOfNames);

        // Process
        List<String> listOfUniqueNames = listOfNames.stream()
                                                    .distinct()
                                                    .toList();

        // Output
        System.out.println("Output - List of Unique Names: " + listOfUniqueNames);
        System.out.println();
        System.out.println("Problem: Get top 3 largest numbers");

        /*
            TOP 3 LARGEST NUMBERS

            INPUT: LIST OF INTEGERS
            INTERMEDIATE OPERATION: sorted(Comparator.reverseOrder()) → to get the descending order
                                    limit(3) → to get the first 3 elements
            TERMINAL OPERATION: toList()
            OUTPUT: Top 3 largest numbers
         */

        // INPUT
        List<Integer> listOfNumbers = Arrays.asList(150,234,220,956,324,645,674,807);
        System.out.println("Input - List of raw data (numbers): " + listOfNumbers);

        // PROCESS
        List<Integer> top3LargestNumber = listOfNumbers.stream()
                                                       .sorted(Comparator.reverseOrder())
                                                       .limit(3)
                                                       .toList();

        System.out.println("Output - List of Top 3 Largest Number: " + top3LargestNumber);
        System.out.println();
    }
}
