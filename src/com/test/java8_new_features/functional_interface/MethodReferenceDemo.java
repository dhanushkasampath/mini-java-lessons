package com.test.java8_new_features.functional_interface;

public class MethodReferenceDemo {
    public static void main(String[] args) {

        // Method referencing is a replacement of lambda expressions.
        // It is used to refer method of functional interface to an existing method.
        FunctionalInterfaceDemo functionalInterfaceDemo = Test::testImplementation;// by this line a implemented method called "testImplementation" is assigned to the abstract method in the functional interface
        functionalInterfaceDemo.singleAbstractMethod();

       // The similar implementation using lambda expressions is given below
        FunctionalInterfaceDemo functionalInterfaceDemoUsingLambdaExpression = () -> {
            System.out.println("The similar implementation using lambda expressions");
            System.out.println("if you need some more lines in lambda expression, add curly braces after the -> sign");
        };
        functionalInterfaceDemoUsingLambdaExpression.singleAbstractMethod();
    }
}


class Test {
    // this method can be used as the implementation of that abstract method in the functional interface
    public static void testImplementation(){
        System.out.println("This is test implementation of your abstract method");
    }
}

//Assume I already have a method that can be used as the implementation of the abstract class in the functional interface.
//in such case we can use the same method which is a kind of code reusability