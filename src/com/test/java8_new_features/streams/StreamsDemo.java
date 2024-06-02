package com.test.java8_new_features.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Fetch all objects from collection of list whose value is greater than 15
public class StreamsDemo {

    public static void main(String[] args) {
        List<Integer> arList = new ArrayList<>();
        arList.add(15);
        arList.add(25);
        arList.add(6);
        arList.add(10);

//        List<Integer> arListFromMethod = findElementsWithoutStreams(arList);
        List<Integer> arListFromMethod = findElementsWithStreams(arList);

        for (Integer i : arListFromMethod) {
            System.out.println(i);
        }
    }

    private static List<Integer> findElementsWithStreams(List<Integer> arList) {
        return arList.stream().filter( x -> x >= 15).collect(Collectors.toList());
    }

    private static List<Integer> findElementsWithoutStreams(List<Integer> arList) {
        List<Integer> newList = new ArrayList<>();
        for(Integer i : arList){
            if (i >= 15) {
                newList.add(i);
            }
        }
        return newList;
    }

}
