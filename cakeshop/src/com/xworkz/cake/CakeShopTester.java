package com.xworkz.cake;
import  java.util.Scanner;

public class CakeShopTester {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter cake color");
        String cakeColor= sc.next();
        System.out.println("Enter cake Id");
        int  cakeId= sc.nextInt();
        System.out.println("Enter cake shape");
        String cakeShape= sc.next();
        System.out.println("Enter cake flavour");
        String cakeFlavour= sc.next();
        System.out.println("Enter cake price");
        double cakePrice=sc.nextDouble();
        CakeShop cake = new CakeShop();
        cake.setCakeColor(cakeColor);
        cake.setCakeId(cakeId);
        cake.setCakeShape(cakeShape);
        cake.setCakeFlavour(cakeFlavour);
        cake.setCakePrice(cakePrice);
        System.out.println("Cake Id:"+cake.getCakeId()+"\n"+"Cake Shape: "+cake.getCakeColor()+"\n"+"Cake Flavour:"+cake.getCakeFlavour()+"\n"+"Cake Shape:"+cake.getCakeShape()+"\n"+"Cake Price "+cake.getCakePrice()+" per kg");




    }

}
