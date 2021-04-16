/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

/**
 * It is a enum class
 * @author Tejaswi Avula
 */
public enum Flavor {

    /**
     * It is a constant pepper of price 2 
     */
    PEPPER(2),

    /**
     * It is a constant cloves of price 3
     */
    CLOVES(3),

    /**
     * It is a constant cardamon of price 4
     */
    CARDAMON(4);
    private final double spicesprice;

    private Flavor(double spicesprice) {
        this.spicesprice = spicesprice;
    }

    /**
     * It returns the price of each spice
     * @return
     */
    public double getSpicesprice() {
        return spicesprice;
    }
    
}
