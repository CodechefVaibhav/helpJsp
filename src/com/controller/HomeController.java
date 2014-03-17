package com.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import service.EmployeeService;
import service.EmployeeServiceImpl;
import vo.Employee;

import com.domain.User;
import com.service.UserService;

@Controller
public class HomeController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/register")
	public ModelAndView getRegisterForm(@ModelAttribute("user") User user,
			BindingResult result) {
		ArrayList<String> gender = new ArrayList<String>();
		gender.add("Male");
		gender.add("Female");
		ArrayList<String> city = new ArrayList<String>();
		city.add("Delhi");
		city.add("Kolkata");
		city.add("Chennai");
		city.add("Bangalore");
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("gender", gender);
		model.put("city", city);
		System.out.println("Register Form");
		return new ModelAndView("Register", "model", model);
	}

	@RequestMapping("/saveUser")
	public ModelAndView saveUserData(@ModelAttribute("user") User user,
			BindingResult result) {
		userService.addUser(user);
		System.out.println("Save User Data");
		return new ModelAndView("redirect:/userList.html");
	}

	@RequestMapping("/userList")
	public ModelAndView getUserList() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("user", userService.getUser());
//		model.put("Empuser", userService.getEmployees());
		List<Employee> empList=employeeService.getEmployees();
		System.out.println("empoooo-===================="+empList.size());
		model.put("Empuser",  employeeService.getEmployees());
		
		return new ModelAndView("UserDetails", model);

	}
}
