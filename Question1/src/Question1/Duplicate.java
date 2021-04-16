/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Removing Duplicates
 * @author Tejaswi Avula
 */
public class Duplicate{

    /** 
     * created an array list for lists of type integer
     */
    public static ArrayList<Integer> lists = new ArrayList<>();

    /**
     *
     * @param list
     */
    public static void removeDuplicate(ArrayList<Integer> list) {
               // Create a new ArrayList
        ArrayList<Integer> List = new ArrayList<Integer>();

        // Loop through the original list
        for (int i : list) {
            // If this element is not present in List then add it
            if (!List.contains(i)) {
                List.add(i);
            }
        }
        lists = List;

    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter ten integers: ");
        int i = 0;
        //Adding values to ArrayList
        for(i=0;i<10;i++) {
            lists.add(scan.nextInt());
       }
        removeDuplicate(lists);
        System.out.print("The distinct integers are");
        for (int list : lists) {
            System.out.print(" " + list);
        }
        scan.close();

    }
}//end of the duplicate

