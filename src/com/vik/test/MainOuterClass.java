package com.vik.test;

import com.vik.test.OuterClass.InnerClass;

public class MainOuterClass {

    public static void main(String[] args) {

        OuterClass clazz = new OuterClass();

        InnerClass inclazz = clazz.new InnerClass();
    }

}
