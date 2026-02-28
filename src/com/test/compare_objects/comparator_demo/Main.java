package com.test.compare_objects.comparator_demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Alice", 30, 222));
        employeeList.add(new Employee("Zenn", 30,555));
        employeeList.add(new Employee("Bob", 25,111));
        employeeList.add(new Employee("Charlie", 35,999));

        System.out.println("======sort by name using Comparator=========");
        employeeList.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        });

        for(Employee employee : employeeList){
            System.out.println(employee);
        }

        System.out.println("======sort by age using Comparator=========");

        employeeList.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Integer.compare(e1.getAge(), e2.getAge());
            }
        });

        for(Employee employee : employeeList){
            System.out.println(employee);
        }
    }
}
