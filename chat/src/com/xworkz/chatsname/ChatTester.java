package com.xworkz.chatsname;
import java.util.Scanner;
public class ChatTester {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Chat chat=new Chat();
        for(int ind =0;ind <chat.chatNames.length;ind++){
            System.out.println("Enter chat name:");
            String chatName=sc.next();
            chat.addChatName(chatName);
        }
        chat.getChatNames();
    }
}
