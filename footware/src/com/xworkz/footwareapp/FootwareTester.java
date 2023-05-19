package com.xworkz.footwareapp;
import  java.util.Scanner;
public class FootwareTester {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter footware Id");
        int footwareId=sc.nextInt();
        System.out.println("Enter Brand Name");
        String brandName=sc.next();
        System.out.println("Enter Size");
        int size=sc.nextInt();
        System.out.println("Enter Type");
        String type= sc.next();
        System.out.println("Enter Material type ");
        String materialType=sc.next();
        System.out.println("Enter price");
        int price= sc.nextInt();
        Footware footware=new Footware();
        footware.setFootwareId(footwareId);
        footware.setBrandName(brandName);
        footware.setSize(size);
        footware.setType(type);
        footware.setMaterialType(materialType);
        footware.setPrice(price);
        System.out.println("Footware Id:"+footware.getFootwareId()+"\n"+"Footware Brand :"+ footware.getBrandName()+"\n"+"Footware Size:"+ footware.getSize()+"\n"+"Footware type:"+footware.getType()+"\n"+"Material Type"+ footware.getMaterialType()+"\n"+"Price:"+ footware.getPrice()+"Rs");


    }
}
