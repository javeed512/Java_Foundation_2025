package com.hexaware.ems.presentation;

import java.util.Scanner;

import com.hexaware.ems.entity.Employee;
import com.hexaware.ems.service.EmployeeServiceImp;
import com.hexaware.ems.service.IEmployeeService;

public class ClientUI {

	static Scanner sc = new Scanner(System.in);
	
	

	public static void main(String[] args) {
		
		IEmployeeService service =  new EmployeeServiceImp();

		boolean flag = true;

		while (flag) {

			System.out.println("1. ADD EMPLOYEE");
			System.out.println("2.  UPDATE EMPLOYEE");
			System.out.println("3.  DELETE EMPLOYEE BY EID");
			System.out.println("4. DISPLAY ALL EMPLOYEES");
			System.out.println("5. EXIT");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				
					Employee e1 =  readData();

					int count =	service.addEmployee(e1);
						
					System.out.println(count +" record inserted successfully...");
					
					
				break;
				
				
			case 5:
				
					flag = false;
					
					System.out.println("Thank you , Visit Again..");
				
				break;

			default:
				break;
			}

		}

	}

	public static Employee readData() { // insert , update purpose

		System.out.println("Enter Eid");

		int eid = sc.nextInt();
		
		sc.nextLine();

		System.out.println("Enter EName");

		String ename = sc.nextLine();
		System.out.println("Enter Salary");

		double salary = sc.nextDouble();
		
		Employee employee = new Employee();
			employee.setEid(eid);
			employee.setEname(ename);
			employee.setSalary(salary);
			
			return employee;

	}

}
