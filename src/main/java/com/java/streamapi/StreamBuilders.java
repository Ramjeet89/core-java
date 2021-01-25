package com.java.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamBuilders {
    public static void main(String[] args) {
     /*   Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        stream1.forEach(p -> System.out.println(p));

        System.out.println("---------------------------");
        Stream<Integer> stream2 = Stream.of(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        stream2.forEach(p -> System.out.print(p));

        System.out.println("===----------------------------------===");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <=10; i++) {
            list.add(i);
        }
        Stream<Integer> stream = list.stream();
        stream.forEach(p -> System.out.println(p));

        System.out.println("===----------------------------------===");
        Stream<Integer> randomNumer = Stream.generate(()->(new Random()).nextInt(100));
        randomNumer.limit(20).forEach(System.out::println);

        System.out.println("===----------------------------------===");
        IntStream stream3 = "12345_abcdefg".chars();
        stream3.forEach(p->System.out.println(p));

        Stream<String> stream4 = Stream.of("A$B$C".split("\\$"));
        stream4.forEach(p->System.out.println(p));
        */

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }

        Stream<Integer> stream5 = list.stream();
        List<Integer> evenNumberList = stream5.filter(s -> s % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumberList);

        //Integer[] evenNumber = stream5.filter(i -> i % 2 == 0).toArray(Integer[]::new);
        //System.out.println(evenNumber);
    }
}
