## 🧩 Easy Java Stream Problems (50+)

---
### 🔹 Basic Stream Creation & Mapping
1. Create a stream from a list of integers and print each element. **Done: 10/17/2025**
2. Given a list of strings, convert all of them to uppercase using streams.
3. Convert a list of integers to their squares using map.
4. From a list of strings, get the length of each string as a list of integers.
5. Given an array of integers, create a stream and print only the even numbers.
6. Generate the first 10 natural numbers using Stream.iterate() and print them.
7. Create a stream from a list of names and sort them alphabetically.
8. Convert a list of words into a single comma-separated string using Collectors.joining().
9. From a list of names, create a new list where each name starts with a capital letter.
10. Create a stream from a file (use Files.lines) and print all lines.

---
### 🔹 Filtering & Matching
11. Filter out odd numbers from a list of integers.
12. Given a list of names, filter names starting with "A".
13. From a list of numbers, print only those greater than 50.
14. Check if a list of integers contains any even number using anyMatch().
15. Check if all numbers in a list are positive using allMatch().
16. Verify if no string in a list is empty using noneMatch().
17. Given a list of words, count how many contain the letter "e".
18. From a list of names, find the first name starting with "J".
19. From a list of integers, find any number divisible by 3.
20. Remove duplicates from a list using distinct().

---
### 🔹 Reductions & Aggregations
21. Find the sum of all numbers in a list using reduce().
22. Find the product of all numbers in a list using reduce().
23. Find the maximum number in a list using streams.
24. Find the minimum number in a list using streams.
25. Count how many strings have length greater than 5.
26. Find the average of a list of integers using mapToInt().average().
27. Find the total number of characters across all strings in a list.
28. Find the concatenation of all strings in a list.
29. Given a list of integers, find the second largest element using streams.
30. Given a list of numbers, find the sum of squares of even numbers.

---
### 🔹 Collectors & Grouping
31. Group a list of names by their first letter using Collectors.groupingBy().
32. Partition a list of integers into even and odd using Collectors.partitioningBy().
33. Count the number of names for each starting letter.
34. Convert a list of strings into a Set using streams.
35. Collect all numbers greater than 10 into a new List.
36. Collect all unique words from a sentence (split by spaces).
37. Convert a list of integers to a comma-separated String.
38. Create a Map from a list of strings where key = string, value = string length.
39. Group words by their length using streams.
40. From a list of employees (custom class), group by department name.

---
### 🔹 Optional & Find Operations
41. Find the first even number in a list.
42. Find the last element of a stream (hint: reduce).
43. Get the first non-empty string from a list or return "N/A" if none found.
44. Find the minimum string (alphabetically) using min().
45. Find the maximum string length in a list.
46. Given a list of integers, find the first element greater than 100 using findFirst().
47. From a list of words, find any palindrome word.
48. Given a list of integers, check if the list is sorted using streams.
49. Given a list of numbers, return an Optional of the sum (empty if list is empty).
50. From a list of integers, return the first number that is a multiple of both 3 and 5.

---
### 🔹 Miscellaneous / Combined Use
51. Given a list of sentences, find the total number of words.
52. Given a list of numbers, print all numbers after skipping the first 5.
53. Given a list of names, limit the stream to the first 3 elements.
54. Sort a list of strings by their length.
55. Sort a list of integers in descending order.
56. Convert a list of sentences into a flat list of words using flatMap().
57. Given a list of words, remove duplicates and sort alphabetically.
58. From a list of integers, double each odd number and collect results.
59. Create an infinite stream of random numbers and limit it to 10.
60. Generate 5 random integers between 1 and 100 using streams.

---
### 🧠 Bonus (slightly more interesting but still easy)
61. Given a list of students (name, score), find the average score.
62. From a list of employees, find the highest-paid one.
63. From a list of strings, count how many start and end with the same letter.
64. Given a list of integers, print the distinct even numbers sorted ascending.
65. From a list of words, find all unique characters.
66. Given a sentence, count the frequency of each character using Collectors.groupingBy().
67. Given a sentence, find the most frequent word.
68. Create a stream from a range of integers using IntStream.range() and compute their sum.
69. Given a list of integers, remove nulls safely using filter(Objects::nonNull).
70. Given a list of numbers, compute both min and max using summaryStatistics().