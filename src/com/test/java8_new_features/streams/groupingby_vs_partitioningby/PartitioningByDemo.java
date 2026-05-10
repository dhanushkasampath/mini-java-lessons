package com.test.java8_new_features.streams.groupingby_vs_partitioningby;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningByDemo {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
            new Employee("Alice", "HR", 30000),
            new Employee("Bob", "IT", 40000),
            new Employee("Charlie", "HR", 35000),
            new Employee("Dave", "IT", 65000),
            new Employee("Eve", "Finance", 80000)
        );


        // Partition numbers into even and odd
        Map<Boolean, List<Employee>> partitionedBySalary = employeeList.stream()
                .collect(Collectors.partitioningBy(employee -> employee.getSalary()>50000));

        System.out.println("Employees with salary > 50000");
        partitionedBySalary.get(true).forEach(System.out::println);

        System.out.println("Employees with salary <= 50000");
        partitionedBySalary.get(false).forEach(System.out::println);
    }
}

/**
 * Employees with salary > 50000
 * Employee{name='Dave', department='IT', salary=65000}
 * Employee{name='Eve', department='Finance', salary=80000}
 * Employees with salary <= 50000
 * Employee{name='Alice', department='HR', salary=30000}
 * Employee{name='Bob', department='IT', salary=40000}
 * Employee{name='Charlie', department='HR', salary=35000}
 */
