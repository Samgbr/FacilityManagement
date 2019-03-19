package com.fms.model.maintenance;

public interface IMaintenanceSchedule {

	public String getScheduleID();
	public void setScheduleID(String scheduleID);
	public String getDateFrom();
	public void setDateFrom(String dateFrom);
	public String getDateTo();
	public void setDateTo(String dateTo);
	public Maintenance getMaintenance();
	public void setMaintenance(Maintenance maintenance);
}
