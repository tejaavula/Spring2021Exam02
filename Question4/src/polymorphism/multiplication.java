/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 * Multiplication of different types
 *
 * @author Tejaswi Avula
 */
public class multiplication {

    /**
     * It is used to return multiplication of 2 numbers
     *
     * @param a
     * @param b
     * @return
     */
    public int mul(int a, int b) {  //method 1
        return a * b;
    }

    /**
     * It is used to return multiplication of 3 numbers
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public int mul(int a, int b, int c) { //method 2
        return a * b * c;
    }

    /**
     * It is used to return multiplication of 2 numbers of different data type
     *
     * @param a
     * @param b
     * @return
     */
    public int mul(double a, int b) { //method 3
        return (int) a * b;
    }

    /**
     * It is used to return multiplication of 2 numbers of different data type
     *
     * @param a
     * @param b
     * @return
     */
    public int mul(int a, double b) { //method 4
        return a * (int) b;
    }
}
