package test.java;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.fms.model.maintenance.MaintenanceRequest;
import com.fms.model.maintenance.service.MaintenanceService;

//@RunWith attaches a runner with the test class to initialize the test data
@RunWith(MockitoJUnitRunner.class)
public class MaintenanceServiceTest {
	
	//@InjectMocks annotation is used to create and inject the mock object
	@InjectMocks
	MaintenanceRequest request = new MaintenanceRequest();
	
	@Mock
	MaintenanceService maintenanceService;

	@Test
	public void testAddMaintenanceRequest() {
		request.setRequestID("");
		request.setDescription("Chair Broken");
		request.setRequestDate("2019/02/18");
		//when(maintenanceService.addMaintenanceRequest(request));
		//Assert.assertEquals(maintenanceService.addMaintenanceRequest(request),30.0,0);
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateRequest() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddMaintenanceOrder() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddMaintenanceSchedule() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddMaintenance() {
		fail("Not yet implemented");
	}

	@Test
	public void testMaintenanceCostForFacility() {
		fail("Not yet implemented");
	}

	@Test
	public void testListMaintenanceRequestIssuesRate() {
		fail("Not yet implemented");
	}

	@Test
	public void testMaintenanceDownTimeFacility() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMaintenance() {
		fail("Not yet implemented");
	}

	@Test
	public void testListMaintenanceRequestIssues() {
		fail("Not yet implemented");
	}

	@Test
	public void testListMintenanceRequests() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMaintenanceRequest() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMaintenanceOrder() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMaintenanceSchedule() {
		fail("Not yet implemented");
	}

}
