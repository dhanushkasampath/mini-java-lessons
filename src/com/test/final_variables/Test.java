package com.test.final_variables;

/**
 * we can initialize a final variable without a value.
 * Then we can assign a value to it once.
 * after that can not assign again
 */
public class Test {
    public static void main(String[] args) {

        final int a;// =10;
//        System.out.println(a);
        a = 3;
        System.out.println(a);
//        a =2;
        System.out.println(a);
    }
}