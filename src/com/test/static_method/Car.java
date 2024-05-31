package com.test.static_method;

public class Car extends Vehicle{

//    @Override
    public static void getName(){
        System.out.println("Inside Car Honda Insight");
    }

    //overriding a final method is not possible
//    public final void getAge(){
//        System.out.println("24");
//    }

    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.getName();//this will print the string in Vehicle class. not the string in car class.
        // This is called method hiding. by making the method static
        //when this kind of thing is done, we can not override the method in super class by extending that.

        vehicle.getAge();
    }
}
