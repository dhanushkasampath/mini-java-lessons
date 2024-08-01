package com.test.temp;

import java.lang.reflect.Method;
import java.util.*;

//find the duplicate number of the given integer array
//Assumption: only one duplicate value is there in the array
public class Test3 {
    public static void main(String[] args) {
        String stringWithDuplicateCharacters = "hellowddd";
        System.out.println("String after removing duplicates: " + removeDuplicateCharacters(stringWithDuplicateCharacters));

        Class<Test3> test3Class = Test3.class;
        Method[] methods = test3Class.getDeclaredMethods();
        Arrays.stream(methods).forEach(method -> System.out.println(method.getName()));

    }

    public static String removeDuplicateCharacters(String string){

        StringBuilder stringBuilder = new StringBuilder();
        Set<String> charSet = new LinkedHashSet<>();
        for(char c : string.toCharArray()){
            String val = String.valueOf(c);
            if(!charSet.contains(val)){
                charSet.add(val);
                stringBuilder.append(val);
            }
        }
        return stringBuilder.toString();
    }
}