package com.test.finalize_method;

public class JustDemo {
    public static void main(String[] args) {
//        System.out.println("Hello and welcome!");

        JustDemo justDemo = new JustDemo();
        justDemo = null;

        System.gc();

        System.out.println("line after garbage collection call");
//        System.out.println(Thread.currentThread().getName());
//
//        Person person = new Person();
//        person.start();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called");
    }
}