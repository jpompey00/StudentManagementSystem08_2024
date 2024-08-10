package org.example.models;
import org.example.interfaces.User;

public class Staff implements User {
    static int idNumber = 210000;

    public Staff(){}

    public Staff(String firstName, String lastName, int age, char gender,
                 String password, String position, int salary){
        this.id = idNumber;
        idNumber++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.login = String.format("%s.%s%s%s@schoolmail.org", firstName, lastName, age, gender);
        this.password = password;
        this.position = position;
        this.salary = salary;

    }

    int id;
    String firstName;
    String lastName;
    int age;
    char gender;
    String login;
    String password;
    String position;
    int salary;

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public void setFirstName(String n) {
        this.firstName = n;
    }

    @Override
    public void setLastName(String n) {
        this.lastName = n;
    }

    @Override
    public void setAge(int n) {
        this.age = n;
    }

    @Override
    public void setPassword(String n) {
        this.password = n;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getPosition(){
        return position;
    }
    public void setPosition(String n){
        this.position = n;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int n){
        this.salary = n;
    }
}
