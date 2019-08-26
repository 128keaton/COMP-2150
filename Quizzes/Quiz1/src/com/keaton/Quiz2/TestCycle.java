package com.keaton.Quiz2;

public class TestCycle {
    public static void main(String[] args) {
        Cycle C = new Cycle();
        Cycle.ride(C);

        C = new Unicycle();
        Cycle.ride(C);

        C = new Bicycle();
        Cycle.ride(C);

        C = new Tricycle();
        Cycle.ride(C);
    }
}
