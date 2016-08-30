package com.sahil.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sahil.bean.Employee;
import com.sahil.dao.EmployeeDao;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	@RequestMapping("/first")
	public String newEmployee(ModelMap model){
		Employee employee=new Employee();
		model.addAttribute("employee", employee);
		return "insert";
	}
	
	@RequestMapping("/third/{id}")
	public ModelAndView delete(@PathVariable int id){  
		employeeDao.deleteEmployee(id); 
	    return new ModelAndView("redirect:/fourth");  
	}
	
	
	@RequestMapping("/fourth")  
    public ModelAndView viewemp(){  
        List<Employee> list=employeeDao.showEmployees();  
        return new ModelAndView("display","list",list);  
    } 
	
	@RequestMapping(value = "/insertEmployee", method = RequestMethod.POST)
	public String insertemployee(@Valid @ModelAttribute("employee")Employee employee, BindingResult result) {
		if(result.hasErrors()){
			return "insert";
		}
		else{
			int check=employeeDao.insertEmployee(employee);
			return (check>0)?"success":"fail";
		}	
	}
	
	@ModelAttribute("designations")
	public List<String> initializeDesignation(){
		List<String> designations=new ArrayList<String>();
		designations.add("Junior Associate");
		designations.add("Project Manager");
		designations.add("Team Leader");
		designations.add("Senior Manager");
		return designations;
	}
	
	@ModelAttribute("departments")
	public List<String> initializeDepartments(){
		List<String> departments=new ArrayList<String>();
		departments.add("IT");
		departments.add("Finance");
		departments.add("Marketing");
		departments.add("Sales");
		return departments;
	}
}
