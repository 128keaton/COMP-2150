// kbrleson
// kbrleson@memphis.edu
// Jan 25th, 2019

package com.assignment1;

import java.util.Arrays;

public class Question4 {
    private static final int[] DUP_ARRAY_1 = {105, 123, -921, -1, 123, 8, 8, 8, -921};
    private static final int[] DUP_ARRAY_2 = {10, 22, 10, 20, 11, 22, 22};

    public static void main(String[] args) {
        checkForDuplicates(DUP_ARRAY_1);
        checkForDuplicates(DUP_ARRAY_2);
    }

    private static void checkForDuplicates(int[] x) {
        // I create a temporary array here to contain all the non-duplicate elements. The length is set to the original array length because we don't know yet how many duplicates we have
        int[] tempArray = new int[x.length];

        // Temporary count variable to count how many non duplicate elements
        int j = 0;

        System.out.println();
        System.out.println("Original Array:");

        // Loop through the original array
        for(int i : x){
            System.out.print(i + " ");
            // use the arrayContains method to find out of the new array already contains an element. If not, then we append the element to the tempArray and count up on the j integer
            if(!arrayContains(tempArray, i)){
                tempArray[j] = i;
                j++;
            }
        }
        // Make a copy of the array, only getting the first j elements so we don't have any zeroes.
        int[] finalArray = Arrays.copyOf(tempArray, j);

        System.out.println();
        System.out.println("\nArray with unique values:");

        // Finally, loop through the final array and output the values
        for(int b : finalArray){
            System.out.print(b + " ");
        }
        System.out.println();
    }

    // A boolean method which returns true if an array a contains element b
    private static boolean arrayContains(int[] a, int b){
            for (int i : a) {
                if (i == b) {
                    return true;
                }
            }
        return false;
    }
}
