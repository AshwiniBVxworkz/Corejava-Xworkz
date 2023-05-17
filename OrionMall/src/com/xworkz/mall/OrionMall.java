package com.xworkz.mall;

public class OrionMall {
    String shopNames[]=new String[5];
    int index;
    public boolean addShopName(String shopName){
        boolean isAdded=false;
        if(shopName!=null && index<shopNames.length){
            isAdded=true;
            shopNames[index++]=shopName;
        }return isAdded;
    }
    public void getShopName(){
        for (int i=0;i<shopNames.length;i++){
            System.out.println(shopNames[i]);
        }
    }
}
