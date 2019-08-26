package com.keaton.Assignment2.Car;

public class Vehicle {
    private int currentVelocity;
    private int steeringAngle;
    private double engineSize;
    private int currentGear;
    private String name;

    /**
     * Vehicle constructor, requiring the name and the engine size of the vehicle
     * @param name Name of the vehicle
     * @param engineSize the size of the engine's displacement in liters
     */
    Vehicle(String name, double engineSize){
        this.name = name;
        this.engineSize = engineSize;
    }

    /**
     * Prints the vehicle's current movement status to the console
     */
    public void move(){
        System.out.println("Vehicle.move(): Moving at " + this.currentVelocity + " in direction " + this.steeringAngle);
    }

    /**
     * Getter to return the current velocity of the vehicle
     * @return int value containing the current velocity
     */
    public int getCurrentVelocity(){
        return this.currentVelocity;
    }

    /**
     * Setter to set the new velocity of the vehicle
     * @param newVelocity int value containing the new velocity
     */
    public void setCurrentVelocity(int newVelocity){
        this.currentVelocity = newVelocity;
    }

    /**
     * Getter to return the current gear the car's transmission is in
     * @return the int value of the current gear
     */
    public int getCurrentGear(){
        return this.currentGear;
    }

    /**
     * Setter to set the transmission's gear
     * @param newGear int value of the new gear
     */
    public void setCurrentGear(int newGear){
        this.currentGear = newGear;
    }

    /**
     * Getter that returns the current steering angle in degrees
     * @return the int value containing the steering angle
     */
    public int getSteeringAngle(){
        return this.steeringAngle;
    }

    /**
     * Setter to set the car's steering angle
     * @param steeringAngle int value containing the new angle
     */
    public void setSteeringAngle(int steeringAngle){
        this.steeringAngle = steeringAngle;
    }

    /**
     * Method to create a string with helpful debugger values
     * @return a string containing the name and engine size
     */
    public String toString(){
        String outputString = ("  name = " + this.name + "\n");
        outputString += ("  size = " + this.engineSize + "L\n");

        return outputString;
    }

}
