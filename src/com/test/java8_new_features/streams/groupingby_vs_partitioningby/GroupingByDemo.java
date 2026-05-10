package com.test.java8_new_features.streams.groupingby_vs_partitioningby;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByDemo {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "HR", 30000),
            new Employee("Bob", "IT", 40000),
            new Employee("Charlie", "HR", 35000),
            new Employee("Dave", "IT", 65000),
            new Employee("Eve", "Finance", 80000)
        );

        // Group employees by department
        Map<String, List<Employee>> employeesByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        // Print the grouped employees
        employeesByDepartment.forEach((department, employeeList) -> {
            System.out.println("Department: " + department);
            employeeList.forEach(System.out::println);
        });
    }
}

/**
 * Department: Finance
 * Employee{name='Eve', department='Finance', salary=80000}
 * Department: HR
 * Employee{name='Alice', department='HR', salary=30000}
 * Employee{name='Charlie', department='HR', salary=35000}
 * Department: IT
 * Employee{name='Bob', department='IT', salary=40000}
 * Employee{name='Dave', department='IT', salary=65000}
 */