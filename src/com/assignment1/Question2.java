package com.assignment1;
import java.util.Scanner;

public class Question2 {
    private static int x;
    private static int y;

    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        System.out.print("Input 1st integer: ");
        x = scnr.nextInt();

        System.out.print("Input 2nd integer: ");
        y = scnr.nextInt();

        printSum(x, y);
        printDifference(x, y);
        printProduct(x, y);
        printAverage(x, y);
        printDistance(x, y);
        printMaxMin(x, y);
    }

    private static void printSum(int a, int b){
        System.out.println("Sum of two integers: " + (a + b));
    }

    private static void printDifference(int a, int b){
        System.out.println("Difference of two integers:  " + (a - b));
    }

    private static void printProduct(int a, int b){
        System.out.println("Product of two integers:  " + (a * b));
    }

    private static void printAverage(int a, int b){
        System.out.println("Average of two integers:  " + ((a + b) / 2.0));
    }

    private static void printDistance(int a, int b){
        System.out.println("distance = " + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
        System.out.println("Distance of two integers: " + Math.abs((a - b)));
    }

    private static void printMaxMin(int a, int b){
        int maxInteger = (a > b) ? a : b;
        int minInteger = (a < b) ? a : b;

        System.out.println("Max integer: " + + maxInteger);
        System.out.println("Min integer: " + + minInteger);
    }
}
