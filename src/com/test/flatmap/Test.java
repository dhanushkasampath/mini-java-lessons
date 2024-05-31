package com.test.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    private static List<Employee> getEmployeeList(){
        List<Employee> employeeList = new ArrayList<>();

        Employee employee1 = new Employee();
        employee1.setId(1);
        employee1.setAge(23);
        employee1.setName("john");

        Book book1 = new Book(1, "book1", "author1");
        Book book2 = new Book(2, "book2", "author2");
        Book book3 = new Book(3, "book3", "author3");

        employee1.setBookList(Arrays.asList(book1, book2, book3));
        employeeList.add(employee1);

        //////////////////////////////////////////////////////////////////
        Employee employee2 = new Employee();
        employee2.setId(1);
        employee2.setAge(23);
        employee2.setName("martin");

        Book book4 = new Book(1, "book4", "author4");
        Book book5 = new Book(2, "book5", "author5");
        Book book6 = new Book(3, "book6", "author6");

        employee2.setBookList(Arrays.asList(book4, book5, book6));
        employeeList.add(employee2);

        //////////////////////////////////////////////////////////////////
        Employee employee3 = new Employee();
        employee3.setId(1);
        employee3.setAge(23);
        employee3.setName("edward");

        Book book7 = new Book(1, "book7", "author7");
        Book book8 = new Book(2, "book8", "author8");
        Book book9 = new Book(3, "book9", "author9");

        employee3.setBookList(Arrays.asList(book7, book8, book9));
        employeeList.add(employee3);

        return employeeList;
    }

    public static void main(String[] args) {
        List<Employee> employeeList = getEmployeeList();

        //here toUppercase function is applied on every item of the list
        List<String> nameList = employeeList.stream().map(employee -> employee.getName().toUpperCase()).collect(Collectors.toList());

        //here flatmap is used to get values of list of list
        List<String> booksList = employeeList.stream().flatMap(employee -> employee.getBookList().stream()).map(book -> book.getName()).collect(Collectors.toList());
        System.out.println(employeeList);
        System.out.println(nameList);
        System.out.println(booksList);
    }
}
