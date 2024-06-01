package com.test.java8_new_features.functions;

//assume you want to do some operation on a given value and return the output. In that case we can use functions.
//below is the normal way we can do that
public class NomalWay {

    public static void main(String[] args) {
        NomalWay nomalWay = new NomalWay();
        System.out.println("Square of 5 is: " + nomalWay.squareInt(4));
    }

    public int squareInt(int i){
        return i*i;
    }
}
