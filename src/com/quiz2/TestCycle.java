package com.quiz2;

public class TestCycle {
    public static void main(String[] args){
        Cycle C = new Cycle();
        Cycle.ride(C);

        Unicycle U = new Unicycle();
        Unicycle.ride(U);

        Bicycle B = new Bicycle();
        Bicycle.ride(B);

        Tricycle T = new Tricycle();
        Tricycle.ride(T);
    }
}
