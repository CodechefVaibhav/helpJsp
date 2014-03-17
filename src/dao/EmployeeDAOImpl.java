package dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import vo.Employee;
 

public class EmployeeDAOImpl  extends HibernateDaoSupport implements EmployeeDAO {
 
	
	HibernateTemplate template;
 
    @Override
    public void addEmployee(Employee employee) {
    	getHibernateTemplate().save(employee);
    }
 
    @Override
    public void updateEmployee(Employee employee) {
    	getHibernateTemplate().update(employee);
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public List<Employee> getEmployees() {
    	List<Employee> empList =	getHibernateTemplate().find("from Employee");
    	return empList;
    }
 
    @Override
    public void deleteEmployee(Integer employeeId) {
        if (null != employeeId) {
            Employee employee = (Employee) getHibernateTemplate().load(Employee.class, employeeId);
            getHibernateTemplate().delete(employee);
        }
    }
}