package com.assignment1;

public class Question3 {
    public static void main(String[] args){
        getDigitsFromInteger(987654);
    }

    // Breaks and integer down into the individual digits
    private static void getDigitsFromInteger(int a){
        int length = String.valueOf(a).length();
        int count = 0;
        int[] digits = new int[length];

        while (a > 0){
            digits[count] = a % 10;
            count++;
            a /= 10;
        }

        for(count = 0; count < digits.length; count++){
            System.out.print(digits[count] + " ");
        }
    }
}
