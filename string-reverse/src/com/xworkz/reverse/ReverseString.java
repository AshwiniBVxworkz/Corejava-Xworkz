package com.xworkz.reverse;

public class ReverseString {
    public static void main(String arg[]){
        String name="String";
        char[] reverseString=name.toCharArray();
        for(int i=name.length()-1;i>=0;i--){
            System.out.print(reverseString[i]);
        }

    }
}
