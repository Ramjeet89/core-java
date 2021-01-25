package com.java.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMapTest {
    public static void main(String[] args) {
        List<Customer> customers = EkartDataBase.getAll();
        // List<Customer> convert = List<String>->Data Transform
        //mapping: customer -> customer.getEmails()
        //customer->customer.getEmails() one to one mapping

        List<String> emails =
                customers.stream()
                        .map(customer -> customer.getEmail())
                        .collect(Collectors.toList());
        System.out.println(emails);

        //customer ->customer.getPhone(Number)->one to one mapping
        List<List<String>> phoneNumbers =
                customers.stream()
                        .map(customer -> customer.getPhoneNumbers())
                        .collect(Collectors.toList());
        System.out.println(phoneNumbers);

        //List<Customer> convert = List<String>->Data Transform
        //mapping : customer -> phoneNumbers
        //customer ->customer.getPhoneNumbers()->>one to many mapping
        List<String> phones = customers.stream()
                .flatMap(customer -> customer.getPhoneNumbers()
                        .stream())
                .collect(Collectors.toList());
        System.out.println(phones);

    }
}
