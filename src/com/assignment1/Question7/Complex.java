package com.assignment1.Question7;

public class Complex {
    private double imaginary;
    private double real;

    private static int count = 0;

    // Initializers
    public Complex(double imaginary, double real) {
        this.imaginary = imaginary;
        this.real = real;
        count++;
    }

    public Complex(double imaginary) {
        this.imaginary = imaginary;
        this.real = 0.0;
        count++;
    }

    public Complex(){
        this.imaginary = 0.0;
        this.real = 0.0;
        count++;
    }

    public double getReal() {
        return this.real;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    // Getters
    public static int getCount() {
        return count;
    }

    // Mutators
    public void setReal(double r) {
        this.real = r;
    }

    public void setImaginary(double i) {
        this.imaginary = i;
    }

    // Object methods
    public Complex plus(Complex c) {
        Complex n = new Complex();
        n.imaginary = this.imaginary + c.imaginary;
        n.real = this.real + c.real;
        return n;
    }

    public Complex minus(Complex c) {
        Complex n = new Complex();
        n.imaginary = this.imaginary - c.imaginary;
        n.real = this.real - c.real;
        return n;
    }

    public Complex times(Complex z) {
        Complex n = new Complex();

        // FOIL
        double realOne = this.real * z.real;
        double imaginaryOne = this.real * z.imaginary;
        double imaginaryTwo = this.imaginary * z.real;
        double imaginaryThree = this.imaginary * z.imaginary;
        // i2 = -1
        double realTwo = imaginaryThree * -1;

        n.imaginary = (imaginaryOne + imaginaryTwo);
        n.real = (realOne + realTwo);

        return n;
    }

    public Complex times(double a) {
        Complex n = new Complex();

        // FOIL
        double realOne = this.real * a;
        double imaginaryOne = this.real * a;
        double imaginaryTwo = this.imaginary * a;
        double imaginaryThree = this.imaginary * a;
        // i2 = -1
        double realTwo = imaginaryThree * -1;

        n.imaginary = (imaginaryOne + imaginaryTwo);
        n.real = (realOne + realTwo);

        return n;
    }

    public static double magnitude(Complex c) {
        return Math.abs(c.imaginary) + c.real;
    }

    public boolean equals(Complex c) {
        return this.imaginary == c.imaginary && this.real == c.real;
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
