package com.hexaware.ems.service;

import java.util.List;

import com.hexaware.ems.entity.Employee;

public interface IEmployeeService {

	int addEmployee(Employee emp);

	int updateEmployee(Employee emp);

	int deleteEmployee(int eid);

	List<Employee> getAllEmployees();

}
