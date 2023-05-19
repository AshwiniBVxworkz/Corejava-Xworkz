package com.xworkz.bankapp;
import  java.util.Scanner;
public class BankTester {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Bank Id");
       int bankId=sc.nextInt();
        System.out.println("Enter account number");
       long accountNumber=sc.nextLong();
        System.out.println("Enter account type");
       String accountType=sc.next();
        System.out.println("Enter IFSC code");
       String ifscCode= sc.next();
        System.out.println("Enter location");
       String location=sc.next();
       Bank bank=new Bank();
       bank.setBankId(bankId);
       bank.setAccountNumber(accountNumber);
       bank.setAccountType(accountType);
       bank.setIfscCode(ifscCode);
       bank.setLocation(location);
       System.out.println("Bank Id:"+bank.getBankId()+"\n"+"Bank Account Number :"+ bank.getAccountNumber()+"\n"+"Account Type: "+ bank.getAccountType()+"\n"+"IFSC code :"+ bank.getIfscCode()+"\n"+"Location:"+ bank.getLocation());

    }
}
