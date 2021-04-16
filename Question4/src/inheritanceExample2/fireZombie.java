/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceExample2;

/**
 *FireZombie
 * @author Tejaswi Avula
 */
public class fireZombie extends zombie{

    /**
     * constructor of firezombie
     * @param name
     */
    public fireZombie(String name) {
        super(name);
    }

    /**
     * It overrides the Zombie method
     * @return
     */
    @Override
   public String charge(){
        return "Iam a fire zombie";
    }
    
}
