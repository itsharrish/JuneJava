package com.sahil.dao;

import java.util.List;

import com.sahil.bean.Employee;

public interface EmployeeDao {
	public int insertEmployee(Employee emp);
	public List<Employee> showEmployees();
	public int deleteEmployee(int e_id);
	public int updateEmployee(int e_id);
}
