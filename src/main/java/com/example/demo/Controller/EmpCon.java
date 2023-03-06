package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Employee.Department;
import com.example.demo.Employee.Employee;
import com.example.demo.Repo.Emprepo;
import com.example.demo.Repo.SalRepo;
import com.example.demo.Service.EmployeeRequest;


@RestController
public class EmpCon {
	@Autowired
	Emprepo er;
	@Autowired
	SalRepo sr;

//	@PostMapping("/add")
//	public Employee saveEmployee(@Validated @RequestBody EmployeeRequest eRequest) {
//		Department department = new Department();
//		department.setName(eRequest.getDep());
//		department = sr.save(department);
//		
//		Employee employee = new Employee(eRequest);
//		employee.setDep(department);
//		er.save(employee);
//		return employee;
//	}
	@GetMapping("/showemployee")
	public List<Employee> getEmployees(){
		return er.findAll();
	}

}