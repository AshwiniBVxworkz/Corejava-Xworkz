package com.xworkz.hospitalapp;

public class PatientTester {
    public static void main(String[] args){
        Patient patient=new Patient(1,"Ram",23);
        System.out.println(patient.patientId+" "+patient.name+" "+ patient.age);
    }
}
