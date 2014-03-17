package service;

import java.util.List;

import vo.Employee;

public interface EmployeeService {
    public void addEmployee(Employee employee);
    public void updateEmployee(Employee employee);
    public List<Employee> getEmployees();
    public void deleteEmployee(Integer employeeId);
}