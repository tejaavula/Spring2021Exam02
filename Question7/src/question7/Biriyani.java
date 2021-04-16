/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

/**
 * This is the driver class of Flavor
 * @author Tejaswi Avula
 */
public class Biriyani {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Flavor f = Flavor.CARDAMON;//calling default enum constant from default enum cardamon
        System.out.println("Cardamon price is "+"="+" "+f.getSpicesprice());//printing the value of an enum constant 
        Flavor f1 = Flavor.CLOVES;//calling default enum constant from default enum clove
        System.out.println("Cloves price is "+"="+" "+f1.getSpicesprice());//printing the value of an enum constant 
        Flavor f2 = Flavor.PEPPER;//calling default enum constant from default enum pepper
        System.out.println("Pepper price is "+"="+" "+f2.getSpicesprice());//printing the value of an enum constant 
    }
    
}
