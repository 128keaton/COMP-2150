package com.assignment1;

public class Question4 {
    private static int[] dupArray1 = {105, 123, -921, -1, 123, 8, 8, 8, -921};
    private static int[] dupArray2 = {10, 22, 10, 20, 11, 22, 22};

    public static void main(String[] args) {
        checkForDuplicates(dupArray1);
    }

    private static void checkForDuplicates(int[] arrayToCheck) {
        System.out.println("Original Array:");
        for (int i = 0; i < arrayToCheck.length; i++) {
            System.out.print(arrayToCheck[i] + " ");
            if((i + 1) != arrayToCheck.length && arrayToCheck[i] == arrayToCheck[i + 1]){
            }
        }


        System.out.println("\nArray with unique values: ");

    }
}
