package com.fms.dal.inspection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.fms.dal.DBConnect;
import com.fms.model.inspection.HeatingSystem;

public class InspectionDAO {
	
	//Insert inspection informations
	public Set<HeatingSystem> insertInspectionInfo(Set<HeatingSystem> inspections, String facilityID){
		Connection connection = DBConnect.getDatabaseConnection();
		try {
			Statement insertStatement=connection.createStatement();
			
			Iterator<HeatingSystem> inspectionIterator=inspections.iterator();
			while(inspectionIterator.hasNext()) {
				
				HeatingSystem currentInspection=inspectionIterator.next();
				
				String insertQuery="INSERT INTO inspection(InspectionID,DateFrom,DateTo,InspectedBy,FacilityID,InspectionType) "
						+"VALUES('"+currentInspection.getInspectionID()+"','"+currentInspection.getDateFrom()+"','"+currentInspection.getDateTo()+"','"+currentInspection.getInspectedBy()+"','"+facilityID+"','"+currentInspection.getInspectionType()+"')";
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
		return inspections;
	}
	
	
	//retrieve all inspections for a facility
	public Set<HeatingSystem> getBuildingInspections() {
		
		Connection connection = DBConnect.getDatabaseConnection();
		
		Set<HeatingSystem> inspections = new HashSet<>();
		
		try {
			Statement selectStatement = connection.createStatement();
			
			String selectQuery = "SELECT * from inspection";
			ResultSet resultSet=selectStatement.executeQuery(selectQuery);
			
			while(resultSet.next()) {
				String inspectionID=resultSet.getString("InspectionID");
				String dateFrom=resultSet.getString("DateFrom");
				String dateTo=resultSet.getString("DateTo");
				String inspectedBy=resultSet.getString("InspectedBy");
				String inspectionType=resultSet.getString("InspectionType");
				
				HeatingSystem inspection=new HeatingSystem();
				inspection.setInspectionID(inspectionID);
				inspection.setDateFrom(dateFrom);
				inspection.setDateTo(dateTo);
				inspection.setInspectedBy(inspectedBy);
				inspection.setInspectionType(inspectionType);
				inspections.add(inspection);
				
				
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
		return inspections;
	}

}
