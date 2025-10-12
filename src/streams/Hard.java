package streams;

import java.util.List;
import java.util.stream.IntStream;

public class Hard {

    public static void streamsHard() {
        System.out.println("*--- Streams for Hard category ---*");

        System.out.println("Problem: Parallel processing large dataset");

        /*
            PARALLEL PROCESSING LARGE DATASET
            Task: Multiply each by 2 → filter numbers divisible by 7 → sum using parallel stream

            INPUT: List of 1 million integers
            INTERMEDIATE OPERATION: map(n -> n * 2)
                                    filter(n -> n%7 == 0)
                                    parallel()
                                    reduce(0, (a,b) -> a + b)
            TERMINAL OPERATION: NONE
            OUTPUT: NONE
         */

        // INPUT
        List<Integer> numbers = IntStream.rangeClosed(1, 1_000_000)
                                         .boxed()
                                         .toList();
        System.out.println("Input - List of raw data (total count of dataset): " + numbers.toArray().length);

        // Process
        Integer sumOfNumbers = numbers.stream()
                                      .map(n -> n * 2)
                                      .filter(n -> n % 7 == 0)
                                      .parallel()
                                      .reduce(0, Integer::sum);

        System.out.println("Output - Result after processed: " + sumOfNumbers);
        System.out.println();
    }
}
