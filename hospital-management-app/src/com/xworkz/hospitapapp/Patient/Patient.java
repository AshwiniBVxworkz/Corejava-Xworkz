package com.xworkz.hospitapapp.Patient;

import com.xworkz.hospitapapp.constant.Gender;
import com.xworkz.hospitapapp.constant.GovtId;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class Patient {
    private int patientId;
    private String patientName;
    private int age;
    private  String diseaseName;
    Gender gender;
    private String bloodGroup;
    private long phNo;
    private boolean isInsuranceAvailable;
    private  String attenderName;
    GovtId govtId;
    private int wardNo;
    Address address;



}
