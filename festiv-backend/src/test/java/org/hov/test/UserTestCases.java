package org.hov.test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.hov.config.AppConfig;
import org.hov.model.User;
import org.hov.service.UserService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=AppConfig.class)
public class UserTestCases 
{
	@Autowired
	UserService userService;
	
/*  CREATION TEST CASES  */
	
	@Test
	@Ignore
	public void addUserValid1()	//Valid Record
	{
		User user = new User();
		user.setFirstName("Tester123");
		user.setLastName("123");
		user.setUserEmail("testing@foodieff.com");
		user.setUserPassword("Test@123");
		user.setTeamId(0);
		user.setAuthority("BUYER");
		user.setBlocked(false);

		assertEquals(true , userService.addUser(user));
	}
	
	/*
	 * @Test
	 * 
	 * @Ignore public void addUserInvalid1() //Invalid Record { User user = new
	 * User(); user.setFirstName("Tester123"); user.setLastName("123");
	 * user.setUserEmail("testing@foodieff.com"); user.setUserPassword("Test@123");
	 * user.setTeamId(0); user.setAuthority("BUYER"); user.setBlocked(false);
	 * 
	 * assertEquals(true , userService.addUser(user)); }
	 */
	

/*  RETRIEVE TEST CASES  */
	
	@Test
	//@Ignore
	public void displayAllUserListValid()
	{
		List<User> userlist = userService.getAllUsers();
		for(User u:userlist)
		{
			System.out.println("--------------------------");
			System.out.println(u.getUserId());
			System.out.println(u.getFirstName());
			System.out.println(u.getLastName());
			System.out.println(u.getUserEmail());
			System.out.println(u.getUserPassword());
			System.out.println(u.getAuthority());
			System.out.println(u.getVerificationCode());
			System.out.println(u.isVerified());
			System.out.println(u.isBlocked());
			System.out.println(u.isSuspended());
			System.out.println("");
		}
		assertNotNull(userlist);
	}

	@Test
	@Ignore
	public void displayUserbyIdValid1()	//User 5
	{
		User u = userService.getUserById(5);

		System.out.println("--------------------------");
		System.out.println(u.getUserId());
		System.out.println(u.getFirstName());
		System.out.println(u.getLastName());
		System.out.println(u.getUserEmail());
		System.out.println(u.getUserPassword());
		System.out.println(u.getAuthority());
		System.out.println(u.getVerificationCode());
		System.out.println(u.isVerified());
		System.out.println(u.isBlocked());
		System.out.println(u.isSuspended());
		System.out.println("");
		
		assertNotNull(u);
	}
	
	@Test
	@Ignore
	public void displayUserbyIdInvalid1()	//User -999
	{
		assertNull(userService.getUserById(-1));
	}
	

	@Test
	@Ignore
	public void displayUserbyEmailValid1()	//Valid Email
	{
		User u = userService.getUserByEmail("user123@foodie.com");

		System.out.println("--------------------------");
		System.out.println(u.getUserId());
		System.out.println(u.getFirstName());
		System.out.println(u.getLastName());
		System.out.println(u.getUserEmail());
		System.out.println(u.getUserPassword());
		System.out.println(u.getAuthority());
		System.out.println(u.getVerificationCode());
		System.out.println(u.isVerified());
		System.out.println(u.isBlocked());
		System.out.println(u.isSuspended());
		System.out.println("");
		
		assertNotNull(u);
	}
	

	@Test
	@Ignore
	public void displayUserbyEmailInvalid1()	//Invalid Email
	{	
		assertNull(userService.getUserByEmail("x323535xxy3434y5454yzzz@foodie.com"));
	}

/*  UPDATION TEST CASES  */
	
	@Test
	@Ignore
	public void updateUserValid1()	// Update User Id 11
	{
		User u = userService.getUserById(11);
		
		u.setFirstName("Updated UserName1");
		
		assertEquals(true, userService.updateUser(u));
	}
	

/*  SUB-UPDATION TEST CASES  */

	@Test
	@Ignore
	public void blockUserValid()	// Id = 5
	{
		assertEquals(true, userService.blockUserById(5));
	}
	

	@Test
	@Ignore
	public void unblockUserValid()	// Id = 5
	{
		assertEquals(true, userService.unblockUserById(5));
	}
	

	@Test
	@Ignore
	public void suspendUserValid()	// Id = 5
	{
		assertEquals(true, userService.suspendUserById(5));
	}
}
