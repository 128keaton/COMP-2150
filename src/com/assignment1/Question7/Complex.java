package com.assignment1.Question7;

public class Complex {
    private double imaginary;
    private double real;

    private static int count = 0;


    Complex(double a, double b) {

    }

    Complex(double a) {

    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public static int getCount() {
        return count;
    }

    public void setReal(double r) {
        real = r;
    }

    public void setImaginary(double i) {
        imaginary = i;
    }

    public Complex plus(Complex c) {
        return this;
    }

    public Complex minus(Complex c) {
        return this;
    }

    public Complex times(Complex c) {
        return this;
    }

    public Complex times(double a) {
        return this;
    }

    public static double magnitude(Complex c) {
        return 0.0;
    }

    public boolean equals(Complex c) {
        return this == c;
    }

    public String toString() {
        String s;
        if (imaginary == 0.0)
            s = "" + real;
        else if (real == 0.0)
            s = imaginary + "i";
        else if (imaginary < 0)
            s = real + " - " + (-imaginary) + "i";
        else
            s = real + " + " + imaginary + "i";
        return s;
    }
}
