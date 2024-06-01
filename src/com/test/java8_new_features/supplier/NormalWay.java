package com.test.java8_new_features.supplier;

import java.util.Date;

//Assume you want to get the current date of the system without passing any input
//below is the normal way we can do that
public class NormalWay {

    public static void main(String[] args) {
        NormalWay normalWay = new NormalWay();
        System.out.println(normalWay.getCurrentDate());
    }

    public Date getCurrentDate(){
        return  new Date();
    }
}
