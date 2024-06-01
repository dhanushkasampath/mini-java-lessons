package com.test.java8_new_features.predicates;

//assume you want to return true if the length of a string is greater than 5. else false.
//below is the normal way we can do that
public class NomalWay {

    public static void main(String[] args) {
        NomalWay nomalWay = new NomalWay();
        System.out.println(nomalWay.testStringLength("helw"));
    }

    public boolean testStringLength(String s){
        if(s.length() > 5){
            return true;
        } else {
            return false;
        }
    }
}
