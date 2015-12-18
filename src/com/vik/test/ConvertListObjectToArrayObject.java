package com.vik.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertListObjectToArrayObject {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("jack", "Joe", "ray");

        Student[] students = names.stream().map((name) -> {
            return new Student(name);
        }).collect(Collectors.toList()).toArray(new Student[names.size()]);

        // Student[] students = names.stream().map(name -> ConvertListObjectToArrayObject.getStudent(name)).collect(Collectors.toList())
        // .toArray(new Student[names.size()]);

        // Student[] students = getStudents(names).toArray(new Student[names.size()]);
        System.out.println(students);
    }

    public static List<Student> getStudents(List<String> names) {
        return names.stream().map(name -> Student.getStudent(name)).collect(Collectors.toList());
    }

    public static Student getStudent(String name) {
        return new Student(name);
    }

}
