package com.assignment2;


import com.assignment2.Car.LX470;

public class Main {

    public static void main(String[] args) {

        final int roadServiceMonth = 12;

        // Creates a new LX470 object, which extends the Car class, which extends the Vehicle class
        LX470 lx = new LX470(roadServiceMonth);

        // Change the velocity, outputting the direction, old speed, new speed, old gear, new gear,
        lx.changeVelocity(35);
        System.out.println();

        // Change the LX470's direction (steeringAngle) 3 times (45, 10, -5)
        lx.changeSteeringAngle(40);
        lx.changeSteeringAngle(15);
        lx.changeSteeringAngle(-5);
        System.out.println();

        // Increase speed by 20, outputting the direction, old speed, new speed, old gear, new gear,
        lx.changeVelocity(25);
        System.out.println();

        // change direction (20) ;
        lx.changeSteeringAngle(25);
        System.out.println();

        // change speed by (-20, 5);
        lx.changeVelocity(-20);
        System.out.println();

        lx.changeVelocity(5);
        System.out.println();

        // change direction (10) : Reduce speed (-10)
        lx.changeSteeringAngle(12);
        System.out.println();

        lx.changeVelocity(-8);
        System.out.println();

        System.out.println(lx); // toString() in mini will display the stuff
    }

}
