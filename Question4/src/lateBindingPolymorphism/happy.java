/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lateBindingPolymorphism;

/**
 * It is a subclass
 * @author Tejaswi Avula
 */
public class happy extends emotion {
    
    /**
     * It is a method that overrides the emotion class
     */
    @Override
   public void type(){
        System.out.println("Happiness");
        }
}
