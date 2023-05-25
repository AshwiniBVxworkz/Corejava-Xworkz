package com.xworkz.bankapp.bankaccount;
// Base Class/Super/parent
public class BankAccount {
    private double balance;
    public void credit(double amount){
       balance+= amount ;

    }
    public void debit(double amount){
        balance-=amount;
    }
     public  double getBalance(){
        return balance;
    }
    public void transfer(BankAccount  beneficiaryAccount, double amount){
        this.debit(amount);
        beneficiaryAccount.credit(amount);


    }
}
