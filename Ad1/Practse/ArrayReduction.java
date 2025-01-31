package Practse;

import java.util.Arrays;

public class ArrayReduction {
    public static void main(String[] args) {
        // Sample input array
        int[] array = {10, 15, 7, 9};

        System.out.println("Original Array: " + Arrays.toString(array));

        int reductionCount = 0; // To count the number of reductions

        // Perform reductions until one element is left
        while (array.length > 1) {
            array = reduceArray(array); // Perform one reduction
            reductionCount++;

            // Display the array after this reduction
            System.out.println("After reduction " + reductionCount + ": " + Arrays.toString(array));
        }

        // Display the final results
        System.out.println("Total reductions performed: " + reductionCount);
    }

    // Function to perform one reduction operation
    private static int[] reduceArray(int[] array) {
        int[] reducedArray = new int[array.length - 1]; // New array for the reduced elements

        // Compute the differences between adjacent elements
        for (int i = 0; i < array.length - 1; i++) {
            reducedArray[i] = Math.abs(array[i] - array[i + 1]);
        }

        return reducedArray;
    }
}


