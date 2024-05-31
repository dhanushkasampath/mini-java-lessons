package com.test.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

//        CopyOnWriteArrayList<String> a = new CopyOnWriteArrayList<>();
        List<String> a = new ArrayList<>();
        a.add("saman");
        a.add("kamal");
        a.add("nimal");
        a.add("upul");

//        for(String val:a){
//            System.out.println(val);
//            a.remove(2);
//        }

        Iterator<String> b = a.iterator();
        while (b.hasNext()){
            String val = b.next();
            if(val.equals("kamal")){
//                b.remove();
                a.add("sunil");// will give concurrent modification exception if List is not CopyOnWriteArrayList
            }
        }

        for(String val:a){
            System.out.println(val);
        }
    }
}