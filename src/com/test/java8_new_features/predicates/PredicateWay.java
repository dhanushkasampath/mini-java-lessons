package com.test.java8_new_features.predicates;

import java.util.function.Predicate;

//assume you want to return true if the length of a string is greater than 5. else false.
//below is the predicate way we can do that
public class PredicateWay {

    public static void main(String[] args) {

        Predicate<String> checkLength = s -> s.length() >=5;
        System.out.println(checkLength.test("helw"));
    }

    //below lines of codes can be reduced using predicates as the main intention of java 8 is to reduce no of code lines
//    public boolean testStringLength(String s){
//        if(s.length() > 5){
//            return true;
//        } else {
//            return false;
//        }
//    }
}
