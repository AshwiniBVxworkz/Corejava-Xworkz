package com.xworkz.hospitapapp.hospital;

import com.xworkz.hospitapapp.Patient.Patient;

public class ApolloImpl implements Hospital {

    Patient patient[] = new Patient[16];
    int index;

    @Override
    public boolean addPatient(Patient patient) {
        System.out.println("Invoked addPatient method ");
        boolean isAdded = false;
        if (patient != null) {
            System.out.println("Patient check is completed ...Proceed to add Patient");
            if (patient.getPatientName() != null && !patient.getPatientName().isEmpty() && patient.getBloodGroup()!=null && !patient.getPatientName().isEmpty()) {
                this.patient[index++] = patient;

                isAdded = true;
                System.out.println(" Patient Name Added Successfully");
            } else {
                System.out.println("Patient Name is empty");
            }
        } else {
            System.out.println("There is no patient");
        }
        return isAdded;
    }

    @Override
    public void getAllPatient() {
        System.out.println("getAllPatient metho invoked");
        System.out.println(" List of Patients are:");
        for (Patient pat:this.patient) {
            System.out.println(pat);
        }


    }
}