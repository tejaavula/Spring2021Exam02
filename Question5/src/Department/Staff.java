/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Department;

/**
 * it is a staff class 
 * @author Tejaswi Avula
 */
public class Staff extends Employee {
    private String title;

    /**
     * It is a constructor of staff
     * @param title
     * @param office
     * @param salary
     * @param dateHired
     * @param name
     * @param address
     * @param phoneNumber
     * @param emailAddress
     */
    public Staff(String title, String office, double salary, String dateHired, String name, String address, String phoneNumber, String emailAddress) {
        super(office, salary, dateHired, name, address, phoneNumber, emailAddress);
        this.title = title;
    }

    /**
     * returns title
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     * returns to string
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + String.format("Title: %s\n", getTitle());
    }

   
    
}
