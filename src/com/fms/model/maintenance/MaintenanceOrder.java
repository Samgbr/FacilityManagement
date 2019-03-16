package com.fms.model.maintenance;

public class MaintenanceOrder implements IMaintenanceOrder {

	private String morderID;
	private String orderDate;
	private String mStatus;
	private MaintenanceSchedule maintenanceSchedule;
	
	public MaintenanceSchedule getMaintenanceSchedule() {
		return maintenanceSchedule;
	}
	public void setMaintenanceSchedule(MaintenanceSchedule maintenanceSchedule) {
		this.maintenanceSchedule = maintenanceSchedule;
	}
	public String getMorderID() {
		return morderID;
	}
	public void setMorderID(String morderID) {
		this.morderID = morderID;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getmStatus() {
		return mStatus;
	}
	public void setmStatus(String mStatus) {
		this.mStatus = mStatus;
	}	
	
}
