package com.xworkz.antivirus.controller;

import java.sql.SQLException;

import com.xworkz.antivirus.dto.AntivirusDto;
import com.xworkz.antivirus.service.AntivirusService;
import com.xworkz.antivirus.service.AntivirusServiceImpl;

public class Runner {
	public static void main(String[] args) throws SQLException {
		System.out.println("Inside main method");
		AntivirusDto dto = new AntivirusDto();
		dto.setId(3);
		dto.setUserName("Seetha");
		dto.setEmail("Seetha@gmail.com");
		dto.setPhoneNumber("717654567");
		dto.setSoftwareName("Norton");
		dto.setVersion("9.4");
		dto.setDoe("9/4/2029");
		dto.setPassword("97uhdsdjhf87r89");
		dto.setPrice(978.90);
		dto.setOsVersion("12");
		System.out.println(dto);
		AntivirusService service = new AntivirusServiceImpl();
		//service.validateAndSave(dto);
		//service.searchById(1);
		//service.updateById(1, "Shiv", "Shiv@gmail.com", "6789876545", "Norton", "7.7", "8/8/2026", "56789roiufdsjh", 897.90, "7");
		//service.readAll();
		//service.deleteBySoftwareName("Norton");
		//service.searchByVersion("5.4");
		//service.searchBySoftwareName("MacAfee");
		service.updatePriceAndVersionByOsVersion("12", 987.89, "5.7");
	}

}
