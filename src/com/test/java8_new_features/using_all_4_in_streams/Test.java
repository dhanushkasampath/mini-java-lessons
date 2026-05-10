package com.test.java8_new_features.using_all_4_in_streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 4, 3, 6, 7, 2, 8, 9);

        //predicate to filter even numbers
        Predicate<Integer> isEven = num -> num % 2 == 0;

        //Function to square a number
        Function<Integer, Integer> squareFunction = num -> num * num;

        //Consumer to print each squared number
        Consumer<Integer> printSquaredNumber = System.out::println;

        //Supplier to count total squared numbers
        Supplier<Integer> countSupplier = () -> 0;

        // Apply stream operations
        int totalSquaredNumbers = numbers.stream()
                .filter(isEven)// this will filter only even numbers in the list -> 2 ,4, 6, 2, 8
                .map(squareFunction) // this will get the square of the filtered numbers -> 4, 16, 36, 4, 64
                .peek(printSquaredNumber)// this will print the result
                .reduce(countSupplier.get(), (count, num ) -> count + 1);// count how many results we have

        System.out.println("Total squared numbers: " + totalSquaredNumbers);
    }
}
