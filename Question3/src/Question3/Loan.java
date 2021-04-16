/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

/**
 * It is a Loan class
 * @author Tejaswi Avula
 */
public class Loan {
        String firstName;
    String lastName;
    double amount;
    double rate;
    String time;
    Loan(){

    }

    /**
     * This is the constructor of loan
     * @param firstName
     * @param lastName
     * @param amount
     * @param rate
     * @param time
     */
    public Loan(String firstName, String lastName, double amount, double rate, String time) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.amount = amount;
        this.rate = rate;
        this.time = time;
    }

    /**
     * returns the given methods
     * @return
     */
    @Override
    public String toString() {
        return  "Loan :\n"+
                "      firstname="+firstName+"\n"+
                "      lastname="+lastName+"\n"+
                "      amount=" + amount +"\n"+
                "      rate=" + rate +"\n"+
                "      time=" + time;
    }

}
