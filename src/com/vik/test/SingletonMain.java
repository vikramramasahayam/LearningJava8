package com.vik.test;

import com.vik.test.SingletonConnection.Connection;

public class SingletonMain {

    public static void main(String[] args) {

        Connection conn1 = SingletonConnection.INSTANCE.getConnection();

        System.out.println(conn1);
    }

}
