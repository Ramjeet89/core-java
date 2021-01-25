package com.java.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDataBase {

    public static List<Customer> getAll() {
        return Stream.of(
                new Customer(101, "john", "john@gmail.com", Arrays.asList("9108815727", "0987654321" )),
                new Customer(102, "smith", "smith@gmail.com", Arrays.asList("9108815727", "9798463412" )),
                new Customer(103, "peter", "peter@gmail.com", Arrays.asList("9798463412", "0987654321" )),
                new Customer(104, "kely", "kely@gmail.com", Arrays.asList("9108815727", "9798463412" )))
                .collect(Collectors.toList());

    }
}
