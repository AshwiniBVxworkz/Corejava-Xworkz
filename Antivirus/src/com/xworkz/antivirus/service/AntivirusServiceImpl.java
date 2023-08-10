package com.xworkz.antivirus.service;

import java.sql.SQLException;

import com.xworkz.antivirus.dto.AntivirusDto;
import com.xworkz.antivirus.repository.AntivirusRepository;
import com.xworkz.antivirus.repository.AntivirusRepositoryImpl;

public class AntivirusServiceImpl implements AntivirusService{
	AntivirusRepository repository= new AntivirusRepositoryImpl();

	@Override
	public boolean validateAndSave(AntivirusDto dto) throws SQLException {
	boolean validate=false;
	if(dto!=null) {
		System.out.println("validation done you can save");
		validate=repository.validateAndSave(dto);
		return true; 
		
	}else {
		return false;
	}
	}

	@Override
	public boolean searchById(int id) {
		System.out.println("Inside searchById method");
		boolean search=false;
		if(id!=0) {
			System.out.println("Validation done,you can search");
			search=repository.searchById(id);
			return search;
			
		}
		else {
		return false;
		}
	}

	@Override
	public boolean updateById(int id,String userName,String email,String phoneNumber, String softwareName, String version, String doe, String password, double price, String osVersion) {
		System.out.println("Inside updateById method");
		boolean update=false;
		if(id!=0) {
			System.out.println("Validation done ,you can update");
			update=repository.updateById(id,userName,email,phoneNumber,softwareName,version,doe,password,price,osVersion);
			return true;
		}else {
		return false;
		}
	}

	@Override
	public void readAll() {
		System.out.println("Inside read All method");
		repository.readAll();
		
	}

	@Override
	public boolean deleteBySoftwareName(String softwareName) {
		boolean delete=false;
		System.out.println("Inside deleteBySoftwareName method");
		if(softwareName!=null) {
			System.out.println("validation done , ypu can proceed to delete");
		delete=	repository.deleteBySoftwareName(softwareName);
		return delete;
			
		}else {
		return false;
		}
	}

	@Override
	public boolean searchByVersion(String version) {
		boolean search=false;
		if(version!=null) {
			search=repository.searchByVersion(version);
			return true;			
		}else {
			return false;
		}
		
	}
@Override
	public boolean searchBySoftwareName(String softwareName) {
		System.out.println("Inside searchBySoftwareName method");
		boolean search=false;
		if(softwareName!=null) {
		search=repository.searchBySoftwareName(softwareName);
		return search;
		}else {
		return search;
		}
	}

@Override
public boolean updatePriceAndVersionByOsVersion(String osVersion, double price, String version) {
	System.out.println("Inside updatePriceAndVersionByOsVersion method");
	boolean update=false;
	if(osVersion!=null && price!=0 && version!=null) {
		System.out.println("Validation done ,you can update now");
		update=repository. updatePriceAndVersionByOsVersion(osVersion,price, version);
		return update;
	}else {
		return update;
	}
	
}

}
