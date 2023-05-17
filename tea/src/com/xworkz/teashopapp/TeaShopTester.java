package com.xworkz.teashopapp;
import  java.util.Scanner;
public class TeaShopTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TeaShop tea=new TeaShop();
        for(int i=0;i<tea.teaNames.length;i++){
            System.out.println("Enter food names");
            String teaName=sc.next();
            tea.addTeaName(teaName);
        }
        tea.getTeaNames();
    }
}
