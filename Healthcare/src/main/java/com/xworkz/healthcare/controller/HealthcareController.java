package com.xworkz.healthcare.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.healthcare.entity.HealthcareEntity;

public class HealthcareController {
	public static void main(String[] args) {
		System.out.println("Inside main method");
		HealthcareEntity entity = new HealthcareEntity(6, "Shiv", "shiv@gmail.com", "8976567889", "RRNagar",
				"tablet-cchrosin");
		HealthcareEntity entity1 = new HealthcareEntity(7, "Ram", "ram@gmail.com", "9976567889", "Jayagar",
				"Ointment-clearget");
		HealthcareEntity entity2 = new HealthcareEntity(8, "Sitha", "sitha@gmail.com", "7976567889", "RRNagar",
				"Tbalet-Cyradi");

		System.out.println(entity);
		System.out.println(entity1);
		System.out.println(entity2);

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		System.out.println("Add records...................");
		// manager.persist(entity);
		// manager.persist(entity1);
		// manager.persist(entity2);

		System.out.println("Find a record............................");
		HealthcareEntity findEntity = manager.find(HealthcareEntity.class, 8);
		System.out.println(findEntity);
		System.out.println("Update a record...........................");
		if (findEntity != null) {
			System.out.println("entity is not null ,you can proceed to update ");
			findEntity.setName("Nidhi");
			manager.merge(findEntity);
			System.out.println(findEntity);
		} else {
			System.out.println("No such entity found");
		}
		System.out.println("Get all / find all records...........................");
		Query query = manager.createNamedQuery("findAll");
		List list = query.getResultList();
		System.out.println(list);
		System.out.println(list.size());
		
		
		System.out.println("Delete a record........................");
		System.out.println(findEntity);
		System.out.println("Size before deletion"+list.size());
		manager.remove(findEntity);
		System.out.println("Size after deletion"+list.size());
		transaction.commit();
		manager.close();

	}

}
