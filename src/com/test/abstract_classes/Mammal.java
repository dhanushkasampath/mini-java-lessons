package com.test.abstract_classes;

// in this abstract class it is not mandatory to override the abstract method of Animal abstract class
// But in the class which extend the Mammal class, it must override the abstract method of Animal abstract class
public abstract class Mammal extends Animal {

// we can have this method or not.
//if we have it here, we no need want to override in the class that extends Mammel. else we must
//    public String makeSound() {
//        return "";
//    }
}
