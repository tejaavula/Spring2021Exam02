/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9Example2;

/**
 *
 * @author Tejaswi Avula
 */
public class InterfaceExample2Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InterfaceExample2b ex=new InterfaceExample2b(2,6);
        System.out.println("Multiplication is :"+ex.Multiply());
        ex.display();
        ex.print();
    }
    
}
