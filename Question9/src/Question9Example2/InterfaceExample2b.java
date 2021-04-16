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
public class InterfaceExample2b extends InterfaceExample2a implements InterfaceExample2 {
    public InterfaceExample2b(int x, int y) {
        super(x, y);
    }

    @Override
    public void print() {
        System.out.println("I am in Interface2b class");
        System.out.println("calling default in InterfaceExample2");
        super.print(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void display() {
        System.out.println("Value of X is :"+getX()+" and "+"Y is :"+getY());
    }
}
