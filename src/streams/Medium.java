package streams;

import model.Person;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Medium {

    public static void streamsMedium() {
        System.out.println("*--- Streams for Medium category ---*");

        System.out.println("Problem: Group list of strings by word length");

        /*
            GROUPED LIST OF STRING BY WORD LENGTH

            INPUT: List of Strings
            INTERMEDIATE OPERATION: NONE
            TERMINAL OPERATION: collect(Collectors.groupingBy(String::length)) -> store data in a map container
                                                                                  categorizing list of strings
                                                                                  by word length.
            OUTPUT: Map of String by word length
         */

        // INPUT
        List<String> listOfFruits = Arrays.asList("mango", "banana", "apple", "durian", "orange", "watermelon");
        System.out.println("Input - List of raw data (fruits): " + listOfFruits);

        // PROCESS
        Map<Integer, List<String>> groupByWordLength = listOfFruits.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println("Output - Grouped by word length: " + groupByWordLength);
        System.out.println();
        System.out.println("Problem: Flatten list of list and filter integers divisible by 5");

        /*
            FLATTEN LIST OF LISTS

            INPUT: List of list of integers
            INTERMEDIATE OPERATION: flatmap(Collection::stream)
                                    filter(a -> a%5 == 0)
                                    sorter() → for organizing data
            TERMINAL OPERATION: toList()
            OUTPUT: List of all numbers divisible by 5
         */

        // INPUT
        List<List<Integer>> listOfIntegerLists = Arrays.asList(
                Arrays.asList(25,34,65),
                Arrays.asList(23,78,35),
                Arrays.asList(5,15,23,45)
        );
        System.out.println("Input - List of raw data (list of integer lists): " + listOfIntegerLists);

        // PROCESS
        List<Integer> listOfInteger = listOfIntegerLists.stream()
                .flatMap(Collection::stream)
                .filter(n -> n%5 == 0)
                .sorted()
                .toList();

        System.out.println("Output - List of integer divisible by 5: " + listOfInteger);
        System.out.println();

        System.out.println("Problem: Partition person by adults and minors");
        /*
            PARTITION ADULTS AND MINORS

            INPUT: List of instantiated person objects
            INTERMEDIATE OPERATION: NONE
            TERMINAL OPERATION: collect(Collection.partitioningBy(person -> person.getAge() > 18))
            OUTPUT: List of partitioned values of person by adults and minors
         */

        // INPUT
        List<Person> people = Arrays.asList(
                new Person("John", 12),
                new Person("Samantha", 26),
                new Person("Arthur", 30),
                new Person("Galbrena", 17),
                new Person("Gabriel", 18)
        );
        System.out.println("Input - List of raw data (list of persons): " + people);

        // PROCESS
        Map<Boolean, List<Person>> categorizedByAge =
                people.stream().collect(Collectors.partitioningBy(person -> person.getAge() >= 18));
        List<Person> adults = categorizedByAge.get(true);
        List<Person> minors = categorizedByAge.get(false);

        System.out.println("Output - ADULTS: " + adults);
        System.out.println("Output - MINORS: " + minors);
    }
}
