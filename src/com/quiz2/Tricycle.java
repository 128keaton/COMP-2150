package com.quiz2;

public class Tricycle extends Bicycle {
    Tricycle(){
        super(3);
    }
    Tricycle(int x){
        super(x);
    }

    @Override
    public String toString() {
        return "Tricycle with number of wheels = " + this.getNumWheels() + " \n Description: bicycle for children";
    }
}
