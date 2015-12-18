package com.vik.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CurryingExample {
    // reference : https://dzone.com/articles/whats-wrong-java-8-currying-vs

    private static Integer b = 2;

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println(calculate(values, 3).collect(Collectors.toList()));

        System.out.println(calculate1(values, 3).collect(Collectors.toList()));

    }

    private static Stream<Integer> calculate(List<Integer> list, Integer a) {
        return list.stream().map(new Function<Integer, Function<Integer, Function<Integer, Integer>>>() {
            @Override
            public Function<Integer, Function<Integer, Integer>> apply(final Integer x) {
                return new Function<Integer, Function<Integer, Integer>>() {
                    @Override
                    public Function<Integer, Integer> apply(final Integer y) {
                        return new Function<Integer, Integer>() {
                            @Override
                            public Integer apply(Integer t) {
                                System.out.println(" X : " + x + " Y : " + y + " t : " + t);
                                return x + y * t;
                            }
                        };
                    }
                };
            }
        }.apply(b).apply(a));

    }

    interface F3 extends Function<Integer, Function<Integer, Function<Integer, Integer>>> {}

    private static Stream<Integer> calculate1(List<Integer> list, Integer a) {
        return list.stream().map(((F3) x -> y -> t -> x + y * t).apply(b).apply(a));
    }

}
