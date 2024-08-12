package com.test.temp;

import java.util.List;
import java.util.stream.Collectors;

public class Test2 {

    public boolean solution(String faultyKeys, String sentence) {

        List<Character> charList = sentence.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.toList());

        char[] faultyKeysArr = faultyKeys.toCharArray();

        for(char key:faultyKeysArr){
            if(charList.contains(key)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Test2 t = new Test2();
        System.out.println(t.solution("ablc", "hello"));


    }
}