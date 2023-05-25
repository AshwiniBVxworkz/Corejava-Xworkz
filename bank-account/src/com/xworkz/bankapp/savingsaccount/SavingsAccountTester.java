package com.xworkz.bankapp.savingsaccount;

import com.xworkz.bankapp.bankaccount.BankAccount;

public class SavingsAccountTester {
    public static void main(String[] args) {
        SavingsAccount savingsAccount=new SavingsAccount();
       // System.out.println("Savings Account Balance "+savingsAccount.getBalance());
        savingsAccount.credit(10000.00);
        System.out.println("Savings Account Balance "+savingsAccount.getBalance());


        // beneficiary account
       BankAccount beneficiaryAccount =new BankAccount();
        //System.out.println("Beneficiary Account Balance:"+beneficiaryAccount.getBalance());
        beneficiaryAccount.credit(3000);
        System.out.println("Beneficiary Account Balance:"+beneficiaryAccount.getBalance());
        System.out.println("Saving Account balance is "+savingsAccount.getBalance());

        savingsAccount.transfer(beneficiaryAccount,3000);
        System.out.println("Beneficiary Account Balance is : "+beneficiaryAccount.getBalance());
        System.out.println("Savings Account Balance is : "+savingsAccount.getBalance());


        //beneficiary2
        BankAccount beneficiaryAccount2 =new BankAccount();
        System.out.println("Beneficiary Account2 Balance:"+beneficiaryAccount2.getBalance());
        beneficiaryAccount2.credit(1000);
        System.out.println("Beneficiary Account2 Balance:"+beneficiaryAccount2.getBalance());
        System.out.println("Saving Account balance is "+savingsAccount.getBalance());

        savingsAccount.transfer(beneficiaryAccount2,1000);
        System.out.println("Savings Account Balance is : "+savingsAccount.getBalance());
        System.out.println("Beneficiary Account2 Balance is : "+beneficiaryAccount2.getBalance());
        //beneficiary3


        BankAccount tom =new BankAccount();
        System.out.println("tom Balance:"+tom.getBalance());
        tom.credit(1000);
        System.out.println("tom Balance:"+tom.getBalance());
        System.out.println("Saving Account balance is "+savingsAccount.getBalance());
        savingsAccount.transfer(tom,1000);
        System.out.println("Savings Account Balance is : "+savingsAccount.getBalance());
        System.out.println("tom Balance is : "+tom.getBalance());



    }
}
