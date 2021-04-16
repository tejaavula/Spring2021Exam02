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
public interface InterfaceExample2 {
    default void print(){
        System.out.println("This is default method");
    }
    public abstract void display();
}
