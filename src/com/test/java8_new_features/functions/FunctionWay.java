package com.test.java8_new_features.functions;

import java.util.function.Function;

public class FunctionWay {

    public static void main(String[] args) {

//        NomalWay nomalWay = new NomalWay();
//        System.out.println("Square of 5 is: " + nomalWay.squareInt(4));

        Function<Integer, Integer> squareMe = i -> i*i;
        System.out.println("Square of 5 is: " + squareMe.apply(5));
    }

//    public int squareInt(int i){
//        return i*i;
//    }
}
