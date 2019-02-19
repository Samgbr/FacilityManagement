package com.fms.model.maintenance.service;
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
	
	
}
