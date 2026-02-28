package com.test.compare_objects.comparable_demo;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {// we have to specify on which field we have to compare
//        return Integer.compare(this.age, o.age); // here we have provided a custom implementation.

        //suppose we want to sort by name, then we need to change this method
        return this.name.compareTo(o.name); // this compareTo is a method in String class
    }
}
