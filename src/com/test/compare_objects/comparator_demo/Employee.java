package com.test.compare_objects.comparator_demo;

public class Employee {
    private String name;
    private int age;
    private int indexNo;


    public Employee(String name, int age, int indexNo) {
        this.name = name;
        this.age = age;
        this.indexNo = indexNo;
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

    public int getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(int indexNo) {
        this.indexNo = indexNo;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", indexNo=" + indexNo +
                '}';
    }

    //    @Override
//    public int compareTo(Employee o) {// we have to specify on which field we have to compare
////        return Integer.compare(this.age, o.age); // here we have provided a custom implementation.
//
//        //suppose we want to sort by name, then we need to change this method
//        return this.name.compareTo(o.name); // this compareTo is a method in String class
//    }
}
