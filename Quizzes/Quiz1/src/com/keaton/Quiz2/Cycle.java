package com.keaton.Quiz2;

public class Cycle {
    private int numWheels;

    Cycle(){
        numWheels = 0;
    }

    Cycle(int x){
        numWheels = x;
    }

    public static void ride(Cycle x){
        System.out.println(x);
    }

    public int getNumWheels() {
        return numWheels;
    }

    @Override
    public String toString() {
        return "Cycle with number of wheels = " + this.numWheels + " \n Description: base class for cycle";
    }
}
