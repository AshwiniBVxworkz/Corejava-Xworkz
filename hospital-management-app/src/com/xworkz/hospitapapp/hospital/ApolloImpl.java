package com.xworkz.hospitapapp.hospital;

import com.xworkz.hospitapapp.Patient.Patient;

public class ApolloImpl implements Hospital {

    Patient patient[] ;
    int index;

    public ApolloImpl(int size ){
        patient=new Patient[size];
    }
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
    public Patient getPatientByAddress(String address) {
        System.out.println(" getPatientByAddress method is invoked");
        for (int i=0;i<this.patient.length;i++){
            if(this.patient[i].getAddress().equals(address)){
                System.out.println(this.patient[i]);
            }
        }
        return null;
    }

    @Override
    public String getAllPatient() {
        System.out.println("getAllPatient method invoked");
        System.out.println(" List of Patients are:");
        for (Patient pat:this.patient) {
            System.out.println(pat);
        }

        return null;
    }

    @Override
    public String getPatientNameByWardNo(int WardNo) {

        System.out.println(" getPatientNameByWardNo is invoked");
        for (int i=0;i< this.patient.length;i++) {
            if (this.patient[i].getWardNo()==WardNo){
                StringBuilder patientName=new StringBuilder();
                patientName= patientName.append( this.patient[i].getPatientName());
                System.out.println( patientName);
            }
        }
        return "not found ";
    }


 @Override
public boolean updatePatientWardNoByPatientId(int existingId, int updateWardNo) {
        boolean isUpdate=false;
        for (int i=0;i< patient.length;i++){
            if(this.patient[i].getPatientId()==(existingId)){
       this.patient[i].setWardNo( updateWardNo);
        isUpdate=true;
                System.out.println("Ward Number updated");
                System.out.println(this.patient[i]);
            }

        }


        return isUpdate;
    }

    public String[] getPatientNameByDiseaseName(String diseaseName){

        System.out.println(" getPatientNameByDiseaseNAme is invoked");
        for (int i=0;i< this.patient.length;i++) {
            if (this.patient[i].getDiseaseName().equals(diseaseName)){
                StringBuilder patientName=new StringBuilder();
                patientName= patientName.append( this.patient[i].getPatientName());
                System.out.println( patientName);
            }
        }
        return null;
    }

    public boolean updatePatientDiseaseByPatientName(String existingPatientName,String updateDisease){
        boolean isUpdated=false;
        for (int i=0;i< patient.length;i++){
            if(this.patient[i].getPatientName().equals(existingPatientName)){
                this.patient[i].setDiseaseName(updateDisease );
                isUpdated=true;
                System.out.println("Disease Name is updated");
                System.out.println(this.patient[i]);
            }

        }

        return isUpdated;
    }

}