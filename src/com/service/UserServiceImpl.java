package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import vo.Employee;

import com.dao.UserDao;
import com.domain.User;

import dao.EmployeeDAO;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	EmployeeDAO employeeDAO;

	@Override
	public void addUser(User user) {
		userDao.saveUser(user);
	}

	@Override
	public List<User> getUser() {
		return userDao.getUser();
	}

	
	@Override
	public List<Employee> getEmployees() 
	{
		return employeeDAO.getEmployees();
	}
}
