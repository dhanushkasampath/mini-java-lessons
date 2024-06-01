package com.test.java8_new_features.supplier;

import java.util.Date;
import java.util.function.Supplier;

//below is the SupplierWay way we can do that
public class SupplierWay {

    public static void main(String[] args) {
        Supplier<Date> currentDate = () -> new Date();
        System.out.println(currentDate.get());
    }
}
