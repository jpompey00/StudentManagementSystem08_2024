package org.example.controllers;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import org.example.models.*;
import org.example.interfaces.User;


//do I make this abstract?
public class CLI {
    Scanner sc = new Scanner(System.in);
    String loggedInUser;
    Boolean isLoggedIn = false;
    boolean isActive = true;

    public  void startCLI(){
        while(isActive){
            mainMenu();
        }
    }


    public  void mainMenu(){
        //String firstName, String lastName, int age, int grade, char gender, String currentClass, int gpa
        String input;
        System.out.println("1. Create Profile");
        System.out.println("2. Login"); //make this log out
        System.out.println("3. Exit");
        //check if they are logged in first before displaying this option.
        if(isLoggedIn){
            System.out.println("4. View Profile");
        }
        //Some other ones
        input = sc.nextLine();

        if(input.equals("1")){
            createUser();
        }
        if(input.equals("2")){
            loginUser();
        }
        if(input.equals("3")){
            isActive = false;
        }
        if(input.equals("4")){
            viewUserInformation();
        }


    }


    public void loginUser(){
        //enter userName
        System.out.println("Please enter your login");
        String input = sc.nextLine();

        for(User student : fauxDB.fauxDB){
            if(input.equals(student.getLogin())){
                System.out.println("Login successful");
                isLoggedIn = true;
                loggedInUser = input;
                break;
            }
        }
        //then have them be logged in.

        //prompt to set password in the future


    }

    public void createUser(){
        System.out.println("First Name: ");
        String firstName = sc.nextLine();
        System.out.println("Last Name: ");
        String lastName = sc.nextLine();
        System.out.println("Age: ");
        String temp = sc.nextLine();
        int age = Integer.parseInt(temp);
        System.out.println("Grade: ");
        temp = sc.nextLine();
        int grade = Integer.parseInt(temp);
        System.out.println("Gender: ");
        temp = sc.nextLine();
        char gender = temp.charAt(0);
        System.out.println("Current Class: ");
        String currentClass = sc.nextLine();
        System.out.println("GPA: ");
        temp = sc.nextLine();
        float gpa = Float.parseFloat(temp);

        Student student = new Student(firstName,lastName,age,grade,gender,currentClass,gpa);
        //it should add all of this to the Database. Will create Faux Database.
        System.out.printf("Your login is: %s%n",student.getLogin());
        addUserToDatabase(student);

    }

    public void addUserToDatabase(User obj){
        fauxDB.fauxDB.add(obj);
    }

    public void viewUserInformation(){
        for(User user : fauxDB.fauxDB){
            if(loggedInUser.equals(user.getLogin())){
                System.out.println(user.toString());
            }
        }
    }


}
