package com.fms.model.lease.decorator;

import com.fms.model.facility.Building;
/**
 * Decorator Implementation
 * @author samzi
 *
 */
public interface ILeaseDiscountDecorator {

	public Building getBuilding();
	public void setBuilding(Building building);
}
