/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7example2;

/**
 * It is a enum cheese 
 * @author Tejaswi Avula
 */
public enum Cheese {
    /**
     * It is a constant american cheese of price 0.55
     */
    AMERICAN_CHEESE(0.55),
    /**
     * it is a constant cheddar cheese of price 0.60
     */
    CHEDDAR_CHEESE(0.60),
    /**
     *it is a constant cheddar jack cheese of price 0.70
     */
    CHEDDAR_JACK_CHEESE(0.70),
    /**
     * it is a constant pepper jack cheese of price 0.59
     */
    PEPPER_JACK_CHEESE(0.59),
    /**
     * it is a constant queso cheese of price 0.65
     */
    QUESO_CHEESE(0.65),
    /**
     * it is a constant swiss cheese of price 0.60
     */
    SWISS_CHEESE(0.60),
    /**
     * it is a constant blue cheese of price 0.60
     */
    BLUE_CHEESE(0.60),
    /**
     * it is a constant ranch of price 0.60
     */
    RANCH(0.60),
    /**
     * it is a constant no cheese of price 0.0
     */
    NO_CHEESE(0.0);

    private double CheesePrice;

    private Cheese(double CheesePrice) {
        this.CheesePrice = CheesePrice;
    }

    /**
     * it returns the cheese price
     * @return
     */
    public double getCheesePrice() {
        return CheesePrice;
}
}   