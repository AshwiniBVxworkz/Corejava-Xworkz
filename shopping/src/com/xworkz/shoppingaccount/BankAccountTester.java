package com.xworkz.shoppingaccount;
import java.util.*;

public class BankAccountTester {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value to be credit");
    double creditValue= sc.nextDouble();
    BankAccount bankAccount=new BankAccount();
    bankAccount.credit(creditValue);
    System.out.println("Balance in my account : "+bankAccount.getBalance());

    }
}
