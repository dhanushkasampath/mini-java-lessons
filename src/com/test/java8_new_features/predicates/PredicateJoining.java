package com.test.java8_new_features.predicates;

import java.util.function.Predicate;

//Assume there are multiple conditions to be checked on a given string.
//below is the predicate way we can do that
public class PredicateJoining {

    public static void main(String[] args) {

        Predicate<String> checkLength = s -> s.length() >= 5;
        System.out.println(checkLength.test("helw"));

        Predicate<String> checkEvenLength = s -> s.length() %2 == 0;
        System.out.println(checkEvenLength.test("helw"));

        //it can be joined with and
        System.out.println("After merging with and: " + checkLength.and(checkEvenLength).test("helw"));

        //it can be joined with or
        System.out.println("After merging with or: " + checkLength.or(checkEvenLength).test("helw"));

        //it can be joined with negate
        System.out.println("After merging with negate: " + checkLength.negate().test("helw"));

    }

}
