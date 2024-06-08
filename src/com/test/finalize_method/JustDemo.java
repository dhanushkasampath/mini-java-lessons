package com.test.finalize_method;

public class JustDemo {
    public static void main(String[] args) {
        JustDemo justDemo = new JustDemo();
        justDemo = null;

//        System.gc(); //method 1 of triggering the garbage collector
        Runtime.getRuntime().gc(); // method 2 of triggering the garbage collector

        System.out.println("line after garbage collection call");

    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called");
    }
}