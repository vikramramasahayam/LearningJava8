package com.vik.test;

public class Person {

    Person(String name, Boolean val) {
        this.good = val;
        this.name = name;
    }

    Person(String name, Boolean val, Integer age) {
        this.good = val;
        this.name = name;
        this.age = age;
    }

    private boolean good;
    private String name;
    private Integer age;

    public boolean isGood() {
        return good;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [good=" + good + ", name=" + name + ", age=" + age + "]";
    }

}
