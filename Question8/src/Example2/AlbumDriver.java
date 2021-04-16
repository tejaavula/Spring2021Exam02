/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example2;

/**
 * Driver class
 * @author Tejaswi Avula
 */
public class AlbumDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Live l1= new Live("Live",2020);
        Split l2=new Split("Split",2021);
        System.out.println(l1);
        l1.type();
        System.out.println(l2);
        l2.type();
    }
    
}
