package interview_coding;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class SortingMultiplePropertyUsingJava8Example {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1010, "Rajeev", 100000.00, LocalDate.of(2010, 7, 10)));
        employees.add(new Employee(1004, "Chris", 95000.50, LocalDate.of(2017, 3, 19)));
        employees.add(new Employee(1015, "David", 134000.00, LocalDate.of(2017, 9, 28)));
        employees.add(new Employee(1009, "Steve", 100000.00, LocalDate.of(2016, 5, 18)));

        System.out.println("Employee:: " + employees);

        //Sort Employee by Name
        Collections.sort(employees, Comparator.comparing(Employee::getName));
        System.out.println("\nEmployees (Sorted by Name) : " + employees);

        //Sort Employee by Salary
        Collections.sort(employees, Comparator.comparingDouble(Employee::getSalary));
        System.out.println("\nEmployees (Sorted by Salary) : " + employees);

        //Sort Employee by JoiningDate
        Collections.sort(employees, Comparator.comparing(Employee::getJoiningDate));
        System.out.println("\nEmployees (Sorted by JoiningDate) : " + employees);

        // Sort employees by Name in descending order
        Collections.sort(employees, Comparator.comparing(Employee::getName).reversed());
        System.out.println("\nEmployees (Sorted by Name) : " + employees);

        // Chaining multiple Comparators
        // Sort by Salary. If Salary is same then sort by Name
        Collections.sort(employees, Comparator.comparingDouble(Employee::getSalary).thenComparing(Employee::getName));
        System.out.println("\nEmployees (Sorted by Salary and Name) : " + employees);
    }
}
