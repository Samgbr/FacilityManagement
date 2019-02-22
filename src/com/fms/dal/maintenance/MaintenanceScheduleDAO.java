package com.fms.dal.maintenance;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.fms.dal.DBConnect;
import com.fms.model.maintenance.MaintenanceSchedule;

public class MaintenanceScheduleDAO {

	public MaintenanceSchedule insertMaintenanceSchedule(String scheduleID, String dateFrom, String dateTo, String morderID) {
			
			MaintenanceSchedule maintenanceSchedule = new MaintenanceSchedule();
			maintenanceSchedule.setScheduleID(scheduleID);
			maintenanceSchedule.setDateFrom(dateFrom);
			maintenanceSchedule.setDateTo(dateTo);
			maintenanceSchedule.setMorderID(morderID);

			Connection connection = DBConnect.getDatabaseConnection();
			try {
				Statement insertStatement = connection.createStatement();
					
					String insertQuery = "INSERT INTO maintenanceschedule(ScheduleID, DateFrom, DateTo, MOrderID) "
							+ "VALUES('"+scheduleID+"','"+dateFrom+"','"+dateTo+"','"+morderID+"')";
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
			return maintenanceSchedule;		
		}
	
	
	//Get Maintenance Schedule
	public MaintenanceSchedule getMaintenanceSchedule(String msid) {
			String scheduleID=msid;
			String dateFrom ="";
			String dateTo = "";
			String mOrderID="";
			
			Connection connection = DBConnect.getDatabaseConnection();
			
			
			try {
				Statement selectStatement = connection.createStatement();
				
				String selectQuery = "SELECT * from maintenanceschedule where ScheduleID='" + msid +"'";
				ResultSet resultSet = selectStatement.executeQuery(selectQuery);
				resultSet.next();
				dateFrom= resultSet.getString("DateFrom");
				dateTo = resultSet.getString("DateTo");
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
			
			MaintenanceSchedule maintenanceSchedule = new MaintenanceSchedule();
			maintenanceSchedule.setScheduleID(scheduleID);
			maintenanceSchedule.setDateFrom(dateFrom);
			maintenanceSchedule.setDateTo(dateTo);
			maintenanceSchedule.setMorderID(mOrderID);
			
			return maintenanceSchedule;	
		}
}
