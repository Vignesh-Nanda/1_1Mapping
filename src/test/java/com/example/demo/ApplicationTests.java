package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.Employee.Department;
import com.example.demo.Employee.Employee;
import com.example.demo.Repo.Emprepo;

@SpringBootTest
class ApplicationTests {
	
	@Autowired
	private Emprepo repo;

	@Test
	void contextLoads() {
		
		Department dep = new Department();
		dep.setName("CSE");
		
		Employee emp = new Employee();
		emp.setName("YAshu");
		emp.setSal(1200000L);
		emp.setDep(dep);
		
		repo.save(emp);
	}

}
