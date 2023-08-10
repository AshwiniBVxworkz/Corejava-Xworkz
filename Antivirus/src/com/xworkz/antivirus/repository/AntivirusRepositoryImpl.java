package com.xworkz.antivirus.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.antivirus.dto.AntivirusDto;
import com.xworkz.antivirus.utils.AntivirusUtils;

public class AntivirusRepositoryImpl implements AntivirusRepository{
	AntivirusUtils utils=new AntivirusUtils();
@Override
	public boolean validateAndSave(AntivirusDto dto) throws SQLException {
		
		System.out.println("Inside validtaAndSave method");
		Connection connection = DriverManager.getConnection(utils.jdbcUrl, utils.userName,
				utils.passwordString);
		String query = "insert into  antivirus values(?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		System.out.println("before " + preparedStatement);
		preparedStatement.setInt(1,dto.getId());
		preparedStatement.setString(2, dto.getUserName());
		preparedStatement.setString(3, dto.getEmail());
		preparedStatement.setString(4, dto.getPhoneNumber());
		preparedStatement.setString(5, dto.getSoftwareName());
		preparedStatement.setString(6, dto.getVersion());
		preparedStatement.setString(7, dto.getDoe());
		preparedStatement.setString(8, dto.getPassword());
		preparedStatement.setDouble(9, dto.getPrice());
		preparedStatement.setString(10, dto.getOsVersion());
		System.out.println("After" + preparedStatement);
		int rows = preparedStatement.executeUpdate();
		if (rows > 0) {
			return true;
		} else {

			return false;

		}
		
		
	}
@Override
public boolean searchById(int id) {
	System.out.println("Inside SearchById method after validation ");
	try {
		
Connection connection=		DriverManager.getConnection(utils.jdbcUrl,utils.userName,utils.passwordString);

String query="select *from antivirus where id=? ";
PreparedStatement pr=connection.prepareStatement(query);
System.out.println("Before "+pr);
pr.setInt(1, id);
System.out.println("After "+pr);
ResultSet resultSet=pr.executeQuery();
while (resultSet.next()) {
	System.out.println("Inside while Loop");
	System.out.println("Id:"+resultSet.getInt(1)+"User Name: "+resultSet.getString(2)+ " Email "+resultSet.getString(3)+" Phone  Number: "+resultSet.getString(4)+" Software Name "+resultSet.getString(5)+" Version "+resultSet.getString(6)+" DOE"+resultSet.getString(7)+" password "+resultSet.getString(8)+" Price"+resultSet.getDouble(9)+" OS Version"+resultSet.getString(10));
	
	
}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return true;
}
@Override
public boolean updateById(int id,String userName,String email,String phoneNumber, String softwareName, String version, String doe, String password, double price, String osVersion) {
	System.out.println("Inside updateById method After Validation");
	
	try {
	Connection	 connection  = DriverManager.getConnection(utils.jdbcUrl,utils.userName,utils.passwordString);
		String query="update antivirus SET userName=?, email=?, phoneNumber=?, softwareName=?, version=?, doe=?, password=?, price=?, osVersion=? where id=? ";
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		System.out.println("Before "+preparedStatement);
		preparedStatement.setString(1,userName);
		preparedStatement.setString(2, email);
		preparedStatement.setString(3, phoneNumber);
		preparedStatement.setString(4,softwareName);
		preparedStatement.setString(5, version);
		preparedStatement.setString(6, doe);
		preparedStatement.setString(7, password);
		preparedStatement.setDouble(8, price);
		preparedStatement.setString(9, osVersion);
		preparedStatement.setInt(10, id);
		System.out.println("After "+preparedStatement);
		preparedStatement.executeUpdate();
		
		
		
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
	
	return false;
}
@Override
public void readAll() {
	System.out.println("Inside Read All method after validation");
	
	try {
	Connection	connection = DriverManager.getConnection(utils.jdbcUrl,utils.userName,utils.passwordString);
		String query="Select *from antivirus";
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		ResultSet resultSet=preparedStatement.executeQuery();
		while (resultSet.next()) {
			System.out.println("Id:"+resultSet.getInt(1)+"User Name: "+resultSet.getString(2)+ " Email "+resultSet.getString(3)+" Phone  Number: "+resultSet.getString(4)+" Software Name "+resultSet.getString(5)+" Version "+resultSet.getString(6)+" DOE"+resultSet.getString(7)+" password "+resultSet.getString(8)+" Price"+resultSet.getDouble(9)+" OS Version"+resultSet.getString(10));
			
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	};
	
	
}
@Override
public boolean deleteBySoftwareName(String softwareName) {
System.out.println("deleteBySoftwareName method invoked after validation");
try {
	Connection connection=DriverManager.getConnection(utils.jdbcUrl,utils.userName,utils.passwordString);
	String query="delete from antivirus where softwareName=?";
	PreparedStatement preparedStatement=connection.prepareStatement(query);
	preparedStatement.setString(1, softwareName);
	int rows =preparedStatement.executeUpdate();
	if(rows>0) {
		
		return true;
	}
	
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	return false;
}

	return false;
}
public boolean searchByVersion(String version) {
System.out.println("Inside searchByVersion method after validation");

try {
	 Connection connection=DriverManager.getConnection(utils.jdbcUrl,utils.userName,utils.passwordString);
	 String query="Select *from antivirus where version=?";
	 PreparedStatement preparedStatement=connection.prepareStatement(query);

	 System.out.println("Before "+preparedStatement);
	preparedStatement.setString(1, version);
	System.out.println("After "+preparedStatement);
	ResultSet resultSet=preparedStatement.executeQuery();
	while (resultSet.next()) {
		System.out.println("Inside while Loop");
		System.out.println("Id:"+resultSet.getInt(1)+"User Name: "+resultSet.getString(2)+ " Email "+resultSet.getString(3)+" Phone  Number: "+resultSet.getString(4)+" Software Name "+resultSet.getString(5)+" Version "+resultSet.getString(6)+" DOE"+resultSet.getString(7)+" password "+resultSet.getString(8)+" Price"+resultSet.getDouble(9)+" OS Version"+resultSet.getString(10));
		
		
	}
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

return true;
}
@Override
public boolean searchBySoftwareName(String softwareName) {
	System.out.println("Inside searchBySoftwareName method after validation");
	
	try {
		
		Connection connection=		DriverManager.getConnection(utils.jdbcUrl,utils.userName,utils.passwordString);

		String query="select *from antivirus where softwareName=? ";
		PreparedStatement pr=connection.prepareStatement(query);
		System.out.println("Before "+pr);
		pr.setString(1, softwareName);
		System.out.println("After "+pr);
		ResultSet resultSet=pr.executeQuery();
		while (resultSet.next()) {
			System.out.println("Inside while Loop");
			System.out.println("Id:"+resultSet.getInt(1)+"User Name: "+resultSet.getString(2)+ " Email "+resultSet.getString(3)+" Phone  Number: "+resultSet.getString(4)+" Software Name "+resultSet.getString(5)+" Version "+resultSet.getString(6)+" DOE"+resultSet.getString(7)+" password "+resultSet.getString(8)+" Price"+resultSet.getDouble(9)+" OS Version"+resultSet.getString(10));
			
			
		}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return true;
}
@Override
public boolean updatePriceAndVersionByOsVersion(String osVersion, double price, String version) {
	System.out.println(" Inside  updatePriceAndVersionByOsVersion method after validation");
try {
		
		Connection connection=		DriverManager.getConnection(utils.jdbcUrl,utils.userName,utils.passwordString);

		String query="update antivirus set price=?,version=? where osVersion=? ";
		PreparedStatement pr=connection.prepareStatement(query);
		System.out.println("Before "+pr);
		pr.setDouble(1, price);
		pr.setString(2, version);
		pr.setString(3,osVersion );
		System.out.println("After "+pr);
		pr.executeUpdate();
		
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	return true;
}

}
