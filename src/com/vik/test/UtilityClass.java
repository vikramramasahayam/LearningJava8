package com.vik.test;

public class UtilityClass {

    private UtilityClass() {
        throw new AssertionError();
    }

    public static void print() {
        System.out.println(" Inside print method");
    }

    public static void getInstance() {
        new UtilityClass();
    }

}
