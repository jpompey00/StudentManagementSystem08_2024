package org.example.models;

import org.example.interfaces.User;

public class Student implements User {
    static int idNumber = 110000;
    public Student(){

    }

    public Student(String firstName, String lastName, int age, int grade, char gender, String currentClass, float gpa){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.grade = grade;
        this.gender = gender;
        this.id = idNumber;
        idNumber++;

        this.currentClass = currentClass;
        this.gpa = gpa;

        this.login = String.format("%s%s%s.%s@schoolmail.org", this.firstName, this.lastName.charAt(0),
                Integer.toString(this.id).substring(3,5),currentClass);
    }


    private int id;
    private String firstName;
    private String lastName;

    String login;
    String password;

    private int age;
    private int grade;
    private char gender;

    private String currentClass;
    private float gpa;


    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {this.firstName = firstName;}


    public String getLastName(){return lastName;}

    public void setLastName(String lastName) {this.lastName = lastName;}


    public int getAge() {
        return age;
    }
    public void setAge(int age) {this.age = age;}


    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getLogin(){ return login;}

    public void setPassword(String password) {this.password = password;}

    public void setCurrentClass(String n){
        this.currentClass = n;
    }

    public String getCurrentClass(){
        return currentClass;
    }

    public float getGpa(){
        return gpa;
    }

    @Override
    public String toString(){
        return String.format("%s %s, Age: %s, Grade: %s, Gender: %s. Current Class: %s, GPA: %s",
                firstName,lastName,age,grade,gender,currentClass,gpa);
    }








}
