package com.assignment3.Shapes;

public class Rectangle extends Shape {
    private double width;
    private double length;

    /**
     *
     */
    Rectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    /**
     *
     * @param color
     * @param filled
     */
    Rectangle(String color, boolean filled) {
        super(color, filled);
    }

    /**
     *
     * @param width
     * @param length
     */
    Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    /**
     *
     * @param area
     * @param color
     * @param filled
     */
    Rectangle(double area, String color, boolean filled) {
        super(color, filled);

    }

    /**
     *
     * @param length
     * @param width
     * @param color
     * @param filled
     */
    Rectangle(double length, double width, String color, boolean filled) {
        super(color, filled);
    }

    /**
     *
     * @return
     */
    public double getWidth() {
        return this.width;
    }

    /**
     *
     * @param width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     *
     * @return
     */
    public double getLength() {
        return this.length;
    }

    /**
     *
     * @param length
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     *
     * @return
     */
    public double getArea() {
        return this.length * this.width;
    }

    /**
     *
     * @return
     */
    public double getParameter() {
        return (this.length * 2) + (this.width * 2);
    }

    @Override
    public String toString() {
        String returnedString = String.format("Rectangle(%.2f, %.2f) Area is %.2f, Perimeter is %.2f", this.length, this.width, this.getArea(), this.getParameter());
        returnedString += "\n color is " + this.getColor();
        returnedString += "\n filled is " + this.isFilled();
        return returnedString;
    }
}
