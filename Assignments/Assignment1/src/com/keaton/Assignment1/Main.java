package com.keaton.Assignment1;

import com.keaton.Assignment1.Question7.TestComplex;

public class Main {
    public static void main(String[] args){
        System.out.println("Begin output/input of all assignment questions");

        // Question 2: Take two integers and perform math on them
        printDivider();
        System.out.println("Question 2 - Performing basic math on integers: ");
        printDivider();
        Question2.main(args);


        // Question 3: Reverse an integer
        printDivider();
        System.out.println("Question 3 - Reversing an integer");
        printDivider();
        Question3.main(args);


        // Question 4: Remove duplicates from two different arrays
        printDivider();
        System.out.println("Question 4 - Removing duplicates from arrays");
        printDivider();
        Question4.main(args);


        // Question 5: Show elements that appear in both string arrays
        printDivider();
        System.out.println("Question 5 - Elements that appear in both arrays:");
        printDivider();
        Question5.main(args);


        // Question 6: Print a method, instance, and class variable
        printDivider();
        System.out.println("Question 6 - Instance, Local, and Class variables: ");
        printDivider();
        Question6.main(args);


        // Question 7: Create two classes - Complex and TestComplex
        printDivider();
        System.out.println("Question 7 - Test a Complex object: ");
        printDivider();
        TestComplex.main(args);
    }

    private static void printDivider(){
        System.out.println("----------------------------");
    }
}
