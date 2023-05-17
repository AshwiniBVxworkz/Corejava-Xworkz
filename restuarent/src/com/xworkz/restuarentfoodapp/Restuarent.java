package com.xworkz.restuarentfoodapp;

public class Restuarent {
    String  foodNames[]=new String[6];
    int index;
    public boolean addFoodItem(String foodName){
        boolean isAdded= false;
        if(foodName!=null && index<foodNames.length){
            isAdded=true;
            foodNames[index++]=foodName;
        }return isAdded;

    }
    public void getFoodItem(){
        for(int i=0;i< foodNames.length;i++){
            System.out.println(foodNames[i]);
        }
    }

}
