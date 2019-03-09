package com.fms.model.maintenance;

public class MaintenanceSchedule {

	private String scheduleID;
	private String dateFrom;
	private String dateTo;
	private String morderID;
	private MaintenanceOrder maintenanceOrder;
	
	public MaintenanceOrder getMaintenanceOrder() {
		return maintenanceOrder;
	}
	public void setMaintenanceOrder(MaintenanceOrder maintenanceOrder) {
		this.maintenanceOrder = maintenanceOrder;
	}
	public String getMorderID() {
		return morderID;
	}
	public void setMorderID(String morderID) {
		this.morderID = morderID;
	}
	public String getScheduleID() {
		return scheduleID;
	}
	public void setScheduleID(String scheduleID) {
		this.scheduleID = scheduleID;
	}
	public String getDateFrom() {
		return dateFrom;
	}
	public void setDateFrom(String dateFrom) {
		this.dateFrom = dateFrom;
	}
	public String getDateTo() {
		return dateTo;
	}
	public void setDateTo(String dateTo) {
		this.dateTo = dateTo;
	}
	
	
}
