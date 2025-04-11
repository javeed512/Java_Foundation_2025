package com.hexaware.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.hexaware.ems.entity.Employee;

public class EmployeeDaoImp implements IEmployeeDao {

	@Override
	public int addEmployee(Employee emp) {

		int count = 0;

		try {
			Connection conn = DBUtil.getDBConnection();

			String insert = "insert into Emp values(?,?,?,current_date)";

			PreparedStatement pstmt = conn.prepareStatement(insert);

			pstmt.setInt(1, emp.getEid());
			pstmt.setString(2, emp.getEname());
			pstmt.setDouble(3, emp.getSalary());

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;
	}

	@Override
	public int updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteEmployee(int eid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

}
