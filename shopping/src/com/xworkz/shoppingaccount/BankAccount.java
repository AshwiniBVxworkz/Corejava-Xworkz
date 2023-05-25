package com.xworkz.shoppingaccount;

public class BankAccount {
   private double balance;
   public void credit(double amount){
      balance+=amount;
   }
   public void debit(double amount){
       balance-=amount;
   }
   public void transfer(BankAccount beneficiaryAccount,double amount){
      this.debit(amount);
      beneficiaryAccount.credit(amount);

   }
   public double getBalance(){
      return balance;
   }
}
