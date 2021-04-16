/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancExample1;

/**
 * Teaches Java
 *
 * @author Tejaswi Avula
 */
public class javaTeacher extends teacher {

    String mainSubject = "Core Java";

    /**
     * It is used to override the work() in Teacher as it is the subclass
     */
    @Override
    public void work() {
        System.out.println("Teaches Java");
    }

}
