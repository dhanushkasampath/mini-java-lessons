package com.test.finalize_method;

public class JustDemo_2 {

    private String name;

    public JustDemo_2(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        new JustDemo_2("Dhanushka");// this is an anonymous object without a reference id.
        System.gc();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(this.name + "successfully garbage collected");
    }
}

// note: but this did not work.