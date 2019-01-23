package com.assignment1;

import java.util.Scanner;

public class Question3 {
    private static final Scanner SCNR = new Scanner(System.in);
    // The assignment wasn't 100% clear, so I did an example plus an input method
    public static void main(String[] args){
        System.out.print("Input a series of non-negative digits to reverse (no spaces, max 9): ");
        reverseAndPrint(SCNR.nextInt());


        System.out.println("\nExample from assignment: ");
        reverseAndPrint(987654);
    }

    // Breaks and integer down into the individual digits
    private static void reverseAndPrint(int a){
        // Gets the amount of digits by converting the int a to a string, then getting the length of the string (cheating?)
        int length = String.valueOf(a).length();
        int count = 0;

        // New, empty array to contain the digits
        int[] digits = new int[length];

        // While integer a is greater than zero, we loop and modify a by taking modulo 10 of the number to get the next number, then we divide by 10 and repeat.
        while (a > 0){
            digits[count] = a % 10;
            count++;
            a /= 10;
        }

        // Loop through the digits and print in the correct order
        for(int i : digits){
            System.out.print(i + " ");
        }
    }
}
