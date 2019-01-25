package com.assignment1.Question7;

public class Complex {
    // MARK: Private instance variables
    private double imaginary;
    private double real;

    // MARK: Private object variables
    private static int count = 0;

    // MARK: Initializers
    public Complex(double imaginary, double real) {
        this.imaginary = imaginary;
        this.real = real;
        count++;
    }

    public Complex(double imaginary) {
        this(imaginary, 0.0);
    }

    public Complex(){
        this(0.0, 0.0);
    }

    // MARK: Instance Getters
    public double getReal() {
        return this.real;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    // MARK: Object Getters
    public static int getCount() {
        return count;
    }

    // MARK: Mutators
    public void setReal(double r) {
        this.real = r;
    }

    public void setImaginary(double i) {
        this.imaginary = i;
    }

    // MARK: Instance methods

    // Add a complex number object to a complex number object, returning a new complex object
    public Complex plus(Complex c) {
        Complex n = new Complex();
        n.imaginary = this.imaginary + c.imaginary;
        n.real = this.real + c.real;
        return n;
    }

    // Subtract a complex number by a complex number, returning a new complex object
    public Complex minus(Complex c) {
        Complex n = new Complex();
        n.imaginary = this.imaginary - c.imaginary;
        n.real = this.real - c.real;
        return n;
    }

    // Multiply a complex number object by a complex number object
    public Complex times(Complex z) {
        Complex n = new Complex();

        // FOIL
        double r1 = this.real * z.real;
        double i1 = this.real * z.imaginary;
        double i2 = this.imaginary * z.real;
        double i3 = this.imaginary * z.imaginary;
        // i2 = -1
        double r2 = i3 * -1;

        n.imaginary = (i1 + i2);
        n.real = (r1 + r2);

        return n;
    }

    // Multiply the imaginary and real numbers by a double 'a'
    public Complex times(double a) {
        Complex n = new Complex();

        n.imaginary = this.real * a;
        n.real = this.real * a;

        return n;
    }

    // Compute the magnitude (distance from the origin) of complex number c
    public static double magnitude(Complex c) {
        return Math.sqrt(Math.pow(c.real, 2) + Math.pow(c.imaginary, 2));
    }

    // Outputs a complex number object into a human readable string.
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

    // MARK: Object methods

    // Compare the equality of a complex number with the complex number C
    public boolean equals(Complex c) {
        return this.imaginary == c.imaginary && this.real == c.real;
    }

}
