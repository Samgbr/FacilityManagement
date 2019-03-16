package com.fms.model.maintenance;

public class MaintenanceSchedule implements IMaintenanceSchedule{

	private String scheduleID;
	private String dateFrom;
	private String dateTo;
	private String morderID;
	private Maintenance maintenance;
	
	public Maintenance getMaintenance() {
		return maintenance;
	}
	public void setMaintenance(Maintenance maintenance) {
		this.maintenance = maintenance;
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
