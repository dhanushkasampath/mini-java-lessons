package com.test.default_method;

public interface B {
    default void getName1(){
        System.out.println("inside getName");
    }
}
