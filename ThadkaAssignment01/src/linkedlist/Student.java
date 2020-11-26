/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author Harish Thadka
 */
public class Student {

    private String name;
    private int id;

    /**
     * This constructor sets the instance variables
     *
     * @param name Name of the student
     * @param id Id of the student
     */
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    /**
     * Returns name of the student
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns Id of the student
     *
     * @return Id
     */
    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

}
