package com.xworkz.bankapp;

import com.xworkz.bankapp.bankaccount.BankAccount;
import com.xworkz.bankapp.savingsaccount.SavingsAccount;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();
        System.out.println("Current balance before credit is  "+bankAccount.getBalance());
        bankAccount.credit(5000.50);
        double totalBalance =bankAccount.getBalance();
        System.out.println("Balance post credit "+totalBalance);
        bankAccount.debit(200);
        System.out.println("Balance post debit "+bankAccount.getBalance());

    }
}
