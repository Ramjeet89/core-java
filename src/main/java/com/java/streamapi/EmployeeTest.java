package com.java.streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Ramjeet", 25, 59000));
        employees.add(new Employee(103, "Kely", 21, 50000));
        employees.add(new Employee(105, "John", 30, 56000));
        employees.add(new Employee(128, "Dann", 26, 51000));
        employees.add(new Employee(130, "Smith", 29, 57000));

        employees.stream().forEach(System.out::println);

        List<Employee> list = employees
                .stream()
                .filter(x -> x.getAge() > 25)
                .filter(x -> x.getSalary() > 50000).collect(Collectors.toList());
        System.out.println(list);

        System.out.println("====================================");
        Collections.sort(list, Comparator.comparingDouble(Employee::getId)
                .thenComparing(Employee::getName)
                .thenComparing(Employee::getAge)
                .thenComparing(Employee::getSalary));
        System.out.println(list);

    }
}

