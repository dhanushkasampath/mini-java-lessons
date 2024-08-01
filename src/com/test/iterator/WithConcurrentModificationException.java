package com.test.iterator;

import java.util.ArrayList;
import java.util.List;

public class WithConcurrentModificationException {
    public static void main(String[] args) {

        List<String> a = new ArrayList<>();
        a.add("saman");
        a.add("kamal");
        a.add("nimal");
        a.add("upul");

        for(String val:a){
//            System.out.println(val);
            if(val.equals("nimal")){
                a.remove(val); // when removing no issue
                a.add("kusum");  // but when adding elements to the arraylist it gives concurrentModificationException
            }
        }

//        if needed we can use this iterator instead of for loop
//        Iterator<String> b = a.iterator();
//        while (b.hasNext()){
//            String val = b.next();
//            if(val.equals("kamal")){
////                b.remove();
//                a.add("sunil");// will give concurrent modification exception if List is not CopyOnWriteArrayList
//            }
//        }

        System.out.println("------------------");
        for(String val:a){
            System.out.println(val);
        }
    }
}