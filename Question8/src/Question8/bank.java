/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8;

/**
 *
 * @author Tejaswi Avula
 */

    public abstract class bank {
    private String name; // It is the variable name 
    private String address;//It is the variable address
    
    /**
     * It is a constructor of Bank
     * @param name
     * @param address
     */
    public bank(String name, String address) {
        this.name = name;
        this.address = address;
       }

    /**
     * It is used to get the name
     * @return
     */
    public String getName() {
        return name; // returns the name
    }

    /**
     * It is used to get the address
     * @return
     */
    public String getAddress() {
        return address;//It returns the address
    }

    /**
     * It is used to set the name 
     * @param name
     */
    public void setName(String name) {
        this.name = name;//this a setter for name
    }

    /**
     *It is used to set the address 
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;//this is a setter for address
    }

    @Override
    public String toString() {
        return  "name=" + name + ", address=" + address ; //It returns the toString()
    }

    /**
     * It is the abstract method where we have not given any parameters
     */
    public abstract void interest();
    
    
}//end of the bank class


