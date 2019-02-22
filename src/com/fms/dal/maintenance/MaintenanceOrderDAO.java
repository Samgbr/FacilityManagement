package com.fms.dal.maintenance;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.fms.dal.DBConnect;
import com.fms.model.maintenance.MaintenanceOrder;

public class MaintenanceOrderDAO {

	public MaintenanceOrder insertMaintenanceOrder(String morderID, String orderDate, String mStatus) {
			
			MaintenanceOrder maintenanceOrder = new MaintenanceOrder();
			maintenanceOrder.setMorderID(morderID);
			maintenanceOrder.setOrderDate(orderDate);
			maintenanceOrder.setmStatus(mStatus);
			
			Connection connection = DBConnect.getDatabaseConnection();
			try {
				Statement insertStatement = connection.createStatement();
					
					String insertQuery = "INSERT INTO maintenanceorder(MOrderID, Orderdate, MStatus) "
							+ "VALUES('"+morderID+"','"+orderDate+"','"+mStatus+"')";
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
			return maintenanceOrder;		
		}
	
	//Get Maintenance Order
		public MaintenanceOrder getMaintenance(String moid) {
			String mOrderID=moid;
			String orderDate="";
			String mStatus = "";
			
			Connection connection = DBConnect.getDatabaseConnection();
			
			
			try {
				Statement selectStatement = connection.createStatement();
				
				String selectQuery = "SELECT * from maintenanceorder where MOrderID='" + moid +"'";
				ResultSet resultSet = selectStatement.executeQuery(selectQuery);
				resultSet.next();
				orderDate= resultSet.getString("Orderdate");
				mStatus = resultSet.getString("MStatus");
				
			}catch(SQLException se) {
				se.printStackTrace();
			}finally {
				if(connection != null) {
					try {
						connection.close();
					} catch (SQLException e) {}
				}
			}
			
			MaintenanceOrder maintenanceOrder = new MaintenanceOrder();
			maintenanceOrder.setMorderID(mOrderID);
			maintenanceOrder.setOrderDate(orderDate);
			maintenanceOrder.setmStatus(mStatus);
			
			return maintenanceOrder;	
		}
}
