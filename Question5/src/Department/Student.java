/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Department;

/**
 * It is a subclass extends person
 * @author Tejaswi Avula
 */
public class Student extends Person {
    private String grade;
    private final String classStatus="Graduate";

    /**
     * It is a constructor of Student
     * @param grade
     * @param name
     * @param address
     * @param phoneNumber
     * @param emailAddress
     */
    public Student(String grade, String name, String address, String phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);
        this.grade = grade;
    }

    /**
     * returns grade
     * @return
     */
    public String getGrade() {
        return grade;
    }

    /**
     * returns class status
     * @return
     */
    public String getClassStatus() {
        return classStatus;
    }

    /**
     * returns to string of the student
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + String.format("Grade: %s\nStatus: %s\n", getGrade(), classStatus);
    }
    
    
    
}
