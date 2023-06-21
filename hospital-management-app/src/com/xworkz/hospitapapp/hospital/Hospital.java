package com.xworkz.hospitapapp.hospital;

import com.xworkz.hospitapapp.Patient.Patient;

public interface Hospital {

    //has a
    boolean addPatient(Patient patient);
    void getAllPatient();
}
