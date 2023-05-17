package com.xworkz.chatsname;

public class Chat {
    String chatNames[]=new String [5];
    int index;
    public boolean addChatName(String chatName){
        boolean isAdded=false;
        if(chatName!=null && index<chatNames.length){
            chatNames[index++]=chatName;
            isAdded=true;

        }
        else{
            System.out.println("Cannot add chatName ...size is exceeded");
        }
        return isAdded;
    }
    public void getChatNames(){
        for(int i=0;i< chatNames.length;i++){
            System.out.println(chatNames[i]);
        }
    }
}
