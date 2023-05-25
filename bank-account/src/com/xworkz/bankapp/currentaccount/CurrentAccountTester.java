package com.xworkz.bankapp.currentaccount;

public class CurrentAccountTester {
    public static void main(String[] args) {
        CurrentAccount currentAccount=new CurrentAccount();
        System.out.println("Current Account Balance "+currentAccount.getBalance());
        currentAccount.credit(400);
        System.out.println("Current Account Balance "+currentAccount.getBalance());

    }
}
