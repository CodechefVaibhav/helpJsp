package service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import vo.Employee;
import dao.EmployeeDAO;


public class EmployeeServiceImpl implements EmployeeService {
 
 
    private EmployeeDAO employeeDAO;
	
	public EmployeeDAO getEmployeeDAO() {
		return employeeDAO;
	}

	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	
 
    @Override
    @Transactional
    public void addEmployee(Employee employee) {
        employeeDAO.addEmployee(employee);
    }
    
    @Override
    @Transactional
    public void updateEmployee(Employee employee) {
        employeeDAO.updateEmployee(employee);
    }
 
    @Override
    @Transactional
    public List<Employee> getEmployees() {
    	System.out.println("EmployeeServiceImpl getEmployees");
        return employeeDAO.getEmployees();
    }
 
    @Override
    @Transactional
    public void deleteEmployee(Integer employeeId) {
        employeeDAO.deleteEmployee(employeeId);
    } 
}