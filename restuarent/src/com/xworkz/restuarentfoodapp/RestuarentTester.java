package com.xworkz.restuarentfoodapp;
import  java.util.Scanner;
public class RestuarentTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Restuarent food= new Restuarent();
        for(int i=0; i<food.foodNames.length;i++){
            System.out.println("Enter food name");
            String foodName= sc.next();
            food.addFoodItem(foodName);
        }
        food.getFoodItem();
    }
}
