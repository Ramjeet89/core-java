package com.java.interview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(25,"Tiger",55000));
        employeeList.add(new Employee(20,"John",52000));
        employeeList.add(new Employee(21,"Dann",51000));
        employeeList.add(new Employee(26,"Ray",59000));
        employeeList.add(new Employee(29,"Smith",56000));

        System.out.println("Before Sorting based on age");
        employeeList.stream().forEach(System.out::println);

        //Sorted by age
        System.out.println("After Sorting based on age");
        List<Employee> sortedList = employeeList.stream()
                .sorted(Comparator.comparingInt(Employee::getAge))
                .collect(Collectors.toList());
        sortedList.forEach(System.out::println);

        System.out.println("-------Search Employee Name based on age----------");
        List<Employee> tempList = employeeList.stream()
                .filter(e -> "Tiger".equalsIgnoreCase(e.getName()) && e.getAge() > 20)
                .collect(Collectors.toList());
        System.out.println(tempList);
    }
}
