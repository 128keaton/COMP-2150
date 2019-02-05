package com.assignment2.Car;

/**
 * Too many abstraction. TOO MANY
 */
public class Car extends Vehicle {
    private int numberOfWheels;
    private int numberOfDoors;
    private boolean isManual;
    private double engineSize;
    private int roadServiceMonths;
    private String name;

    /**
     * Constructor that initializes a car object, extending the vehicle class
     *
     * @param name Name of the vehicle
     * @param size Engine size in liters
     * @param wheels Number of wheelybois
     * @param doors Number of doors on the car
     * @param isManual Does the car have a manual transmission?
     */
    Car(String name, double size, int wheels, int doors, boolean isManual, int roadServiceMonths){
        super(name, size);
        this.name = name;
        this.engineSize = size;
        this.numberOfWheels = wheels;
        this.numberOfDoors = doors;
        this.isManual = isManual;
        this.roadServiceMonths = roadServiceMonths;
    }

    /**
     * Method to change the velocity and print the different in the console
     * @param amount Amount to changeVelocity by
     */
    public void changeVelocity(int amount){
        int oldVelocity = this.getCurrentVelocity();
        this.setCurrentVelocity(oldVelocity + amount);

        this.move();

        if(amount < 0){
            System.out.println("Decrease speed by " + amount + " from " + oldVelocity + " => new velocity is " + this.getCurrentVelocity());
        }else {
            System.out.println("Increase speed by " + amount + " from " + oldVelocity + " => new velocity is " + this.getCurrentVelocity());
        }

        this.shiftGear(this.getCurrentVelocity());
    }

    /**
     * Updates the steering angle and prints the difference
     * @param amount int
     */
    public void changeSteeringAngle(int amount){
        int oldAngle = this.getSteeringAngle();
        this.setSteeringAngle(oldAngle + amount);

        System.out.println("Vehicle.steer(): turn from " + oldAngle + " to " + this.getSteeringAngle() + " degrees");
    }

    /**
     * Method which shifts the transmission to a new gear provided the velocity. Prints the old and new values
     * @param newVelocity The new, improved, updated velocity to calculate the new gear from
     */
    private void shiftGear(double newVelocity){
        int oldGear = this.getCurrentGear();
        super.setCurrentGear(determineGearToShift(newVelocity));
        System.out.println("Car.ShiftGear(): shift from " + oldGear + " -> gear: " + this.getCurrentGear());
    }

    /**
     * Outputs a bunch of helpful data to a string
     * @return String
     */
    public String toString(){
        String outputString = "Car Specifications: \n";
        outputString += super.toString();
        outputString += ("  # of wheels = " + this.numberOfWheels + "\n");
        outputString += ("  doors = " + this.numberOfDoors + "\n");
        outputString += ("  isManual = " + this.isManual + "\n");
        outputString += ("  Engine Size = " + this.engineSize + "L\n");
        outputString += ("  roadServiceMonths = " + this.roadServiceMonths + "\n");

        return outputString;
    }

    /**
     *
     * @param velocity how much more faster to go
     * @return int
     */
    private int determineGearToShift(double velocity){
        if (velocity >= 0 && velocity <= 10){
            return 1;
        }else if(velocity >= 11 && velocity <= 20){
            return 2;
        }else if(velocity >= 21 && velocity <= 30){
            return 3;
        }else if(velocity >= 31 && velocity <= 40){
            return 4;
        }else{
            return 5;
        }
    }
}
