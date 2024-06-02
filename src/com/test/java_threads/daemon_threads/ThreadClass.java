package com.test.java_threads.daemon_threads;

public class ThreadClass extends Thread{
    @Override
    public void run() {
        for(int i = 0; i< 1000; i++){
            System.out.println("I am executed by child thread: " + i);
        }
    }
}
