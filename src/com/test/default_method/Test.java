package com.test.default_method;

public class Test implements A, B{

    public static void main(String[] args) {
        Test test = new Test();
        test.getName();
    }
}


//default methods with same name in two interfaces
//we can not implement A and B both. We need to override at Test method.



