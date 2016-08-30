package com.sahil.dao;

import java.util.List;

import com.sahil.bean.Employee;

public interface EmployeeDao {
	public int insertEmployee(Employee emp);			//Third from pull
	public List<Employee> showEmployees();
	public int deleteEmployee(int e_id);   				// adding comment for master branch
	public int updateEmployee(int e_id);				// Second from pull trial
}
