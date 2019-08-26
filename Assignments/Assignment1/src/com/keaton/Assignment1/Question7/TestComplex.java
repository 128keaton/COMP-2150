
// kbrleson
// kbrleson@memphis.edu
// Jan 25th, 2019

package com.keaton.Assignment1.Question7;

public class TestComplex {

    public static void main(String[] args) {
        // Create two complex number objects, c1 and c2
        Complex c1 = new Complex(-4.3, 2.5);
        Complex c2 = new Complex(4.33, -12.34);

        // Output the current count of complex number objects and print the actual objects to the screen
        System.out.println("Number of Complex objects: " + Complex.getCount());
        System.out.println("c1: " + c1.toString());
        System.out.println("c2: " + c2.toString());

        // Print the real and imaginary numbers of c1
        System.out.println("Real part of c1:     " + c1.getReal());
        System.out.println("Imaginary part of c1:     " + c1.getImaginary());

        // Test the mutators of c2 by setting a new real and new imaginary number
        c2.setImaginary(3.0);
        c2.setReal(-4.0);
        System.out.println("Testing Mutators - Updated c2: " + c2.toString());

        // Output the magnitude of c1 and c2
        System.out.println("c1 magnitude: " + Complex.magnitude(c1));
        System.out.println("c2 magnitude: " + Complex.magnitude(c2));

        // Create two new complex number objects, c3 and c4
        Complex c3 = new Complex(6.5);
        Complex c4 = new Complex(-4.3, 2.5);

        // Output the current count of complex number objects and print the actual objects to the screen
        System.out.println("c3: " + c3.toString());
        System.out.println("c4: " + c4.toString());
        System.out.println("Number of Complex objects: " + Complex.getCount());

        // Test the equality of c1 and c4, should be true
        System.out.println("Test: c1==c4 => " + c1.equals(c4));

        // Test our arithmetic methods with c1 and c2
        System.out.println("**** Complex Arithmetic test ****\n");
        System.out.println("c1 = " + c1.toString() + "c2 = " + c2.toString());
        System.out.println("c1 + c2 = " + c1.plus(c2));
        System.out.println("c1 - c2 = " + c1.minus(c2));
        System.out.println("c1 * c2 = " + c1.times(c2));

        // Output, again, the total number of complex objects
        System.out.println("Number of Complex objects: " + Complex.getCount());

    }
}
