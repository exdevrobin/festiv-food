package org.hov.serviceimpl;

import java.util.List;

import org.hov.dao.UserDAO;
import org.hov.model.User;
import org.hov.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	UserDAO userDAO;  //UserDAOImpl Wired
	
	@Override
	public boolean addUser(User user) 
	{
		return userDAO.addUser(user);
	}
	
	@Override
	public boolean updateUser(User user) 
	{
		return userDAO.updateUser(user);
	}
	
	@Override
	public List<User> getAllUsers() 
	{
		return userDAO.getAllUsers();
	}
	
	@Override
	public User getUserById(int userId) 
	{
		return userDAO.getUserById(userId);
	}

	@Override
	public User getUserByEmail(String userEmail) 
	{
		return userDAO.getUserByEmail(userEmail);
	}

	@Override
	public boolean blockUserById(int userId) 
	{
		return userDAO.blockUserById(userId);
	}

	@Override
	public boolean unblockUserById(int userId) 
	{
		return userDAO.unblockUserById(userId);
	}

	@Override
	public boolean suspendUserById(int userId) 
	{
		return userDAO.suspendUserById(userId);
	}
}
