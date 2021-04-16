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
    public class sbi extends bank {

    /**
     * SBI is subclass for bank
     * @param name
     * @param address
     */
    public sbi(String name, String address) {
        super(name, address);//It is the constructor for sbi where I have used the same parameters of super class
    }

    @Override
    public void interest() {
        System.out.println("Interest is 12%"); //To change body of generated methods, choose Tools | Templates.
    }//end of the sbi class

}
