package com.test.default_method;

public class Test implements A, B{

    public static void main(String[] args) {

        Test test = new Test();
        test.getName();
        System.out.println(A.getFirstName()); // This is a drawback of static methods. We can not call them via the object of implemented class.
        //we need to call it directly By interface name

        System.out.println("================================");
        test.getName();
    }

    //this is the solution for diamond problem (solution in the sense, just override the getName() method which is differently available in A and B )
    @Override
    public void getName() {
        B.super.getName();
        System.out.println("overidden");
    }
}


//default methods with same name in two interfaces
//we can not implement A and B both. We need to override at Test method.
//this is called diamond problem



