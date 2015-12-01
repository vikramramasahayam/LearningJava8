package com.coldlight.test;

public class Student {

    private String firstName;
    private String lastName;

    public Student setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Student setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public String toString() {
        return "FirstName : " + firstName + " LastName : " + lastName;
    }
}
