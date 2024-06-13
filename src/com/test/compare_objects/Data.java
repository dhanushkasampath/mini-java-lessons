package com.test.compare_objects;

import java.util.ArrayList;
import java.util.List;

public class Data {

    public static List<Person> getPersionList(){
        List<Person> personList = new ArrayList<>();

        Person person1 = new Person();
        person1.setName("Saman");
        person1.setAddress("Matara");
        person1.setAge(24);
        person1.setIndexNo(123);
        personList.add(person1);

        Person person2 = new Person();
        person2.setName("Kamal");
        person2.setAddress("Kandy");
        person2.setAge(26);
        person2.setIndexNo(555);
        personList.add(person2);

        Person person3 = new Person();
        person3.setName("Nimal");
        person3.setAddress("Galle");
        person3.setAge(16);
        person3.setIndexNo(888);
        personList.add(person3);

        Person person4 = new Person();
        person4.setName("Sunil");
        person4.setAddress("Colombo");
        person4.setAge(11);
        person4.setIndexNo(573);
        personList.add(person4);

        return personList;
    }
}
