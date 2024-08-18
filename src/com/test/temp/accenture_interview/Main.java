package com.test.temp.accenture_interview;

import java.util.HashSet;
import java.util.Set;

public class Main {
    private Object[] removeDuplicates(int[] arr){
        Set<Integer> uniqueSet = new HashSet<>();
        for(int a : arr){
            uniqueSet.add(a);
        }
        return uniqueSet.toArray();
    }

    public static void main(String[] args){
        Main m = new Main();
        Object[] duplicateRemoved = m.removeDuplicates(new int[]{2,4,6,7,8,8,8,9});

        for(Object a : duplicateRemoved){
            System.out.print(a);
        }
    }
}