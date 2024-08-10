package org.example.interfaces;

public interface User {

    String getFirstName();
    String getLastName();
    int getId();
    int getAge();
    String getLogin();

    void setFirstName(String n);
    void setLastName(String n);
    void setAge(int n);
    void setPassword(String n);
}
