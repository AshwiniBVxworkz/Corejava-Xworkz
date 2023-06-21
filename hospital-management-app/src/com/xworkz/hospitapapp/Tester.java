package com.xworkz.hospitapapp;

import com.xworkz.hospitapapp.Patient.Patient;
import com.xworkz.hospitapapp.constant.Gender;
import com.xworkz.hospitapapp.constant.GovtId;
import com.xworkz.hospitapapp.hospital.ApolloImpl;
import com.xworkz.hospitapapp.hospital.Hospital;

public class Tester {

    public static void main(String[] args) {
        Hospital hos=new ApolloImpl();

        Patient pat=new Patient();
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
        hos.addPatient(pat);


        Patient pat1=new Patient();
        pat1.setPatientId(2);
        pat1.setPatientName("Aadya");
        pat1.setAge(18);
        pat1.setPhNo(9876987656l);
        pat1.setBloodGroup("B+ve");
        pat1.setDiseaseName("Cold & Cough");
        pat1.setInsuranceAvailable(false);
        pat1.setAttenderName("Nayana");
        pat1.setGender(Gender.female);
        pat1.setGovtId(GovtId.AADHAAR);
        hos.addPatient(pat1);


        Patient pat2=new Patient();
        pat2.setPatientId(3);
        pat2.setPatientName("Samrudhi");
        pat2.setAge(18);
        pat2.setPhNo(6346987656l);
        pat2.setBloodGroup("A+ve");
        pat2.setDiseaseName("Weakness");
        pat2.setInsuranceAvailable(false);
        pat2.setAttenderName("Sanjay");
        pat2.setGender(Gender.female);
        pat2.setGovtId(GovtId.PAN);
        hos.addPatient(pat2);


        Patient pat3=new Patient();
        pat3.setPatientId(4);
        pat3.setPatientName("Pavithra");
        pat3.setAge(38);
        pat3.setPhNo(7206987656l);
        pat3.setBloodGroup("A-ve");
        pat3.setDiseaseName("Anemia");
        pat3.setInsuranceAvailable(true);
        pat3.setAttenderName("Sanjay");
        pat3.setGender(Gender.female);
        pat3.setGovtId(GovtId.DL);
        hos.addPatient(pat3);

        Patient pat4=new Patient();
        pat4.setPatientId(5);
        pat4.setPatientName("Poorvi");
        pat4.setAge(16);
        pat4.setPhNo(6206987656l);
        pat4.setBloodGroup("O-ve");
        pat4.setDiseaseName("Bone-Fracture");
        pat4.setInsuranceAvailable(true);
        pat4.setAttenderName("Naveen");
        pat4.setGender(Gender.female);
        pat4.setGovtId(GovtId.RATION_CARD);
        hos.addPatient(pat4);

        Patient pat5=new Patient();
        pat5.setPatientId(6);
        pat5.setPatientName("Sham");
        pat5.setAge(48);
        pat5.setPhNo(9306987656l);
        pat5.setBloodGroup("AB+ve");
        pat5.setDiseaseName("Diabetes");
        pat5.setInsuranceAvailable(true);
        pat5.setAttenderName("Veena");
        pat5.setGender(Gender.male);
        pat5.setGovtId(GovtId.DL);
        hos.addPatient(pat5);

        Patient pat6=new Patient();
        pat6.setPatientId(7);
        pat6.setPatientName("Sanjith");
        pat6.setAge(28);
        pat6.setPhNo(8906987656l);
        pat6.setBloodGroup("A-ve");
        pat6.setDiseaseName("Viral Fever");
        pat6.setInsuranceAvailable(true);
        pat6.setAttenderName("Bhaskar");
        pat6.setGender(Gender.male);
        pat6.setGovtId(GovtId.RATION_CARD);
        hos.addPatient(pat6);

        Patient pat7=new Patient();
        pat7.setPatientId(8);
        pat7.setPatientName("Murthy");
        pat7.setAge(68);
        pat7.setPhNo(7206987678l);
        pat7.setBloodGroup("O+ve");
        pat7.setDiseaseName("Tooth Ache");
        pat7.setInsuranceAvailable(false);
        pat7.setAttenderName("Pravalika");
        pat7.setGender(Gender.male);
        pat7.setGovtId(GovtId.PAN);
        hos.addPatient(pat7);

        Patient pat8=new Patient();
        pat8.setPatientId(9);
        pat8.setPatientName("Supriya");
        pat8.setAge(23);
        pat8.setPhNo(9506987656l);
        pat8.setBloodGroup("B+ve");
        pat8.setDiseaseName("Stomach Ache");
        pat8.setInsuranceAvailable(false);
        pat8.setAttenderName("Sanjay");
        pat8.setGender(Gender.female);
        pat8.setGovtId(GovtId.DL);
        hos.addPatient(pat8);

        Patient pat9=new Patient();
        pat9.setPatientId(10);
        pat9.setPatientName("Jayamma");
        pat9.setAge(72);
        pat9.setPhNo(8506987656l);
        pat9.setBloodGroup("O+ve");
        pat9.setDiseaseName("BP");
        pat9.setInsuranceAvailable(false);
        pat9.setAttenderName("Veena");
        pat9.setGender(Gender.female);
        pat9.setGovtId(GovtId.DL);
        hos.addPatient(pat9);

        Patient pat10=new Patient();
        pat10.setPatientId(11);
        pat10.setPatientName("Reshma");
        pat10.setAge(48);
        pat10.setPhNo(6326987656l);
        pat10.setBloodGroup("B+ve");
        pat10.setDiseaseName("Throat infection");
        pat10.setInsuranceAvailable(true);
        pat10.setAttenderName("Nayana");
        pat10.setGender(Gender.female);
        pat10.setGovtId(GovtId.VOTER_ID);
        hos.addPatient(pat10);

        Patient pat11=new Patient();
        pat11.setPatientId(12);
        pat11.setPatientName("Mayur");
        pat11.setAge(33);
        pat11.setPhNo(9811987656l);
        pat11.setBloodGroup("AB+ve");
        pat11.setDiseaseName("Dehydration");
        pat11.setInsuranceAvailable(false);
        pat11.setAttenderName("Bhaskar");
        pat11.setGender(Gender.male);
        pat11.setGovtId(GovtId.RATION_CARD);
        hos.addPatient(pat11);


        Patient pat12=new Patient();
        pat12.setPatientId(13);
        pat12.setPatientName("Deekshith");
        pat12.setAge(18);
        pat12.setPhNo(7276987656l);
        pat12.setBloodGroup("AB+ve");
        pat12.setDiseaseName("Cold flu");
        pat12.setInsuranceAvailable(true);
        pat12.setAttenderName("Veena");
        pat12.setGender(Gender.female);
        pat12.setGovtId(GovtId.PAN);
        hos.addPatient(pat12);

        Patient pat13=new Patient();
        pat13.setPatientId(14);
        pat13.setPatientName("Radha");
        pat13.setAge(29);
        pat13.setPhNo(9810087656l);
        pat13.setBloodGroup("B+ve");
        pat13.setDiseaseName("Vision problem");
        pat13.setInsuranceAvailable(true);
        pat13.setAttenderName("Bhaskar");
        pat13.setGender(Gender.female);
        pat13.setGovtId(GovtId.AADHAAR);
        hos.addPatient(pat13);

        Patient pat14=new Patient();
        pat14.setPatientId(15);
        pat14.setPatientName("Candy Joseph");
        pat14.setAge(57);
        pat14.setPhNo(7217698760l);
        pat14.setBloodGroup("B-ve");
        pat14.setDiseaseName("Diabetes");
        pat14.setInsuranceAvailable(true);
        pat14.setAttenderName("Veema");
        pat14.setGender(Gender.male);
        pat14.setGovtId(GovtId.DL);
        hos.addPatient(pat14);

        Patient pat15=new Patient();
        pat15.setPatientId(16);
        pat15.setPatientName("Prashanth Kumar");
        pat15.setAge(48);
        pat15.setPhNo(9376987656l);
        pat15.setBloodGroup("O-ve");
        pat15.setDiseaseName("Leg PAin");
        pat15.setInsuranceAvailable(true);
        pat15.setAttenderName("Nayana");
        pat15.setGender(Gender.female);
        pat15.setGovtId(GovtId.AADHAAR);
        hos.addPatient(pat15);


        hos.getAllPatient();



    }
}
