package com.fms.model.inspection;

import com.fms.model.facility.Building;
import com.fms.model.facility.Facility;
import com.fms.model.user.User;

public interface IInspection {

	public Facility getBuilding();
	public void setBuilding(Building building);
	public User getUser();
	public void setUser(User user);
	
}
