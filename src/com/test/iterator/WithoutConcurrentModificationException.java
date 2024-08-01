package com.test.iterator;

import java.util.concurrent.CopyOnWriteArrayList;

public class WithoutConcurrentModificationException {
    public static void main(String[] args) {

        CopyOnWriteArrayList<String> a = new CopyOnWriteArrayList<>();
        a.add("saman");
        a.add("kamal");
        a.add("nimal");
        a.add("upul");

        for(String val:a){
            System.out.println(val);
            if(val.equals("nimal")){
                a.remove(val);
                a.add("kusum"); // Since we have used CopyOnWriteArrayList, adding elements while iterating gives no error
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