package com.service;

import java.util.List;

import vo.Employee;

import com.domain.User;

public interface UserService {
	public void addUser(User user);

	public List<User> getUser();
	
	 public List<Employee> getEmployees();
}
