package com.vik.test;

public class PremitiveDataTypeAdvantage {

    public static void main(String[] args) {

        long start_time = System.nanoTime();

        // Long sum = 0L; // really expensive
        long sum = 0L; // improve performance
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }

        long end_time = System.nanoTime();
        double difference = (end_time - start_time) / 1e6;
        System.out.println(difference);

    }

}
