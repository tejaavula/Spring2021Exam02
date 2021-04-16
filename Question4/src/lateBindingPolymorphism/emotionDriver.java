/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lateBindingPolymorphism;

/**
 * Driver class
 *
 * @author Tejaswi Avula
 */
public class emotionDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        emotion e = new happy();
        e.type();
        emotion g = new sad();
        g.type();
        e = new emotion();
        e.type();
    }

}
