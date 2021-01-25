package com.java.interview;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertStreamToListMain {
    public static void main(String[] args) {
        Stream<String> countriesStream = Stream.of("India", "China", "France", "Germany");
       // List<String> listOfCountriesName = countriesStream.collect(Collectors.toList());
       // System.out.println(listOfCountriesName);


       // List<String> listOfCountiesName = countriesStream.collect(Collectors.toCollection(LinkedList::new));
        //System.out.println(listOfCountiesName);

        List<String> listOfCountiesName = countriesStream.filter(country ->country.startsWith("I"))
                .collect(Collectors.toList());
        System.out.println(listOfCountiesName);
    }
}
