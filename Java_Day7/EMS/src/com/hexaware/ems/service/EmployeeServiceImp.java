package com.hexaware.ems.service;

import java.util.List;

import com.hexaware.ems.dao.EmployeeDaoImp;
import com.hexaware.ems.dao.IEmployeeDao;
import com.hexaware.ems.entity.Employee;

public class EmployeeServiceImp  implements IEmployeeService{
	
	 IEmployeeDao dao = new EmployeeDaoImp();

	@Override
	public int addEmployee(Employee emp) {
	
		return dao.addEmployee(emp);
	}

	@Override
	public int updateEmployee(Employee emp) {
		
		return  dao.updateEmployee(emp);
	}

	@Override
	public int deleteEmployee(int eid) {
	
		return dao.deleteEmployee(eid);
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return dao.getAllEmployees();
	}

}
