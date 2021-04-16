/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Department;

/**
 * It is a faculy class
 * @author Tejaswi Avula
 */
public class Faculty extends Employee{
    private double officeHours;
    private int numberOfTeachingSubjects;

    /**
     * it is a construtor of faculty
     * @param officeHours
     * @param numberOfTeachingSubjects
     * @param office
     * @param salary
     * @param dateHired
     * @param name
     * @param address
     * @param phoneNumber
     * @param emailAddress
     */
    public Faculty(double officeHours, int numberOfTeachingSubjects, String office, double salary, String dateHired, String name, String address, String phoneNumber, String emailAddress) {
        super(office, salary, dateHired, name, address, phoneNumber, emailAddress);
        this.officeHours = officeHours;
        this.numberOfTeachingSubjects = numberOfTeachingSubjects;
    }

    /**
     * returns office hours
     * @return
     */
    public double getOfficeHours() {
        return officeHours;
    }

    /**
     * returns number of teaching subjects
     * @return
     */
    public int getNumberOfTeachingSubjects() {
        return numberOfTeachingSubjects;
    }

    /**
     * rtuens the tostring
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + String.format("OfficeHours: %s\nNumberOfTeachingSubjects: %d\n", getOfficeHours(),
                getNumberOfTeachingSubjects());
    }
    
}
