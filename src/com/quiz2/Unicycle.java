package com.quiz2;

public class Unicycle extends Cycle {
    Unicycle(){
        super(1);
    }

    Unicycle(int x){
        super(x);
    }

    @Override
    public String toString() {
        return "Unicycle with number of wheels = " + this.getNumWheels() + " \n Description: hard to ride";
    }
}
