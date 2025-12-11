package com.test.java_threads.lifecycle.no2_RUNNABLE;

public class MainClass {
    public static void main(String[] args) {
        Thread t = new Thread();
        t.start();
        System.out.println(t.getState());
    }
}
