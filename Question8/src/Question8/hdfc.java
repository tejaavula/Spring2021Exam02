/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8;

/**
 *
 * @author Tejaswi Avula
 */
public class hdfc extends bank{

    public hdfc(String name, String address) {
        super(name, address);
    }

    @Override
    public void interest() {
         System.out.println("Interest is 10.5%"); //To change body of generated methods, choose Tools | Templates.
    }
    
}//end of the HDFC class
