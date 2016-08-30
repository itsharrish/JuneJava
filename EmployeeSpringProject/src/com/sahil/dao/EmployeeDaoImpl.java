package com.sahil.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.sahil.bean.Employee;
import com.sahil.mapper.EmployeeMapper;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	

	@Override
	public int insertEmployee(Employee emp) {
		String sql="INSERT INTO EMPLOYEE VALUES(?,?,?,?,?)";
		int res=0;
		res=jdbcTemplate.update(sql, new Object[]{emp.getE_id(),emp.getName(),emp.getDesig(),emp.getDeptt(),emp.getBasic()});
		return res;
	}

	@Override
	public List<Employee> showEmployees() {
		String sql="select * from Employee";
		List<Employee> ls=jdbcTemplate.query(sql, new EmployeeMapper());
		return ls;
	}
	
	@Override
	public int deleteEmployee(int e_id) {
		String sql="DELETE FROM EMPLOYEE WHERE e_id="+e_id+"";
		int res=jdbcTemplate.update(sql);
		return res;
	}

	@Override
	public int updateEmployee(int e_id) {
		// TODO Auto-generated method stub
		return 0;
	}
}
