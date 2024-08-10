package org.example.models;


import java.util.ArrayList;
import java.util.List;


public class Teacher extends Staff{
    static int idNumber = 220000;


    public Teacher(String firstName, String lastName, int age, char gender,
                 String password, String position, int salary, String currentClass){
        super(firstName,lastName,age,gender,password,position,salary);
        this.id = idNumber;
        idNumber++;
        this.login = String.format("%s.%s%s%s@schoolmail.org", firstName, lastName, age, gender);
        this.currentClass = currentClass;
    }

    ArrayList<Integer> gradesAvailableToTeach = new ArrayList<>();

    //use this to crossreference the list of students.

    String currentClass;


    public String getCurrentClass() {
        return currentClass;
    }

    public void setCurrentClass(String currentClass) {
        this.currentClass = currentClass;
    }

    public ArrayList<Integer> getGradesAvailableToTeach() {
        return gradesAvailableToTeach;
    }

    public void setGradesAvailableToTeach(ArrayList<Integer> gradesAvailableToTeach) {
        this.gradesAvailableToTeach = gradesAvailableToTeach;
    }

}
