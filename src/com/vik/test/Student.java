package com.vik.test;

public class Student {

    private String firstName;
    private String lastName;

    public Student() {}

    public Student(String name) {
        this.firstName = name;
    }

    public static Student getStudent(String name) {
        return new Student(name);
    }

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
