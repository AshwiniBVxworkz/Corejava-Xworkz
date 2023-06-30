package com.xworkz.app;

public class Tester {
    String a;
    public Tester(String a){
     this.a=a;
    }
    public static void show(){
        Tester tester1=new Tester("apple");
        display();
    }
   static  public void display(){
        Tester tester2=new Tester("mango");
    }

    public static void main(String[] args) {

        show();
        System.gc();
    }
    @Override
        protected void finalize(){
            System.out.println(this.a+"success");
        }

}
