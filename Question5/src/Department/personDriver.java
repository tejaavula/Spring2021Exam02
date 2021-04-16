/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Department;

/**
 *
 * @author Tejaswi Avula
 */
public class personDriver {

    /**
     * prints the output
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person p  = new Person("Tejaswi","1115 North College Drive","0000000000","avula@gmail.com");
        System.out.println(p.toString());
        Student s = new Student("A","Krishna","1116 North College Drive","1111111111","teja@gmail.com");
        System.out.println(s.toString());
        Employee e = new Employee("HCL",5000000,"4/13/2022","sekhar","1117 North College Drive","2222222222","aswi@gmail.com");
        System.out.println(e.toString());
        Faculty f = new Faculty(8,3,"VU",2500000,"4/13/2022","Mahi","1118 North College Drive","3333333333","mahi@gmail.com");
        System.out.println(f.toString());
        Staff s1 = new Staff("professor","VU",3500000,"4/12/2022","KRIS","1119 North College Drive","44444444444","kris@gmail.com");
        System.out.println(s1.toString());
        
    }
    
}
