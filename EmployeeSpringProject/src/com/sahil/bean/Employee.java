package com.sahil.bean;

import java.io.Serializable;

public class Employee implements Serializable{
	
	private String e_id;
	private String name;
	private String desig;
	private String deptt;
	private int basic;
	
	public Employee() {
		super();
	}
	
	public String getE_id() {
		return e_id;
	}
	
	public void setE_id(String e_id) {
		this.e_id = e_id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDesig() {
		return desig;
	}
	
	public void setDesig(String desig) {
		this.desig = desig;
	}
	
	public String getDeptt() {
		return deptt;
	}
	
	public void setDeptt(String deptt) {
		this.deptt = deptt;
	}
	
	public int getBasic() {
		return basic;
	}
	
	public void setBasic(int basic) {
		this.basic = basic;
	}

	@Override
	public String toString() {
		return "Employee [e_id=" + e_id + ", name=" + name + ", desig=" + desig + ", deptt=" + deptt + ", basic="
				+ basic + "]";
	}
}
