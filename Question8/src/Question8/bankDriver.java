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
public class bankDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        sbi s1=new sbi("SBI","Narasaraopet");
        hdfc s2=new hdfc("HDFC","Guntur");
        System.out.println(s1);
        s1.interest();
        System.out.println(s2);
        s2.interest();
        

        // TODO code application logic here
    }
    
}//end of BankDriver class


