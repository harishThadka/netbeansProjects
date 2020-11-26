/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

;

/**
 *
 * @author Harish Thadka
 */
public class StudentOperations {

    private LinkedList<Student> studentList;

    /**
     * This constructor sets instance variable
     */
    public StudentOperations() {
        studentList = new LinkedList<Student>();
    }

    /**
     * Returns list of students
     * @return studentList
     */
    public LinkedList<Student> getStudentList() {
        return studentList;
    }

    /**
     * This method add students in student list
     * @throws FileNotFoundException if file not found throws exception
     */
    public void addStudents() throws FileNotFoundException {

        Scanner scan = new Scanner(new File("input.txt"));

        while (scan.hasNext()) {
            String name = scan.next() + " " + scan.next();
            int id = scan.nextInt();
            Student stu = new Student(name, id);// Creating instance of student
            studentList.add(stu);// Adding student into student list
        }
    }

    /**
     * This method removes duplicate elements from student List
     */
    public void removeDuplicates() {

        HashSet<Integer> set = new HashSet<>();// Hash set created to find and remove duplicates
        for (int i = 0; i < studentList.size(); i++) {
            if (!set.add(studentList.get(i).getId())) {// if set already contains the element then returns false
                studentList.remove(i); //removes duplicate element from student list
                i--;// Decreasing iterator as removed one element
            }
        }
    }

    /**
     * This method returns duplicate names of studentList
     * @param iterator iterator of student list
     * @return duplicate names
     */
    public String displayDuplicatesNamesByRecursion(Iterator<Student> iterator) {
        String s = "";
        HashSet<String> duplicates = new HashSet<>(); // Hash set created to find and remove duplicates
        for (int i = 0; i < studentList.size(); i++) {
            for (int j = 1; j < studentList.size(); j++) {
                if (studentList.get(i).getId() == studentList.get(j).getId() && i != j) {// checking elements are equal and not in same position
                    duplicates.add(studentList.get(i).getName());
                    break;
                }
            }
        }

        for (String duplicate : duplicates) {
            s = duplicate + ", " + s;// Adding duplicate elements to string
        }
        return s;
    }
}
