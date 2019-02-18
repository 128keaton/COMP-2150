package com.assignment3.Shapes;

public class Square extends Rectangle {

    /**
     *
     */
    Square() {
        super();
    }

    /**
     * @param side
     */
    Square(double side) {
        super();
        this.setSide(side);
    }

    /**
     * @param side
     * @param color
     * @param filled
     */
    Square(double side, String color, boolean filled) {
        this(side);
        this.setColor(color);
        this.setFilled(filled);
    }

    /**
     * @return
     */
    public double getSide() {
        return Math.sqrt(this.getArea());
    }

    /**
     * @param side
     */
    public void setSide(double side) {
        this.setLength(side);
        this.setWidth(side);
    }

    @Override
    public String toString() {
        String returnedString = String.format("Square (%.2f) Area = %.2f perimeter is %.2f", this.getSide(), this.getArea(), this.getParameter());
        returnedString += "\n color is " + this.getColor();
        returnedString += "\n filled is " + this.isFilled();
        return returnedString;
    }
}
