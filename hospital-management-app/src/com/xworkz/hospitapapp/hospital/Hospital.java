package com.xworkz.hospitapapp.hospital;

import com.xworkz.hospitapapp.Patient.Patient;

public interface Hospital {

    //has a
    boolean addPatient(Patient patient);
    String getAllPatient();

    String getPatientNameByWardNo(int WardNo);
     boolean updatePatientWardNoByPatientId(int existingId, int updateWardNo);
     Patient getPatientByAddress(String address);
     String[] getPatientNameByDiseaseName(String diseaseName);
     boolean updatePatientDiseaseByPatientName(String existingPatientName,String updateDisease);


}
