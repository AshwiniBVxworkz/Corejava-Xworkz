package com.xworkz.hospitapapp;

import com.xworkz.hospitapapp.Patient.*;
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
            System.out.println("Enter Patient's Address");

            DoorNumber doorNumber=new DoorNumber();
            Street street=new Street();
            Area area=new Area();
            City city=new City();
            State state=new State();
            Country country=new Country();
            Address address=new Address();
         System.out.println("Enter the Door Number");
            doorNumber.setDoorNumber(sc.nextInt());
            System.out.println("Enter the Street Name");
            street.setStreetName(sc.next());
            System.out.println("Enter Area");
            area.setArea(sc.next());
            System.out.println("Enter City");
            city.setCity(sc.next());
            System.out.println("Enter State");
            state.setState(sc.next());
            System.out.println("Enter Country");
            country.setCountry(sc.next());


           patient.setAddress(address);
           address.setCountry(country);
           country.setState(state);
           state.setCity(city);
           city.setArea(area);
           area.setStreet(street);
           street.setDoorNumber(doorNumber);
          address.setCountry( country);
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
       /*System.out.println("Enter the address to find person");
        hos.getPatientByAddress(sc.next());
        System.out.println("The the ward Number to get patient in that ward ");
        hos.getPatientNameByWardNo(sc.nextInt());
        System.out.println("Enter the patientId to update Ward Number and Enter required Ward  NUmber");
        hos.updatePatientWardNoByPatientId(sc.nextInt(),sc.nextInt());
        System.out.println("Enter the disease to find Patient");
       String[] pat= hos.getPatientNameByDiseaseName(sc.next());
        for (String p:pat) {
            System.out.println(p);
        }
        System.out.println(" Enter The patient Name and Enter The Disease to update ");
        hos.updatePatientDiseaseByPatientName(sc.next(),sc.next());
        System.out.println(" Enter the existing Id and  Enter the age to update");
        hos.updatePatientAgePatientId(sc.nextInt(), sc.nextInt());
        hos.getAllPatient();*/
        System.out.println(" Enter the Id to get Patient Details");
        Patient p = hos.getPatientByPatientId(sc.nextInt());
        System.out.println(p);

        System.out.println("Enter the ID to get Attender's name");
        String attender=hos.getPatientAttenderNameByPatientId(sc.nextInt());
        System.out.println(attender);

        System.out.println("Enter the patientId to find street name");
        String patientStreetNameById= hos.getPatientStreetNameById(sc.nextInt());
        System.out.println(patientStreetNameById);


    }
}
