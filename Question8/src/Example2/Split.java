/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example2;

/**
 *This is also  the subclasss of Album which is Split
 * @author Tejaswi Avula
 */
public class Split extends Album {

    /**
     * This is the constructor
     * @param name
     * @param year
     */
    public Split(String name, int year) {
        super(name, year);
    }

    @Override
    public String type() {
        System.out.println("This is split");
        return null;
          //To change body of generated methods, choose Tools | Templates.
    }
    
}//end of the Split