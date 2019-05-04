package test.java;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.fms.model.facility.Room;
import com.fms.model.facility.service.FacilityService;
import com.fms.model.maintenance.MaintenanceRequest;
import com.fms.model.maintenance.service.MaintenanceService;
import com.fms.model.user.User;
import com.fms.model.user.service.UserService;

//@RunWith attaches a runner with the test class to initialize the test data
@RunWith(MockitoJUnitRunner.class)
public class MaintenanceServiceTest {
	
	//@InjectMocks annotation is used to create and inject the mock object
	@InjectMocks
	MaintenanceRequest request = new MaintenanceRequest();
	@InjectMocks
	User user = new User();
	@InjectMocks
	Room room = new Room();
	
	@Mock
	MaintenanceService maintenanceService;
	@Mock
	UserService userService;
	@Mock
	FacilityService facilityService;

	@Test
	public void testAddMaintenanceRequest() {
		user.setUserID("USR54888");
		user.setName("HHH");
		user.setAddress("1010 North Ave.");
		user.setPhoneNumber("3123123124");
		user.setTypeOfUser("Employee");
		userService.addUser(user);
		room = facilityService.getRoomByID("RM1009");
		request.setRequestID("MR12999");
		request.setDescription("Chair Broken");
		request.setRequestDate("2019/02/18");
		
		when(maintenanceService.addMaintenanceRequest(request, user, room)).thenReturn(request);
		Assert.assertEquals(maintenanceService.addMaintenanceRequest(request,user, room).getRequestID(),"MR12999",0);
		//fail("Not yet implemented");
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
