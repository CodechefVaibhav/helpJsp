package com.dao;

import java.util.List;

import vo.Employee;

import com.domain.User;

public interface UserDao {
public void saveUser ( User user );
public List<User> getUser();

}
