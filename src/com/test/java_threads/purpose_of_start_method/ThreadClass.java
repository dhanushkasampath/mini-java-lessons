package com.test.java_threads.purpose_of_start_method;

public class ThreadClass extends Thread{
    @Override
    public void run() {
        System.out.println("my name is: " + Thread.currentThread().getName());
        for(int i = 0; i< 10; i++){
            System.out.println("I am executed by child thread: " + i);
        }
    }
}
