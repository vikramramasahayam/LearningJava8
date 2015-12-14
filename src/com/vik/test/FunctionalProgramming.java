package com.vik.test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgramming {

    public static void main(String args[]) {
        List<String> myList = Arrays.asList("a1", "b1", "c3", "c1", "c2");

        myList.stream().filter(s -> s.startsWith("c")).map(String::toUpperCase).sorted().forEach(System.out::println);

        List<String> newList = myList.stream().filter(s -> s.startsWith("c")).map(String::toUpperCase).collect(Collectors.toList());

        System.out.println("New List : " + newList);

        myList.forEach(System.out::println);

        final List<BigDecimal> prices = Arrays.asList(
                new BigDecimal("10"), new BigDecimal("30"), new BigDecimal("17"),
                new BigDecimal("20"), new BigDecimal("15"), new BigDecimal("18"),
                new BigDecimal("45"), new BigDecimal("12"));

        /*
         * BigDecimal totalOfDiscountedPrices = BigDecimal.ZERO; for(BigDecimal price : prices) { if(price.compareTo(BigDecimal.valueOf(20)) > 0) totalOfDiscountedPrices =
         * totalOfDiscountedPrices.add(price.multiply(BigDecimal.valueOf(0.9))); } System.out.println("Total of discounted prices: " + totalOfDiscountedPrices);
         */

        System.out.println(prices.stream().filter(price -> price.compareTo(BigDecimal.valueOf(20)) > 0)
                .map(price -> price.multiply(BigDecimal.valueOf(0.9))).reduce(BigDecimal::multiply));

    }

}
