package com.hexaware.ems.dao;

import java.util.List;

import com.hexaware.ems.entity.Employee;

public interface IEmployeeDao {
	
	int addEmployee(Employee emp);

	int updateEmployee(Employee emp);

	int deleteEmployee(int eid);

	List<Employee> getAllEmployees();

}
