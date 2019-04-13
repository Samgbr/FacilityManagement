package com.fms.model.lease;
/**
 * This visitor interface  
 */
import com.fms.model.facility.Building;
import com.fms.model.facility.Warehouse;

public interface LeaseVisitor {

	double visit(Building building);
	double visit(Warehouse warehouse);
}
