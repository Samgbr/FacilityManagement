package com.fms.dal.facility;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.fms.dal.DBConnect;
import com.fms.model.facility.Phone;

public class PhoneDAO {

	public Set<Phone> insertPhoneInfos(Set<Phone> phones) {
		
		Connection connection = DBConnect.getDatabaseConnection();
		try {
			Statement insertStatement = connection.createStatement();
			
			Iterator<Phone> phoneIterator = phones.iterator();
			
			while(phoneIterator.hasNext()) {
				/*
				Random randomGenerator = new Random();
			    int randomInt = randomGenerator.nextInt(10000);
			    String phoneID = "PH" + randomInt; */
				
				Phone currentPhone = phoneIterator.next(); 
				
				String insertQuery = "INSERT INTO phone(PhoneID, PhoneNumber, Description,FacilityID) "
						+ "VALUES('"+currentPhone.getPhoneID()+"','"+currentPhone.getPhoneNumber()+"','"+currentPhone.getDescription()+"','"+currentPhone.getFacilityID()+"')";
				insertStatement.executeUpdate(insertQuery);
				
			}		
			
		}catch(SQLException se) {
			se.printStackTrace();
		}finally {
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {}
			}
		}
		return phones;		
	}
	
	//Get all Phones for a Facility
	public Set<Phone> getBuildingPhones(String fid) {
		
		Connection connection = DBConnect.getDatabaseConnection();
		Set<Phone> phones = new HashSet<>();
		
		try {
			Statement selectStatement = connection.createStatement();
			
			String selectQuery = "SELECT * from phone WHERE FacilityID='"+fid+"'";
			ResultSet resultSet = selectStatement.executeQuery(selectQuery);
			
			while(resultSet.next()) {
				String phoneID= resultSet.getString("PhoneID");
				String phoneNumber = resultSet.getString("PhoneNumber");
				String description = resultSet.getString("Description");
				String facilityID = resultSet.getString("FacilityID");
				
				Phone phone = new Phone();
				phone.setPhoneID(phoneID);
				phone.setPhoneNumber(phoneNumber);
				phone.setDescription(description);
				phone.setFacilityID(facilityID);
				phones.add(phone);
			}
			
		}catch(SQLException se) {
			se.printStackTrace();
		}finally {
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {}
			}
		}
		
		return phones;
	}
}
