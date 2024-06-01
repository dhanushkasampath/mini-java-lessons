package com.test.default_method;

public interface B {
    default void getName(){
        System.out.println("inside getName of inteface B");
    }
}
