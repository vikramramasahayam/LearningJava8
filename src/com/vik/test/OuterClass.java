package com.vik.test;

public class OuterClass {

    private static void printOuterName() {
        System.out.println("I am outer Class");
    }

    public class InnerClass {

        public void innerClassMethod() {
            printOuterName();
        }
    }

}
