package com.xworkz.teashopapp;

public class TeaShop {
    String[] teaNames= new String[4];
    int index;
    public boolean addTeaName(String teaName){
        boolean isAdded=false;
        if(teaName!=null && index< teaNames.length){
            isAdded=true;
            teaNames[index++]=teaName;
        }return isAdded;
    }
    public void getTeaNames(){
        for(int i=0;i< teaNames.length;i++){
            System.out.println(teaNames[i]);
        }
    }
}
