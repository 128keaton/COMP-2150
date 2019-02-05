package com.assignment2.Car;

public class LX470 extends Car {
    private int roadServiceMonths;

    /**
     * Constructor - Constructs a new LX470 object extending the car object
     * @param roadServiceMonth How many months until service..I guess?
     */
    public LX470(int roadServiceMonth){
        // Initializes a car object with the parameters passed
        super("Lexus LX470", 4.7, 4, 4, false, roadServiceMonth);
        this.roadServiceMonths = roadServiceMonth;
    }
}
