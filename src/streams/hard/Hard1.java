package streams.hard;

import model.Player;
import model.Transaction;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Hard1 {

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

        System.out.println("Problem: Custom sort and distinct");
        /*
            CUSTOM SORT AND DISTINCT
            Task: Sort by score descending → remove duplicates by name → collect top 5

            INPUT: List of objects (with name and score) → Created Player Entity
            INTERMEDIATE OPERATION: sorted(Comparator.comparingInt(Player::getScore)
                                                     .reversed()) → compare all player scores to sort then
                                                                    make it in descending order
                                    filter(p -> seenNames.add(p.getName)) → Create a set container (seenName)
                                                                            to store all unique values (player's name)
                                    limit(5) → retrieve only 5 elements starting on the first element
            TERMINAL OPERATION: toList()
            OUTPUT:
         */

        // Input

        List<Player> playerList = Arrays.asList(
                new Player("sonic", 9990),
                new Player("tails", 5678),
                new Player("shadow", 9870),
                new Player("mario", 4389),
                new Player("shinobi", 9989),
                new Player("kirito", 8598),
                new Player("shinobi", 9989),
                new Player("mario", 4389)
        );
        System.out.println("Input - List of raw data: " + playerList);

        // Process
        Set<String> seenNames = new HashSet<>();
        List<Player> top5Players = playerList.stream()
                                             .sorted(Comparator.comparingInt(Player::getScore)
                                                               .reversed())
                                             .filter(p -> seenNames.add(p.getName()))
                                             .limit(5)
                                             .toList();

        // Output
        System.out.println("Output: " + top5Players);
        System.out.println();

        System.out.println("Problem: Complex reduce");
        /*
            COMPLEX REDUCE
            Task: Reduce to calculate total income and total expense in a single reduce operation

            INPUT: List of transactions (with amount and type)
            INTERMEDIATE OPERATION: none
            TERMINAL OPERATION: partitioningBy → to separate two categories
                                summingInt → to some all integers
            OUTPUT: toList()
         */

        // Input
        List<Transaction> transactionList = Arrays.asList(
                new Transaction(1000, "income"),
                new Transaction(2000, "expense"),
                new Transaction(3000, "income"),
                new Transaction(4000, "expense"),
                new Transaction(5000, "income")
        );
        System.out.println("Input - List of raw data: " + transactionList);

        // Process -> (totalIncome, totalExpense)
        Map<Boolean, Integer> totals =
                transactionList.stream()
                               .collect(Collectors.partitioningBy(
                                           t -> t.getType().equals("income"), // separate all income
                                           Collectors.summingInt(Transaction::getAmount) // sum all amounts
                                       ));
        // Output
        System.out.println("*---- Output ----*");
        System.out.println("Total Income: " + totals.get(true));
        System.out.println("Total Expense: " + totals.get(false));

        System.out.println();
    }
}
