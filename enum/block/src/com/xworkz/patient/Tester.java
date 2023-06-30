package com.xworkz.patient;

public class Tester {

    int i;
    {
        System.out.println("Init block 1 is invoked");
    }
    static{
        System.out.println("Static block 1is  invoked");
    }
    static{
        System.out.println("Static block 2 is invoked");
    }
    public Tester(){
        System.out.println("Constructor is invoked");
    }

    public static void main(String[] args) {
        System.out.println("main method started");
        Tester tester=new Tester();
        System.out.println("main method ended");
    }
    {
        System.out.println("Init block  is invoked");
    }
}
