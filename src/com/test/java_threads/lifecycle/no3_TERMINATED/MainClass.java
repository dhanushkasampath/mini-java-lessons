package com.test.java_threads.lifecycle.no3_TERMINATED;

public class MainClass {
    public static void main(String[] args) throws InterruptedException {
        ThreadClass t = new ThreadClass();
        t.start();

        //The following sleep method will give enough time for "t" thread to finish execution
        Thread.sleep(1000);
        System.out.println(t.getState());
    }
}
