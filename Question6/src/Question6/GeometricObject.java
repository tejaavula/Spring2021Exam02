/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

/**
 * This is a Geometric object class
 * @author Tejaswi Avula
 */
public abstract class GeometricObject {
    
    //abstract methods that can be used/inherited in other classes.

    /**
     * It is an abstract method which is used for calculate the area
     * @return
     */
    public abstract double calcArea();

    /**
     * It is an abstract method which is used for calculating the perimeter
     * @return
     */
    public abstract double calcPerimeter();
    
    
}
