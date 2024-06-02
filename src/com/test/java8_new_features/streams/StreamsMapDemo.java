package com.test.java8_new_features.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// make a new list by squaring all objects
public class StreamsMapDemo {

    public static void main(String[] args) {
        List<Integer> arList = new ArrayList<>();
        arList.add(15);
        arList.add(25);
        arList.add(6);
        arList.add(10);

//        List<Integer> arListFromMethod = squareElementsWithoutStreamsMap(arList);
        List<Integer> arListFromMethod = squareElementsWithStreamsMap(arList);

        for (Integer i : arListFromMethod) {
            System.out.println(i);
        }
    }

    private static List<Integer> squareElementsWithStreamsMap(List<Integer> arList) {
        return arList.stream().map(x -> x * x).collect(Collectors.toList());
    }

    private static List<Integer> squareElementsWithoutStreamsMap(List<Integer> arList) {
        List<Integer> newList = new ArrayList<>();
        for (Integer i : arList) {
            newList.add(i * i);
        }
        return newList;
    }
}
