package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.constant.Gender1;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*to access constant values which are declared in class we use class name.variable name*/
       // System.out.println(Gender1.FEMALE);
        /* to access enum values from enum we have to declare enum in main class and create object in tester class.We can access these through reference variable*/
        Patient patient=new Patient();
        System.out.println("Enter the gender");
        String gender =sc.next();
        //to convert string to enum we use valueOf()
        patient.setGender(Gender.valueOf(gender));
       // patient.setGender(Gender.MALE);
       // System.out.println("Gender: "+patient.getGender());
        patient.setPatientId(1);
        //to convert enum to string
        Gender gen= patient.getGender();
        //gen to string;
        System.out.println( "Gender is;"+gen);
        gen.toString();
        //complete representation

    }

}

