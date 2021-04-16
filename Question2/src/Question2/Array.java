/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 * checking whether the given arrays are identical or not
 * @author Tejaswi Avula
 */
public class Array {

    /**
     * Here equals method accepts two two-dimensional arrays as arguments, and
     * then returns true if they are strictly identical or returns false if not
     * identical
     *
     * @param m1
     * @param m2
     * @return
     *
     */
    public static boolean equals(int[][] m1, int[][] m2) {
        if (m1.length == m2.length) {
            for (int i = 0; i < sqrt(m1.length); i++) {
                for (int j = 0; j < sqrt(m1.length); j++) {
                    if (m1[i][j] != m2[i][j]) {
                        return false;
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }//end of the equals method

    /**
     * starting the main method
     *
     * @param args
     */
    public static void main(String[] args) {
        //creating a two dimensional arrays of type int
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];
        //creating an object for scanner class
        Scanner scan = new Scanner(System.in);
        //making the user to enter the elements for the first array
        System.out.print("Enter list1: ");
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                m1[i][j] = scan.nextInt();
            }
        }
//making the user to enter the elements for the second array
        System.out.print("Enter list2: ");
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[0].length; j++) {
                m2[i][j] = scan.nextInt();
            }
        }
        scan.close();
        //displaying the result
        if (equals(m1, m2)) {
            System.out.println("The two arrays are strictly identical");
        } else {
            System.out.println("The two arrays are not strictly identical");
        }

    }

}//end of the array
