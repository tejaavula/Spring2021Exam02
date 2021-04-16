/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceExample2;

/**
 *Driver class
 * @author Tejaswi Avula
 */
public class zombieDriver {

    /**
     * Returns output
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        zombie z1 = new zombie("Voodoo");
        fireZombie z2 = new fireZombie("Romero");
        waterZombie z3 = new waterZombie("Ghouls");
        airZombie z4= new airZombie("Crawlers");
       System.out.println(z1.charge());
       System.out.println(z2.charge());
       System.out.println(z3.charge());
        System.out.println(z4.charge());
        z1= new fireZombie("abcd");
        System.out.println( z1.charge());
    }
    
}

