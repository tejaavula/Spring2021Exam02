/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

import java.util.ArrayList;
import java.util.Date;

/**
 * It is a circle main class
 * @author Tejaswi Avula
 */
public class Circle {
    double radius;

    /**
     * it is a constructor
     * @param radius
     */
    public Circle(double radius) {
        this.radius= radius;
       
    }

    /**
     * returns the output
     * @return
     */
    @Override
    public String toString() {
        return String.format("Circle :\n" +
               " This is the circle with Radius = %.2fcms\n"+
               " This is  the circle with Area=%.2fcms\n" ,radius,Math.PI*radius*radius,2*Math.PI*radius);
               
    }
}
class Main{
    public static void main(String[] args) {
        ArrayList<Object> loan = new ArrayList<>();
        loan.add(new Loan("Tejaswi","Avula",35000,10.5,"5months"));
        loan.add(new Date());
        Circle circle = new Circle(76);
        loan.add(circle);
        for(Object x : loan){
            System.out.println(x.toString());
        }
    }
}

