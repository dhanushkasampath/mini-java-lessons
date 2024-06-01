package com.test.java8_new_features.consumer;

//Assume you want to perform some operation on a given value but does not return any thing.
//below is the normal way we can do that
public class NormalWay {

    public static void main(String[] args) {
        NormalWay normalWay = new NormalWay();
        normalWay.squareIt(5);
    }

    // This method can be a database call which persist an object in db so no return value is needed.
    public void squareIt(int i){
        int squared = i*i;
        System.out.println("Squared number is: " + squared);
    }
}
