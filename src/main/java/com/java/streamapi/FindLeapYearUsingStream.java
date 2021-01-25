package com.java.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindLeapYearUsingStream {
    public static void main(String[] args) {

        List<String> versions = new ArrayList<>();
        versions.add("Lollipop");
        versions.add("KitKat");
        versions.add("Jelly Bean");
        versions.add("Ice Cream Sandwidth");
        versions.add("Honeycomb");
        versions.add("Gingerbread");

        System.out.println("Find all version who length greater then 10");
        versions.stream().filter(s -> s.length() > 10).forEach(System.out::println);

        System.out.println("First Element which has letter e");
        String first = versions.stream().filter(s -> s.contains("e")).findFirst().get();
        System.out.println(first);

// Using multiple filter
        System.out.println("Element whose length is > 5 and startswith G");
        versions.stream().filter(s -> s.length() > 8).filter(s -> s.startsWith("G")).forEach(System.out::println);
// another example of filter() method in Java 8
        List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 12, 18);
        Integer lcm = listOfNumbers.stream().filter(i -> i % 2 == 0).filter(i -> i % 3 == 0).findFirst().get();
        System.out.println("first number divisible by 2 and 3 in the list is : " + lcm);


    }
}
