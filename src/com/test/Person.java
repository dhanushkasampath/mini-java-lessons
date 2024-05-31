package com.test;

public class Person extends Thread{
    public void run(){
        System.out.println("thread is running");
        System.out.println("com.test.Person class: "+Thread.currentThread().getName());

    }
}
