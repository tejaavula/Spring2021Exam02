/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceExample2;

/**
 * Zombie and its different types
 *
 * @author Tejaswi Avula
 */
public class zombie {

    private String name;

    /**
     * it is a constructor
     *
     * @param name
     */
    public zombie(String name) {
        this.name = name;
    }

    /**
     * try to return a string
     *
     * @return
     */
    public String charge() {
        return "Different types of zombies";
    }
}
