package com.xworkz.mall;
import java.util.Scanner;

public class OrionMallTester {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     OrionMall mall=new OrionMall();
     for(int i=0;i<mall.shopNames.length;i++){
         System.out.println("Enter Shop Names ");
         String shopName=sc.next();
         mall.addShopName(shopName);
     }
     mall.getShopName();
    }
}
