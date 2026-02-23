package com.ncalderon.challenges;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestConsecutive {

    public static int longestConsecutive(int[] arr) {
        // code goes here
        if (arr == null || arr.length == 0) {
            return 0;
        }

        // Sort the array first
        Arrays.sort(arr);

        Map<Integer, Integer> trackOfSequences = new HashMap<>();
        int longConsecutiveSequence = 1;

        for (int number: arr) {
            // Skip duplicates
            if (trackOfSequences.containsKey(number)) {
                continue;
            }

            int previousNumber = number - 1;
            int counter = trackOfSequences.getOrDefault(previousNumber, 1);
            if (trackOfSequences.containsKey(previousNumber)) {
                trackOfSequences.put(number, ++counter);
            } else {
                trackOfSequences.put(number, counter);
            }

            longConsecutiveSequence = Math.max(longConsecutiveSequence, counter);
        }
        return longConsecutiveSequence;
    }

    /**
     * Alternative approach using HashSet for O(n) time complexity
     * without sorting requirement
     */
    public static int longestConsecutiveOptimal(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        Map<Integer, Integer> dp = new HashMap<>();
        int maxLength = 1;

        for (int num : arr) {
            if (dp.containsKey(num)) {
                continue;
            }

            int left = dp.getOrDefault(num - 1, 0);
            int right = dp.getOrDefault(num + 1, 0);
            int currentLength = left + right + 1;

            // Update the boundaries
            dp.put(num, currentLength);
            dp.put(num - left, currentLength);
            dp.put(num + right, currentLength);

            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        // Test case from problem description
        int[] arr1 = {4, 3, 8, 1, 2, 6, 100, 9};
        System.out.println("Input: " + Arrays.toString(arr1));
        System.out.println("Output: " + longestConsecutive(arr1)); // Expected: 4
        System.out.println("Output (Optimal): " + longestConsecutiveOptimal(arr1)); // Expected: 4

        // Additional test cases
        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println("\nInput: " + Arrays.toString(arr2));
        System.out.println("Output: " + longestConsecutive(arr2)); // Expected: 5

        int[] arr3 = {10, 5, 12, 3, 55, 30, 4, 11, 2};
        System.out.println("\nInput: " + Arrays.toString(arr3));
        System.out.println("Output: " + longestConsecutive(arr3)); // Expected: 4 (2,3,4,5)

        int[] arr4 = {100, 4, 200, 1, 3, 2};
        System.out.println("\nInput: " + Arrays.toString(arr4));
        System.out.println("Output: " + longestConsecutive(arr4)); // Expected: 4 (1,2,3,4)
    }
}
