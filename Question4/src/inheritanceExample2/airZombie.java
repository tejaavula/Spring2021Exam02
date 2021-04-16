/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceExample2;

/**
 * Air zombie
 *
 * @author Tejaswi Avula
 */
public class airZombie extends zombie {

    /**
     * constructor of air zombie
     *
     * @param name
     */
    public airZombie(String name) {
        super(name);
    }

    /**
     * overrides the method of air zombie
     *
     * @return
     */
    @Override
    public String charge() {
        return "Iam a Air zombie";
    }
}
