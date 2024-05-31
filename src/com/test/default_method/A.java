package com.test.default_method;

public interface A {
    default void getName(){
        System.out.println("inside getName()");
    }
}
