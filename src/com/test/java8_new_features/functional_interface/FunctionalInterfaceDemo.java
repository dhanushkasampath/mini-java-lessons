package com.test.java8_new_features.functional_interface;

//java can by default identify functional interfaces. Below annotation is used as a security measure. if by mistake
//more than 1 abstract method added, the compiler will give you and error
@FunctionalInterface
public interface FunctionalInterfaceDemo {

    void singleAbstractMethod();

    // this is a default method
    default String getName(){
        return "This is my name";
    }

    // this is a default method
    default int getAge(){
        return 22;
    }
}
