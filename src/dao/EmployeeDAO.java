package dao;

import java.util.List;

import vo.Employee;
 
public interface EmployeeDAO 
{
    public void addEmployee(Employee employee);
    public void updateEmployee(Employee employee);
    public void deleteEmployee(Integer employeeId);
    public List<Employee> getEmployees();
    
}