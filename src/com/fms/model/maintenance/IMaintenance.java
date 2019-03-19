package com.fms.model.maintenance;

public interface IMaintenance {

	public String getMaintenanceID();
	public void setMaintenanceID(String maintenanceID);
	public String getType();
	public void setType(String type);
	public String getMaintenanceStart();
	public void setMaintenanceStart(String maintenanceStart);
	public String getMaintenanceEnd();
	public void setMaintenanceEnd(String maintenanceEnd);
	public double getCost();
	public void setCost(double cost);
	public String getSStatus();
	public void setSStatus(String sStatus);
}
