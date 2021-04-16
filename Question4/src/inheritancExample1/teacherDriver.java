/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancExample1;

/**
 * Driver class
 *
 * @author Tejaswi Avula
 */
public class teacherDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        javaTeacher teach = new javaTeacher();
        System.out.println(teach.collegeName);
        System.out.println(teach.designation);
        System.out.println(teach.mainSubject);
        teach.work();
    }

}
