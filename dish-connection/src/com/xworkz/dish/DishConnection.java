package com.xworkz.dish;

public class DishConnection {
    //instance variables
    int dishId;
    String dishName;
    String dishNoChannels;// To use instance ,local and parameter variables name same ,we use keyword --this.
    String plan;

    public DishConnection(int dishId,String dishname,String dishNoChannels,String plan ){
        System.out.println("Dish available");
        this.dishId=dishId;
        this.dishName=dishName;
        this.dishNoChannels=dishNoChannels;
        this.plan=plan;
    }

}
