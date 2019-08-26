package com.keaton.Assignment3.Shapes;

public class Shape {
    private String color;
    private boolean filled;

    Shape(){
        this.color = "Red";
        this.filled = true;
    }

    Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    /**
     *
     * @return
     */
    public String getColor() {
        return this.color;
    }

    /**
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     *
     * @return
     */
    public boolean isFilled() {
        return this.filled;
    }

    /**
     *
     * @param filled
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "The Shape color is " + this.color + " and the isFilled status is " + this.filled;
    }
}
