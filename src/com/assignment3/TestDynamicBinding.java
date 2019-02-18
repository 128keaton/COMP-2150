package com.assignment3;

/**
 * Class which tests our Base/Derived objects
 */
public class TestDynamicBinding {
    /**
     * Main method which creates new Base objects
     * @param args Command-line arguments
     */
    public static void main(String[] args){
        Base b = new Base();
        Derived a = new Derived();

        util(b);
        util(a);
        util(new Derived());
    }

    /**
     * Function which calls methodOfBase() on the passed base object
     * @param base Base object that we call methodOfBase() on
     */
    private static void util(Base base){
        base.methodOfBase();
    }

}
