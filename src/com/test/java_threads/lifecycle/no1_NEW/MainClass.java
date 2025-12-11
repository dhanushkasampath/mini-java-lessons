package com.test.java_threads.lifecycle.no1_NEW;

public class MainClass {
    public static void main(String[] args) {
        Thread t = new Thread();
        System.out.println(t.getState());
    }
}
