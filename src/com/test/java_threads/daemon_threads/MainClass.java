package com.test.java_threads.daemon_threads;

public class MainClass {
    public static void main(String[] args) {
        ThreadClass threadClass = new ThreadClass();
        threadClass.setDaemon(true);//as soon as this line executes the JVM gives least priority to run method in ThreadClass
        threadClass.start();

        for(int i = 0; i< 50; i++){
            System.out.println("I am executed by main thread: " + i);
        }
    }
}
