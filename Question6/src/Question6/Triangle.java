/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

/**
 * it is a triangle class
 * @author Tejaswi Avula
 */
public class Triangle extends GeometricObject {

    private double side1;
    private double side2;
    private double side3;
    private String color;
    private boolean isFilled;

    /**
     * this is a constructor
     * @param side1
     * @param side2
     * @param side3
     * @param color
     * @param isFilled
     */
    public Triangle(double side1, double side2, double side3, String color, boolean isFilled) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.color = color;
        this.isFilled = isFilled;
    }
    
    //Setters and getters

    /**
     * returns the side1
     * @return
     */
    public double getSide1() {
        return side1;
    }

    /**
     * returns the side2
     * @return
     */
    public double getSide2() {
        return side2;
    }

    /**
     *returns the side3
     * @return
     */
    public double getSide3() {
        return side3;
    }

    /**
     * returns the color
     * @return
     */
    public String getColor() {
        return color;
    }

    /**
     * returns whether the color is filled or not 
     * @return
     */
    public boolean isIsFilled() {
        return isFilled;
    }

    /**
     * sets the side1
     * @param side1
     */
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    /**
     * sets the side2
     * @param side2
     */
    public void setSide2(double side2) {
        this.side2 = side2;
    }

    /**
     * sets the side3
     * @param side3
     */
    public void setSide3(double side3) {
        this.side3 = side3;
    }

    /**
     * sets the color
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * sets to fill the color
     * @param isFilled
     */
    public void setIsFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }
    
    //inheriting the abstract method calcArea

    /**
     * it is the method used to calculate the area
     * @return
     */
    @Override
    public double calcArea() {
                double s = calcPerimeter() / 2;// semi perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    //inherting the abstarct method calcPerimeter

    /**
     * it is used calculate the perimeter
     * @return
     */
    @Override
    public double calcPerimeter() {
        return getSide1() + getSide2() + getSide3();
    }
    
    //toString Method

    /**
     * it is used to return the string
     * @return
     */
    @Override
    public String toString() {
        return "Side1: " + side1 + ", Side2: " + side2 + ", Side3: " + side3 + ", Color: " + color + ", Is Filled: " + isFilled;
    }
    
}