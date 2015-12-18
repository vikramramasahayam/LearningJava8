package com.vik.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class OptinalMonadExample {

    public static void main(String[] args) {

        Map<String, Person> personMap = new Map<String, Person>();

        Address address1 = new Address();
        address1.setCity("Philly");
        personMap.put("Vikram", new Person("Vikram", true, 30, address1));

        Address address2 = new Address();
        // address2.setCity("Nalgonda");
        personMap.put("Anusha", new Person("Anusha", true, 25, address2));

        List<String> names = Arrays.asList("Anusha", "Vikram");
        names.stream().forEach((n) -> {
            personMap.find(n).flatMap(p -> p.getAddress()).flatMap(a -> a.getCity()).ifPresent((c) -> {
                System.out.println(" Printing City : " + c);
            });
        });

        // Optinal.ofNullable doesn't work for primitives. So need ot use OptinalInt
        names.stream().forEach((n) -> {
            personMap.find(n).flatMap(p -> p.getAddress()).flatMap(a -> a.getZipCode()).ifPresent((z) -> {
                System.out.println(" Printing City : " + z);
            });
        });
    }

    public static class Map<T, U> extends HashMap<T, U> {

        private static final long serialVersionUID = 1L;

        public Optional<U> find(T key) {
            return Optional.ofNullable(super.get(key));
        }

    }

}
