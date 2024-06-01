package com.test.java8_new_features.consumer;

import java.util.function.Consumer;

//below is the ConsumerWay way we can do that
public class ConsumerWay {

    public static void main(String[] args) {

        Consumer<Integer> squareMe = i -> System.out.println("Taking an input and performing an operation: " + i*i);
        squareMe.accept(5);
    }
}
