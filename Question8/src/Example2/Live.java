/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example2;

/**
 *This is the class Live
 * @author Tejaswi Avula
 */
public class Live  extends Album{

    /**
     * This is the constructor of the Live
     * @param name
     * @param year
     */
    public Live( String name, int year) {
        super(name, year);
     
    }
    

 @Override
    public String type() {
        
            System.out.println("This is Live"); //Here we will overeride the abstract method which is written in the super class
           //To change body of generated methods, choose Tools | Templates
     return null;
    }
}//end of the Live class