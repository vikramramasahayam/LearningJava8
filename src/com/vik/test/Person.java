package com.vik.test;

import java.util.Optional;

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

    Person(String name, Boolean val, Integer age, Address address) {
        this.good = val;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    private boolean good;
    private String name;
    private Integer age;
    private Address address;

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

    public Optional<Address> getAddress() {
        return Optional.ofNullable(address);
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person [good=" + good + ", name=" + name + ", age=" + age + ", address=" + address + "]";
    }

}
