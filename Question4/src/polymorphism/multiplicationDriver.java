/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 * Multiplication Driver
 *
 * @author S542422
 */
public class multiplicationDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        multiplication multiply = new multiplication();
        System.out.println(multiply.mul(5, 6));      //method 1 called
        System.out.println(multiply.mul(8, 8, 4));    //method 2 called
        System.out.println(multiply.mul(7, 9.4));    //method 4 called
        System.out.println(multiply.mul(6.5, 3));    //method 3 called
    }

}
