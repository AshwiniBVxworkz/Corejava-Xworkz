package com.xworkz.healthcare.entity;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="healthCare")
@NamedQuery(name = "findAll", query = "select entity from HealthcareEntity entity ")
public class HealthcareEntity implements Serializable{
@Id
@Column(name="H_id")

	private int id;
@Column(name="H_name")
	private String name;
@Column(name="H_email")
	private String email;
@Column(name="H_phoneNumber")
	private String phoneNumber;
@Column(name="H_address")
	private String address;
@Column(name="H_medicineName")
	private String medicineName;
public HealthcareEntity(String name,String email,String phoneNumber,String address,String medicineName) {
	this.name=name;
	this.email=email;
	this.phoneNumber=phoneNumber;
	this.address=address;
	this.medicineName=medicineName;
 
}
	

}
