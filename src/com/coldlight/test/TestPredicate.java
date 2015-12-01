package com.coldlight.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestPredicate {

    public static void main(String[] args) {

        // Example :1

        /*
         * List<Person> persons = Arrays.asList(new Person("Vikram", false), new Person("Uma", true), new Person("Anusha", true));
         * 
         * System.out.println(persons.stream().filter(Person::isGood).collect(Collectors.toList()));
         */

        /*
         * Example : 2 List<Person> goodPersons = filterPerson(persons, (Person p) -> "Uma".equals(p.getName())||p.isGood());
         * 
         * System.out.println(goodPersons);
         */

        // Example : 3
        /*
         * List<Person> persons = Arrays.asList(new Person("Vikram", false,32),new Person("Uma",true,55),new Person("Anusha",true,26));
         * 
         * persons.sort((Person p1,Person p2) -> p1.getAge().compareTo(p2.getAge()));
         * 
         * System.out.println(persons);
         */

        /*
         * Example : 4 Thread t = new Thread (() -> System.out.println("Hello World") ); t.run();
         */

        /*
         * BooleanSupplier bs = () -> false; System.out.println(bs.getAsBoolean());
         * 
         * Integer x = 10; Integer y = 5; IntSupplier is = () -> x - y; System.out.println(is.getAsInt());
         */

        List<String> names = Arrays.asList("Vikram", "Anusha", "Uma");
        names.stream().forEach(a -> {

            String output = exampleSuplier(() -> a);
            System.out.println("Output is : " + output);
        });

        /*
         * Consumer<Person> consume = TestPredicate::exampleConsume; consume.accept(new Person("Vikram", false)); consume.accept(new Person("Anusha", true));
         */

    }

    public static List<Person> filterPerson(List<Person> persons, Predicate<Person> p) {
        List<Person> filteredPerson = new ArrayList<Person>();
        for (Person person : persons) {
            if (p.test(person)) {
                filteredPerson.add(person);
            }
        }
        return filteredPerson;
    }

    public static String exampleSuplier(Supplier s) {
        return "Printing Supplier : " + s.get();
    }

    public static void exampleConsume(Person name) {
        System.out.println("Printing Comsumer : " + name.getName());
    }

}
