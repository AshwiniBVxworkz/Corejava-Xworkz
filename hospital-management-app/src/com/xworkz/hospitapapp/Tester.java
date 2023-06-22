package com.xworkz.hospitapapp;

import com.xworkz.hospitapapp.Patient.Patient;
import com.xworkz.hospitapapp.constant.Gender;
import com.xworkz.hospitapapp.constant.GovtId;
import com.xworkz.hospitapapp.hospital.ApolloImpl;
import com.xworkz.hospitapapp.hospital.Hospital;
import  java .util.Scanner;
public class Tester {

    public static void main(String[] args) {
        System.out.println(" Main method is invoked");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the patient Details");
        int size= sc.nextInt();
        Hospital hos=new ApolloImpl(size);
        for(int patientIndex=0;patientIndex<size;patientIndex++){
            Patient patient=new Patient();
            System.out.println("Enter the Patient Id");
            patient.setPatientId(sc.nextInt());
            System.out.println("Enter the Patient Name");
            patient.setPatientName(sc.next());
            System.out.println("Enter Patient Phone Number");
            patient.setPhNo(sc.nextLong());
            System.out.println("Enter Patient's Blood Group");
            patient.setBloodGroup(sc.next());
            System.out.println("Enter Patient's Disease");
            patient.setDiseaseName(sc.next());
            System.out.println("Patient have Insurance");
            patient.setInsuranceAvailable(sc.nextBoolean());
            System.out.println("Patient's Attender Name");
            patient.setAttenderName(sc.next());
            System.out.println("Enter Patient's Gender");
            patient.setGender(Gender.valueOf(sc.next()));
            System.out.println("Enter Patient's Id Proof");
            patient.setGovtId(GovtId.valueOf(sc.next()));
            System.out.println("Enter the Ward Number");
            patient.setWardNo(sc.nextInt());
            System.out.println("Enter PAtient's Address");
            patient.setAddress(sc.next());
            hos.addPatient(patient);

        }

       /* Patient pat=new Patient();
        pat.setPatientId(1);
        pat.setPatientName("Mallapa");
        pat.setAge(89);
        pat.setPhNo(8767987656l);
        pat.setBloodGroup("O+ve");
        pat.setDiseaseName("Fever");
        pat.setInsuranceAvailable(true);
        pat.setAttenderName("Madhu");
        pat.setGender(Gender.male);
        pat.setGovtId(GovtId.AADHAAR);
        hos.addPatient(pat);*/

        hos.getAllPatient();
        System.out.println("Enter the address to find person");
        hos.getPatientByAddress(sc.next());
        System.out.println("The the ward Number to get patient in that ward ");
        hos.getPatientNameByWardNo(sc.nextInt());
        System.out.println("Enter the patientId to update Ward Number and Enter required Ward  NUmber");
        hos.updatePatientWardNoByPatientId(sc.nextInt(),sc.nextInt());
        System.out.println("Enter the disease to find Patient");
        hos.getPatientNameByDiseaseName(sc.next());
        System.out.println(" Enter The patient Name and Enter The Disease to update ");
        hos.updatePatientDiseaseByPatientName(sc.next(),sc.next());






    }
}
