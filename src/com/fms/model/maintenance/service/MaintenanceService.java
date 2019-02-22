package com.fms.model.maintenance.service;
import java.util.Map;
import java.util.Set;

import com.fms.dal.maintenance.MaintenanceDAO;
import com.fms.dal.maintenance.MaintenanceOrderDAO;
import com.fms.dal.maintenance.MaintenanceRequestDAO;
import com.fms.dal.maintenance.MaintenanceScheduleDAO;
import com.fms.model.maintenance.Maintenance;
import com.fms.model.maintenance.MaintenanceOrder;
import com.fms.model.maintenance.MaintenanceRequest;
import com.fms.model.maintenance.MaintenanceSchedule;

public class MaintenanceService {

	private MaintenanceDAO maintenanceDAO = new MaintenanceDAO();
	private MaintenanceOrderDAO maintenanceOrderDAO = new MaintenanceOrderDAO();
	private MaintenanceRequestDAO maintenanceRequestDAO = new MaintenanceRequestDAO();
	private MaintenanceScheduleDAO maintenanceScheduleDAO = new MaintenanceScheduleDAO();
	
	//Insert new Maintenance request
	public void addMaintenanceRequest(MaintenanceRequest request) {
		
		try {
			maintenanceRequestDAO.insertMaintenanceRequest(request.getRequestID(), request.getDescription(), request.getRequestDate(), request.getUserID(), request.getRoomID());
	    } catch (Exception se) {
	      System.err.println("FacilityMaintenanceService: Threw a Exception adding Maintenance Request.");
	      System.err.println(se.getMessage());
	    }
	}
	
	//Update Request order id
	public void UpdateRequest(String requestID, String morderID) {
			
			try {
				maintenanceRequestDAO.updateRequest(requestID, morderID);
		    } catch (Exception se) {
		      System.err.println("FacilityMaintenanceService: Threw a Exception Updating Maintenance Request.");
		      System.err.println(se.getMessage());
		    }
	}
	
	//Insert new Maintenance order
	public void addMaintenanceOrder(MaintenanceOrder order) {
			
			try {
				maintenanceOrderDAO.insertMaintenanceOrder(order.getMorderID(), order.getOrderDate(), order.getmStatus());
		    } catch (Exception se) {
		      System.err.println("FacilityMaintenanceService: Threw a Exception adding Maintenance Order.");
		      System.err.println(se.getMessage());
		    }
	}
	
	//Insert new Maintenance schedule
	public void addMaintenanceSchedule(MaintenanceSchedule schedule) {
				
				try {
					maintenanceScheduleDAO.insertMaintenanceSchedule(schedule.getScheduleID(), schedule.getDateFrom(), schedule.getDateTo(), schedule.getMorderID());
			    } catch (Exception se) {
			      System.err.println("FacilityMaintenanceService: Threw a Exception adding Maintenance Schedule.");
			      System.err.println(se.getMessage());
			    }
	}
	
	//Insert new Maintenance
	public void addMaintenance(Maintenance maintenance) {
					
					try {
						maintenanceDAO.insertMaintenance(maintenance.getMaintenanceID(), maintenance.getType(), maintenance.getMaintenanceStart(), maintenance.getMaintenanceEnd(), maintenance.getCost(), maintenance.getSStatus(), maintenance.getScheduleID(), maintenance.getMOrderID());
				    } catch (Exception se) {
				      System.err.println("FacilityMaintenanceService: Threw a Exception adding Maintenance Schedule.");
				      System.err.println(se.getMessage());
				    }
	}
	
	//Calculate Maintenance cost for facility
	public double MaintenanceCostForFacility(String roomID) {
		double totalCost = 0.0;
		try {
			
			Set<MaintenanceRequest> requests = maintenanceRequestDAO.getMRequestsByRoomID(roomID);
			for (MaintenanceRequest r: requests) {
				totalCost += maintenanceDAO.getMaintenanceCost(r.getMorderID());
			}
			
		} catch (Exception se) {
		      System.err.println("FacilityMaintenanceCostService: Threw a Exception retrieving Facility Maintenance Cost.");
		      System.err.println(se.getMessage());
		}
		return totalCost;
	}
	
	
	//Calculate problem rate for facility
	public Map<String,Integer> listMaintenanceRequestIssuesRate(String roomID) {
		
		try {
			Map<String,Integer> problemRate = maintenanceRequestDAO.listMaintenanceRequestIssuesRate(roomID);
	    	return problemRate;
	    } catch (Exception se) {
	      System.err.println("FacilityMaintenanceProblemRateService: Threw a Exception retrieving Facility Problem Rate.");
	      System.err.println(se.getMessage());
	    }
		return null;
	}
	
	
	//Calculate down time for a facility in millisecond
	public long MaintenanceDownTimeFacility(String roomID) {
		long days = 0;
		try {
			
			Set<MaintenanceRequest> requests = maintenanceRequestDAO.getMRequestsByRoomID(roomID);
			for (MaintenanceRequest r: requests) {
				days += maintenanceDAO.getMaintenanceDownTime(r.getMorderID());
			}
			
		} catch (Exception se) {
		      System.err.println("FacilityMaintenanceCostService: Threw a Exception retrieving Facility Maintenance Cost.");
		      System.err.println(se.getMessage());
		}
		return days/ (1000 * 60 * 60 * 24);
	}
	
	
	
	//List Maintenance
	public Maintenance getMaintenance(String mid) {
			
			try {
				Maintenance maintenance = maintenanceDAO.getMaintenance(mid);
		    	return maintenance;
		    } catch (Exception se) {
		      System.err.println("FacilityMaintenanceService: Threw a Exception retrieving Facility Maintenance.");
		      System.err.println(se.getMessage());
		    }
			return null;
	}
	
	//List facility problems
	public Set<String> listMaintenanceRequestIssues() {
		
		try {
			Set<String> issues = maintenanceRequestDAO.listMaintenanceRequestIssues();
	    	return issues;
	    } catch (Exception se) {
	      System.err.println("FacilityMaintenanceIssuesService: Threw a Exception retrieving Facility Maintenance Issues.");
	      System.err.println(se.getMessage());
	    }
		return null;
	}
	
	
	//List Maintenance Requests
	public Set<MaintenanceRequest> listMintenanceRequests() {
					
				try {
					Set<MaintenanceRequest> requests = maintenanceRequestDAO.listMaintenanceRequests();
			    	return requests;
			    } catch (Exception se) {
			      System.err.println("FacilityService: Threw a Exception retrieving Facilities.");
			      System.err.println(se.getMessage());
			    }
				return null;
	}
	
	//List Maintenance Request
	public MaintenanceRequest getMaintenanceRequest(String mrid) {
		
		try {
			MaintenanceRequest maintenanceRequest = maintenanceRequestDAO.getMaintenanceRequest(mrid);
	    	return maintenanceRequest;
	    } catch (Exception se) {
	      System.err.println("FacilityMaintenanceRequestService: Threw a Exception retrieving Facility Maintenance Requests.");
	      System.err.println(se.getMessage());
	    }
		return null;
	}
	
	//List Maintenance Order
	public MaintenanceOrder getMaintenanceOrder(String moid) {
		
		try {
			MaintenanceOrder maintenanceOrder = maintenanceOrderDAO.getMaintenance(moid);
	    	return maintenanceOrder;
	    } catch (Exception se) {
	      System.err.println("FacilityMaintenanceOrderService: Threw a Exception retrieving Facility Maintenance Order.");
	      System.err.println(se.getMessage());
	    }
		return null;
	}
	
	//List Maintenance Schedule
	public MaintenanceSchedule getMaintenanceSchedule(String mrid) {
		
		try {
			MaintenanceSchedule maintenanceSchedule = maintenanceScheduleDAO.getMaintenanceSchedule(mrid);
	    	return maintenanceSchedule;
	    } catch (Exception se) {
	      System.err.println("FacilityMaintenanceScheduleService: Threw a Exception retrieving Facility Maintenance Schedule.");
	      System.err.println(se.getMessage());
	    }
		return null;
	}
	
}
