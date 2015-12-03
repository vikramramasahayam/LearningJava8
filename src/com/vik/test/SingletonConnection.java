package com.vik.test;

public enum SingletonConnection {

    INSTANCE;

    private final Connection connection;

    private SingletonConnection() {
        connection = new Connection("Vikram");
    }

    public Connection getConnection() {
        return connection;
    }

    public class Connection {

        private final String name;

        private Connection(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "name : " + name;
        }
    }
}
