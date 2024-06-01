package com.test.java8_new_features.bi_xyz;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class BiPredicateBiFunctionDemo {

    public static void main(String[] args) {

        BiPredicate<Integer, Integer> checkSumOfTwo = (a, b) -> a+b >= 5;
        System.out.println("Sum of 2 and 5 is greater than 5 : " + checkSumOfTwo.test(2, 5));
        System.out.println("Sum of 2 and 1 is greater than 5 : " + checkSumOfTwo.test(2, 1));

        BiFunction<Integer, Integer, Integer> multiplyBoth = (a, b) -> a*b;
        System.out.println("Multiplication of 5 and 10 is : " + multiplyBoth.apply(10, 5));

    }
}
