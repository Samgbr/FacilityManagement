package com.fms.model.inspection;

import com.fms.model.facility.Building;
import com.fms.model.facility.Facility;

public interface IInspection {

	public Facility getBuilding();
	public void setBuilding(Building building);
	
}
