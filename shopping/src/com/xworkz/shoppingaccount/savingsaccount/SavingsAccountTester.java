package com.xworkz.shoppingaccount.savingsaccount;
import com.xworkz.shoppingaccount.BankAccount;

import java.util.*;

public class SavingsAccountTester {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount to be credited :");
        double creditToMyAccount= sc.nextDouble();
        SavingsAccount myAccount=new SavingsAccount();
        myAccount.credit( creditToMyAccount);
        System.out.println("Balance"+myAccount.getBalance());


        //shopping in puma
        SavingsAccount puma=new SavingsAccount();
        System.out.println("Enter the amount to be debited :");
        double debitFromMyAccount1= sc.nextDouble();
        myAccount.transfer(puma,debitFromMyAccount1);
        System.out.println("Balance in my Account "+myAccount.getBalance());
        System.out.println("Transferred Amount: "+puma.getBalance());

        //Dominos..
        SavingsAccount dominos=new SavingsAccount();
        System.out.println("Enter the amount to be debited :");
        double debitFromMyAccount2=sc.nextDouble();
        myAccount.transfer(dominos,debitFromMyAccount2);
        System.out.println("Balance in my Account "+myAccount.getBalance());
        System.out.println("Transferred Amount: "+dominos.getBalance());

        //Allen solly
        SavingsAccount allenSolly=new SavingsAccount();
        System.out.println("Enter the amount to be debited :");
        double debitFromMyAccount3=sc.nextDouble();
        myAccount.transfer(allenSolly,debitFromMyAccount3);
        System.out.println("Balance in my Account "+myAccount.getBalance());
        System.out.println("Transferred Amount: "+allenSolly.getBalance());

        //purple
        SavingsAccount purple =new SavingsAccount();
        System.out.println("Enter the amount to be debited :");
        double debitFromMyAccount4= sc.nextDouble();
        myAccount.transfer(purple,debitFromMyAccount4);
        System.out.println("Balance in my Account "+myAccount.getBalance());
        System.out.println("Transferred Amount: "+purple.getBalance());

        //Nykaa
        SavingsAccount Nykaa =new SavingsAccount();
        System.out.println("Enter the amount to be debited :");
        double debitFromMyAccount5= sc.nextDouble();
        myAccount.transfer(Nykaa,debitFromMyAccount5);
        System.out.println("Balance in my Account "+myAccount.getBalance());
        System.out.println("Transferred Amount: "+Nykaa.getBalance());

        //Fossil
        SavingsAccount fossil=new SavingsAccount();
        System.out.println("Enter the amount to be debited : ");
        double debitFromMyAccount6=sc.nextDouble();
        myAccount.transfer(fossil,debitFromMyAccount6);
        System.out.println("Balance in my Account "+myAccount.getBalance());
        System.out.println("Transferred Amount: "+Nykaa.getBalance());

        //Parcos
        SavingsAccount parcos =new SavingsAccount();
        System.out.println("Enter the amount to be debited : ");
        double debitFromMyAccount7=sc.nextDouble();
        myAccount.transfer(parcos,debitFromMyAccount7);
        System.out.println("Balance in my Account "+myAccount.getBalance());
        System.out.println("Transferred Amount: "+parcos.getBalance());







    }
}
