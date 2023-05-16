package com.xworkz.librarybooks;

public class Library {
    static String bookNames[]={null, null, null, null, null, null, null, null, null, null, null, null, null,null, null};
    static int index;
    //add/save/create
    public static boolean addBookName(String bookName){
        System.out.println("Add a book name");
        boolean isAdded=false;
        if(bookName!=null && index<bookNames.length){
            bookNames[index++]=bookName;
            isAdded=true;
        }
        else{
            System.out.println("bookName cannot be added");
        }
        System.out.println("addBookName method ended ");
        return isAdded;
    }
    //get/fetch/read
    public static void getBookNames(){
        System.out.println("getBookNames method started");
        System.out.println("Books available are : ");
        for(int i=0;i<bookNames.length;i++){
            System.out.println(bookNames[i]);
        }
        System.out.println("getBookNames method ended");
    }
    //update
    public static boolean updateBookName(String oldBookName, String updateBookName){
        boolean isUpdate=false;
        System.out.println("updateBookName method started ");
        for(int i=0;i<bookNames.length;i++){
            if(bookNames[i].equals(oldBookName)){
                bookNames[i]=updateBookName;
                isUpdate=true;
            }
        }
        System.out.println("updateBookName method ended");
        return isUpdate;
    }
    //searching
    public static String getBookName(String bookName){
        System.out.println("getBookName method started");
        System.out.println("Search a book");
        for(int i=0;i<bookNames.length;i++){
            if(bookNames[i].equals(bookName))
                return bookNames[i];
        }
        return "Book not found";
    }

}
