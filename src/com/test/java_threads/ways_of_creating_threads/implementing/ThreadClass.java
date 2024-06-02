package com.test.java_threads.ways_of_creating_threads.implementing;

public class ThreadClass implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i< 10; i++){
            System.out.println("I am executed by child thread: " + i);
        }
    }
}
