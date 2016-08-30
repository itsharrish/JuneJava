package com.sahil.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sahil.bean.Employee;

public class EmployeeMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
		Employee employee=new Employee();
		employee.setE_id(rs.getString("e_id"));
		employee.setName(rs.getString("name"));
		employee.setDesig(rs.getString("desig"));
		employee.setDeptt(rs.getString("deptt"));
		employee.setBasic(rs.getInt("basic"));
		return employee;
	}
}