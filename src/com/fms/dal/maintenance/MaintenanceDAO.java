package com.fms.dal.maintenance;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import com.fms.dal.DBConnect;
import com.fms.model.maintenance.Maintenance;

public class MaintenanceDAO {

	public Maintenance insertMaintenance(String maintenanceID, String type, String maintenanceStart, String maintenanceEnd, double cost, String sStatus, String scheduleID, String mOrderID) {
			
			Maintenance maintenance = new Maintenance();
			maintenance.setMaintenanceID(maintenanceID);
			maintenance.setType(type);
			maintenance.setMaintenanceStart(maintenanceStart);
			maintenance.setMaintenanceEnd(maintenanceEnd);
			maintenance.setCost(cost);
			maintenance.setSStatus(sStatus);
			maintenance.setScheduleID(scheduleID);
			maintenance.setMOrderID(mOrderID);
			
			Connection connection = DBConnect.getDatabaseConnection();
			try {
				Statement insertStatement = connection.createStatement();
					
					String insertQuery = "INSERT INTO maintenance(MaintenanceID, Type, MaintenanceStart,MaintenanceEnd,Cost,SStatus,ScheduleID,MOrderID) "
							+ "VALUES('"+maintenanceID+"','"+type+"','"+maintenanceStart+"','"+maintenanceEnd+"','"+cost+"','"+sStatus+"','"+scheduleID+"','"+mOrderID+"')";
					insertStatement.executeUpdate(insertQuery);	
					
			}catch(SQLException se) {
				se.printStackTrace();
			}finally {
				if(connection != null) {
					try {
						connection.close();
					} catch (SQLException e) {}
				}
			}
			return maintenance;		
		}
	
	//Get Maintenance Cost By Maintenance OrderID
	public double getMaintenanceCost(String morderid) {
		double cost = 0.0;
		
		Connection connection = DBConnect.getDatabaseConnection();
		
		
		try {
			Statement selectStatement = connection.createStatement();
			
			String selectQuery = "SELECT * from maintenance where MOrderID='" + morderid +"'";
			ResultSet resultSet = selectStatement.executeQuery(selectQuery);
			resultSet.next();
			cost = resultSet.getDouble("Cost");
			
		}catch(SQLException se) {
			se.printStackTrace();
		}finally {
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {}
			}
		}
		
		return cost;	
	}
	
	//Get Maintenance Cost By Maintenance Down Time in millisecond
		public long getMaintenanceDownTime(String morderid) {
			long days = 0;
			Date mStart = new Date();
			Date mEnd = new Date();
			
			Connection connection = DBConnect.getDatabaseConnection();
			
			
			try {
				Statement selectStatement = connection.createStatement();
				
				String selectQuery = "SELECT * from maintenance where MOrderID='" + morderid +"'";
				ResultSet resultSet = selectStatement.executeQuery(selectQuery);
				resultSet.next();
				mStart = resultSet.getDate("MaintenanceStart");
				mEnd = resultSet.getDate("MaintenanceEnd");
				
				days = mEnd.getTime() - mStart.getTime();
				
			}catch(SQLException se) {
				se.printStackTrace();
			}finally {
				if(connection != null) {
					try {
						connection.close();
					} catch (SQLException e) {}
				}
			}
			
			return days;	
		}
	
	//Get Maintenance
		public Maintenance getMaintenance(String mid) {
			String maintenanceID=mid;
			String type="";
			String maintenanceStart = "";
			String maintenanceEnd = "";
			double cost = 0.0;
			String sStatus = "";
			String scheduleID="";
			String mOrderID="";
			
			Connection connection = DBConnect.getDatabaseConnection();
			
			
			try {
				Statement selectStatement = connection.createStatement();
				
				String selectQuery = "SELECT * from maintenance where MaintenanceID='" + mid +"'";
				ResultSet resultSet = selectStatement.executeQuery(selectQuery);
				resultSet.next();
				type= resultSet.getString("Type");
				maintenanceStart = resultSet.getString("MaintenanceStart");
				maintenanceEnd = resultSet.getString("MaintenanceEnd");
				cost = resultSet.getDouble("Cost");
				sStatus = resultSet.getString("SStatus");
				scheduleID = resultSet.getString("ScheduleID");
				mOrderID = resultSet.getString("MOrderID");
				
			}catch(SQLException se) {
				se.printStackTrace();
			}finally {
				if(connection != null) {
					try {
						connection.close();
					} catch (SQLException e) {}
				}
			}
			
			Maintenance maintenance = new Maintenance();
			maintenance.setMaintenanceID(maintenanceID);
			maintenance.setType(type);
			maintenance.setCost(cost);
			maintenance.setMaintenanceEnd(maintenanceEnd);
			maintenance.setMaintenanceStart(maintenanceStart);
			maintenance.setSStatus(sStatus);
			maintenance.setScheduleID(scheduleID);
			maintenance.setMOrderID(mOrderID);
			
			return maintenance;	
		}
	
}
