package com.xworkz.antivirus.repository;

import java.sql.SQLException;

import com.xworkz.antivirus.dto.AntivirusDto;

public interface AntivirusRepository {

	boolean validateAndSave(AntivirusDto dto) throws SQLException;

	boolean searchById(int id);
	boolean updateById(int id,String userName,String email,String phoneNumber, String softwareName, String version, String doe, String password, double price, String osVersion);

	void readAll();

	boolean deleteBySoftwareName(String softwareName);

	boolean searchByVersion(String version);

	boolean searchBySoftwareName(String softwareName);

	boolean updatePriceAndVersionByOsVersion(String osVersion, double price, String version);

	
}
