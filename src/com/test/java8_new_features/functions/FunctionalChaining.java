package com.test.java8_new_features.functions;

import java.util.function.Function;

public class FunctionalChaining {

    public static void main(String[] args) {
        Function<Integer, Integer> doubleIt = i -> 2*i;
        System.out.println("Double Function: " + doubleIt.apply(3)); // 2 x 3 = 6

        Function<Integer, Integer> cubeIt = i -> i*i*i;
        System.out.println("Cube Function: " + cubeIt.apply(3)); // 3 x 3 x 3 = 27

        System.out.println("First Doubling using apply: " + doubleIt.andThen(cubeIt).apply(3)); // (2 x 3) x (2 x 3) x (2 x 3) = 216

        //function in compose executes first
        System.out.println("First Cubing using compose: " + doubleIt.compose(cubeIt).apply(3)); // (3 x 3 x 3 ) x 2 = 54
    }
}
