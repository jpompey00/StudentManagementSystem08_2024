package org.example.controllers;

import org.example.interfaces.User;
import org.example.models.Student;

import java.util.ArrayList;

public class fauxDB {

    //testing
    static ArrayList<User> fauxDB = new ArrayList<User>();

    private static void createDummyDatabase(){
        fauxDB.add(new Student("Alice", "Johnson", 16, 11, 'F', "5A", 3.8f));
        fauxDB.add(new Student("Bob", "Smith", 17, 12, 'M', "6C", 3.2f));
        fauxDB.add(new Student("Charlie", "Davis", 15, 10, 'N', "4B", 3.5f)); // Non-binary
        fauxDB.add(new Student("Diana", "Garcia", 16, 11, 'F', "5D", 3.9f));
        fauxDB.add(new Student("Edward", "Brown", 14, 9, 'M', "3E", 3.1f));
        fauxDB.add(new Student("Fiona", "Wilson", 17, 12, 'F', "6A", 4.0f));
        fauxDB.add(new Student("George", "Miller", 15, 10, 'M', "4F", 2.8f));
        fauxDB.add(new Student("Hana", "Lee", 16, 11, 'F', "5C", 3.7f));
        fauxDB.add(new Student("Ibrahim", "Khan", 14, 9, 'M', "3B", 3.3f));
        fauxDB.add(new Student("Jasmine", "Martinez", 17, 12, 'F', "6E", 3.6f));
        fauxDB.add(new Student("Kai", "Nguyen", 15, 10, 'N', "4A", 3.4f)); // Non-binary
        fauxDB.add(new Student("Liam", "O'Connor", 16, 11, 'M', "5B", 3.0f));
    }


}
