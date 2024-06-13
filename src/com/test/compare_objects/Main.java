package com.test.compare_objects;

import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> personList = Data.getPersionList();

        System.out.println("");
        System.out.println("=========print the object list=======================================");

        personList.stream().forEach(x -> System.out.println(x));

        System.out.println("");
        System.out.println("=========sort by age in ascending order===============================");

        personList.stream().sorted(Comparator.comparing(Person::getAge)).forEach(System.out::println);

        System.out.println("");
        System.out.println("=========sort by age in descending order===============================");

        personList.stream().sorted(Comparator.comparing(Person::getAge).reversed()).forEach(System.out::println);

        System.out.println("");
        System.out.println("=========get the minimum age object===================================");
        Person minAgePerson = personList.stream().min(Comparator.comparingInt(Person::getAge)).get();
        System.out.println(minAgePerson);

        System.out.println("");
        System.out.println("=========get the maximum age object===================================");
        Person maxAgePerson = personList.stream().max(Comparator.comparingInt(Person::getAge)).get();
        System.out.println(maxAgePerson);
    }
}
