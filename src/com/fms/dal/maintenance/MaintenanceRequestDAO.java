package com.fms.dal.maintenance;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.fms.dal.DBConnect;
import com.fms.model.maintenance.MaintenanceRequest;

public class MaintenanceRequestDAO {

	public MaintenanceRequest insertMaintenanceRequest(String requestID, String description, String requestDate, String userID, String roomID) {
		
		MaintenanceRequest maintenanceRequest = new MaintenanceRequest();
		maintenanceRequest.setRequestID(requestID);
		maintenanceRequest.setDescription(description);
		maintenanceRequest.setUserID(userID);
		maintenanceRequest.setRoomID(roomID);
		
		Connection connection = DBConnect.getDatabaseConnection();
		try {
			Statement insertStatement = connection.createStatement();
				
				String insertQuery = "INSERT INTO maintenancereq(RequestID, Description, RequestDate, RoomID, UserID) "
						+ "VALUES('"+requestID+"','"+description+"','"+requestDate+"','"+roomID+"','"+userID+"')";
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
		return maintenanceRequest;		
	}
	
	/**
	 * This method updates the request order id
	 * @param requestID
	 * @param morderID
	 */
	public void updateRequest(String requestID, String morderID) {
		
		Connection connection = DBConnect.getDatabaseConnection();
		try {
			Statement insertStatement = connection.createStatement();
				
				String insertQuery = "UPDATE maintenancereq SET MOrderID='"+morderID+"'  WHERE RequestID='"+requestID+"'";
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
	}
	
	//Get Maintenance Request
		public MaintenanceRequest getMaintenanceRequest(String mrid) {
			String requestID=mrid;
			String description="";
			String requestDate = "";
			String userID = "";
			String roomID = "";
			String mOrderID="";
			
			Connection connection = DBConnect.getDatabaseConnection();
			
			
			try {
				Statement selectStatement = connection.createStatement();
				
				String selectQuery = "SELECT * from maintenancereq where RequestID='" + mrid +"'";
				ResultSet resultSet = selectStatement.executeQuery(selectQuery);
				resultSet.next();
				requestDate= resultSet.getString("RequestDate");
				userID = resultSet.getString("UserID");
				roomID = resultSet.getString("RoomID");
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
			
			MaintenanceRequest maintenanceRequest = new MaintenanceRequest();
			maintenanceRequest.setRequestID(requestID);
			maintenanceRequest.setDescription(description);
			maintenanceRequest.setRequestDate(requestDate);
			maintenanceRequest.setUserID(userID);
			maintenanceRequest.setRoomID(roomID);
			maintenanceRequest.setMorderID(mOrderID);
			
			return maintenanceRequest;	
		}
		
		//Get Maintenance Requests
		public Set<MaintenanceRequest> listMaintenanceRequests() {
			
			Connection connection = DBConnect.getDatabaseConnection();
			Set<MaintenanceRequest> requests = new HashSet<>();
			
			try {
				Statement selectStatement = connection.createStatement();
				
				String selectQuery = "SELECT * from maintenancereq";
				ResultSet resultSet = selectStatement.executeQuery(selectQuery);
				
				while(resultSet.next()) {
					String requestID = resultSet.getString("RequestID");
					MaintenanceRequest request = getMaintenanceRequest(requestID);
					if(request != null) {
						requests.add(request);
					}
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
			
			return requests;
			
		}
		
		//Get Maintenance Request Issues
		public Set<String> listMaintenanceRequestIssues() {
					
					Connection connection = DBConnect.getDatabaseConnection();
					Set<String> issues = new HashSet<>();
					
					try {
						Statement selectStatement = connection.createStatement();
						
						String selectQuery = "SELECT Description from maintenancereq GROUP BY Description";
						ResultSet resultSet = selectStatement.executeQuery(selectQuery);
						
						while(resultSet.next()) {
							String description = resultSet.getString("Description");
							if(description != null) {
								issues.add(description);
							}
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
					
					return issues;
					
		}
		
		///SELECT Description,COUNT(*) AS Rate FROM maintenancereq WHERE RoomID="RM8094" GROUP BY Description HAVING count(Description);
		//Get Maintenance Request Issues Count
		public Map<String,Integer> listMaintenanceRequestIssuesRate(String roomID) {
							
							Connection connection = DBConnect.getDatabaseConnection();
							Map<String,Integer> issues = new HashMap<>();
							
							try {
								Statement selectStatement = connection.createStatement();
								
								String selectQuery = "SELECT Description,COUNT(*) AS Rate from maintenancereq where RoomID='" + roomID +"' GROUP BY Description HAVING count(Description)";
								ResultSet resultSet = selectStatement.executeQuery(selectQuery);
								
								while(resultSet.next()) {
									String description = resultSet.getString("Description");
									int rate = resultSet.getInt("Rate");
									if(description != null) {
										issues.put(description, rate);
									}
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
							
							return issues;
							
		}

		
		//Get Maintenance Requests by Facility
		public Set<MaintenanceRequest> getMRequestsByRoomID(String roomID) {
				
				Connection connection = DBConnect.getDatabaseConnection();
				Set<MaintenanceRequest> requests = new HashSet<>();
				
				try {
					Statement selectStatement = connection.createStatement();
					
					String selectQuery = "SELECT * from maintenancereq where RoomID='" + roomID +"'";
					ResultSet resultSet = selectStatement.executeQuery(selectQuery);
					
					while(resultSet.next()) {
						String requestID = resultSet.getString("RequestID");
						MaintenanceRequest request = getMaintenanceRequest(requestID);
						if(request != null) {
							requests.add(request);
						}
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
				
				return requests;
		}
}
