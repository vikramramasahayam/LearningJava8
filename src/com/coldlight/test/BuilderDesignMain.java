package com.coldlight.test;

public class BuilderDesignMain {

    public static void main(String[] args) {
        Student student = new Student().setFirstName("Vikram").setLastName("Ramasahayam");
        System.out.println(student);
    }

}
