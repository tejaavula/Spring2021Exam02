/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example2;

/**
 *This is the class Album
 * @author Tejaswi Avula
 */
public abstract  class Album {
    private String name;
    private int  year;

    /**
     * This is the constructor
     * @param name
     * @param year
     */
    public Album(String name, int year) {
        this.name = name;
        this.year = year;
    }

    /**
     * This is used to get the name 
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * here we could get the year
     * @return
     */
    public double getYear() {
        return year;
    }

    /**
     *Here we could set the name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Here we could set the year
     * @param year
     */
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return  "name=" + name + ", year=" + year;//This the toString()
    }

    /**
     * This is the abstract method of type String
     * @return
     */
    public abstract String type();
}//end of the class Album   