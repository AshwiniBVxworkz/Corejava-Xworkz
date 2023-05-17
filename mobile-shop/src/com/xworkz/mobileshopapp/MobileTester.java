package com.xworkz.mobileshopapp;
import java.util.Scanner;
public class MobileTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mobile mob = new Mobile();
        for (int i = 0; i < mob.mobileNames.length; i++) {
            System.out.println("Enter mobile name:");
            String mobileName = sc.next();
            mob.addMobileName(mobileName);
        }
        mob.getMobileName();
    }
}
