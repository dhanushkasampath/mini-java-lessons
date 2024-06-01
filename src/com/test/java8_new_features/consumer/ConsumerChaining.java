package com.test.java8_new_features.consumer;

import java.util.function.Consumer;

//Assume you want to execute multiple consumer function calls separately on a given object.
//We can do it using andThen() method
public class ConsumerChaining {

    public static void main(String[] args) {

        Consumer<Integer> squareMe = i -> System.out.println("Taking an input and performing square operation: " + i*i);
        squareMe.accept(5);

        Consumer<Integer> doubleMe = i -> System.out.println("Taking an input and performing double operation: " + 2*i);
        doubleMe.accept(5);

        //above both lines of 13 and 16 can be done at once using below
        squareMe.andThen(doubleMe).accept(5);

    }

}
