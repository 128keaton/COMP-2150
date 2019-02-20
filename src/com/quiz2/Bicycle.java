package com.quiz2;

public class Bicycle extends Unicycle {
    Bicycle(){
        super(2);
    }
    Bicycle(int x){
        super(x);
    }

    @Override
    public String toString() {
        return "Bicycle with number of wheels = " + this.getNumWheels() + " \n Description: after riding the tricycle";
    }
}
