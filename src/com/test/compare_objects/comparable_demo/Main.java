package com.test.compare_objects.comparable_demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Alice", 30));
        personList.add(new Person("Zenn", 30));
        personList.add(new Person("Bob", 25));
        personList.add(new Person("Charlie", 35));

        Collections.sort(personList);

        for(Person person : personList){
            System.out.println(person);
        }
    }
}
