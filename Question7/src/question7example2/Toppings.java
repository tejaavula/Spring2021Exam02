/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7example2;

/**
 * it is a enum class toppings
 * @author Tejaswi Avula
 */
public enum Toppings {
    /**
     * it is a constant lettuce of topping price 0 and extra topping price of 0.5
     */
    LETTUCE(0, 0.5),
    /**
     * it is a constant onions of topping price 0 and extra topping price of 0.5
     */
    ONIONS(0, 0.5),
    /**
     * it is a constant olives of topping price 0 and extra topping price of 0.5
     */
    OLIVES(0, 0.5),
    /**
     * it is a constant spinach of topping price 0 and extra topping price of 0.5
     */
    SPINACH(0, 0.5),
    /**
     * it is a constant Jalpenos of topping price 0 and extra topping price of 0.5 
     */
    JALPENOS(0, 0.5),
    /**
     * it is a constant cucumbers of topping price 0 and extra topping price of 0.5 
     */
    CUCUMBERS(0, 0.5),
    /**
     * it is a constant carrots of topping price 0 and extra topping price of 0.5 
     */
    CARROTS(0, 0.5),
    /**
     *it is a constant chicken of topping price 0 and extra topping price of 2
     */
    CHICKEN(0, 2);

    private double toppingPrice;
    private double extraToppingPrice;

    private Toppings(double toppingPrice, double extraToppingPrice) {
        this.toppingPrice = toppingPrice;
        this.extraToppingPrice = extraToppingPrice;
    }

    /**
     * it is used to get the topping price
     * @return
     */
    public double getToppingPrice() {
        return toppingPrice;
    }

    /**
     * used to return the price of the topping
     * @return
     */
    public double getExtraToppingPrice() {
        return extraToppingPrice;
    }
}
