package com.xworkz.app;

public class Tester {

    public static void main(String[] args) {
        Tester tester=new Tester();
        System.out.println("Start of garbage collector");
        tester=null;
        System.gc();
        System.out.println(tester);
        System.out.println("end of garbage collection");

    }
    @Override
    protected void finalize(){
        System.out.println("finalize method is invoked");

    }
}
