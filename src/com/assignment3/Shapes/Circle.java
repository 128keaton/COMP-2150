package com.assignment3.Shapes;

public class Circle extends Shape {
    private double radius;

    Circle(){
        super();
        this.radius = 1.0;
    }

    Circle(double radius){
        super();
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(this.getRadius(), 2);
    }

    public double getPerimeter(){
        return 2 * Math.PI * this.getRadius();
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        String returnedString = "The " + this.getColor() + " circle area is " + this.getArea();
        returnedString += "\nthe Perimeter is " + this.getPerimeter();
        returnedString += "\nfilled is " + this.isFilled();

        return returnedString;
    }
}
