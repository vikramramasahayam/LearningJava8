package com.coldlight.test;

import static org.apache.commons.lang3.ArrayUtils.isEmpty;
import static org.apache.commons.lang3.StringUtils.isNotBlank;
import static org.apache.commons.lang3.Validate.isTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.SortedMap;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        System.out.println("started ");
        String s = "Hello";
        try {

            isTrue(isNotBlank(s), " S is blank");
        } catch (Exception e) {
            System.out.println("Exception is : " + e);
        }

        String ss = null;
        Integer value = Optional.ofNullable(ss).map(String::length).orElse(-1);
        System.out.println("Value is : " + value);

        Double emptyDouble = Double.NaN;
        System.out.println("It is empty : " + emptyDouble);

        List<String> emptyList = Collections.emptyList();
        System.out.println("Is List Empty : " + isEmpty(emptyList.toArray()));

        SortedMap<String, String> sotredMap;

        Row row = new Row();
        row.setVal(true);

        // Boolean flag = Boolean.valueOf(Optional.ofNullable(row.getVal()).orElse("true"));

        // boolean flag = Optional.ofNullable(row.getVal()).map(b -> (boolean) b).orElse(false);
        //
        // System.out.println(flag);

        Optional.ofNullable(row).ifPresent(v -> v.print());

        Optional.ofNullable(row).ifPresent(Row::print);

        List<Person> persons = Arrays.asList(new Person("Vikram", false), new Person("Uma", true), new Person("Anusha", true),
                new Person("Vikram", false));

        System.out.println(persons.stream().map(Person::getName).collect(Collectors.toList()));

        System.out.println(persons.stream().filter(Person::isGood).collect(Collectors.toList()));

        persons.stream().map(p -> p.getName()).forEach(e -> System.out.println(e));

        System.out.println("-----------------");
        persons.stream().map(p -> p.getName()).forEachOrdered(e -> System.out.println(e));

    }

}
