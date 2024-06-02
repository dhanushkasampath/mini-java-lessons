package com.test.java_threads.ways_of_creating_threads.implementing;


public class MainClass {
    public static void main(String[] args) {
        com.test.java_threads.ways_of_creating_threads.implementing.ThreadClass threadClass = new ThreadClass();
//        threadClass.start(); // this does not work. why?
//        because ThreadClass is not a thread yet

        Thread thread = new Thread(threadClass);
        thread.start();// now thread will start

        for(int i = 0; i< 1000; i++){
            System.out.println("I am executed by main thread: " + i);
        }
    }
}
