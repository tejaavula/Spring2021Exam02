/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceExample2;

/**
 * Water Zombie
 *
 * @author Tejaswi Avula
 */
public class waterZombie extends zombie {

    /**
     * constructor of waterzombie
     *
     * @param name
     */
    public waterZombie(String name) {
        super(name);
    }

    /**
     * overrides the zombie of this particular method
     *
     * @return
     */
    @Override
    public String charge() {
        return "Iam a water zombie";
    }
}
