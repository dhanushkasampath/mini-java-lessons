package com.test.java_threads.purpose_of_start_method;

public class MainClass {
    public static void main(String[] args) {
        ThreadClass threadClass = new ThreadClass();
        threadClass.start(); // this creates the new thread
//        threadClass.run(); // calling the run method act as just a normal method call
    }
}
