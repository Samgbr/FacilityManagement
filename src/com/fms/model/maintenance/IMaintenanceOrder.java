package com.fms.model.maintenance;

public interface IMaintenanceOrder {

	public String getMorderID();
	public void setMorderID(String morderID);
	public String getOrderDate();
	public void setOrderDate(String orderDate);
	public String getmStatus();
	public void setmStatus(String mStatus);
	public MaintenanceSchedule getMaintenanceSchedule();
	public void setMaintenanceSchedule(MaintenanceSchedule maintenanceSchedule);
}
