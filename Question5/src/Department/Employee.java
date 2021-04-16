/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Department;

/**
 * It is an employee class
 * @author Tejaswi Avula
 */
public class Employee extends Person{
    private String office;
    private double salary;
    private String dateHired;

    /**
     * it is a constructor of employee
     * @param office
     * @param salary
     * @param dateHired
     * @param name
     * @param address
     * @param phoneNumber
     * @param emailAddress
     */
    public Employee(String office, double salary, String dateHired, String name, String address, String phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    /**
     *returns office
     * @return
     */
    public String getOffice() {
        return office;
    }

    /**
     * returns salary
     * @return
     */
    public double getSalary() {
        return salary;
    }

    /**
     * returns date hired
     * @return
     */
    public String getDateHired() {
        return dateHired;
    }

    /**
     * returns tostring that is used to override the person
     * @return
     */
    @Override
    public String toString() {
         return super.toString() + String.format("Office: %s\nSalary: %.2f\nDate_hired: %s\n", getOffice(), getSalary(),
                getDateHired());
    }
    
}
