/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Department;

/**
 * Person class
 * @author Tejaswi Avula
 */
public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;

    /**
     * it is a constructor
     * @param name
     * @param address
     * @param phoneNumber
     * @param emailAddress
     */
    public Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    /**
     * returns name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * returns address
     * @return
     */
    public String getAddress() {
        return address;
    }

    /**
     * returns phonenumber
     * @return
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * returns email address
     * @return
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * returns tostring
     * @return
     */
    @Override
    public String toString() {
        return String.format("Name: %s\nAddress: %s\nPhoneNumber: %s\nEmailAddress: %s\n", getName(), getAddress(),
                getPhoneNumber(), getEmailAddress());
    }
    
}
