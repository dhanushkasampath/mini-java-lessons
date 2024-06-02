package com.test.java_threads.ways_of_creating_threads.extending;

public class MainClass {
    public static void main(String[] args) {
        ThreadClass threadClass = new ThreadClass();
        threadClass.start();

        for(int i = 0; i< 1000; i++){
            System.out.println("I am executed by main thread: " + i);
        }
    }
}
