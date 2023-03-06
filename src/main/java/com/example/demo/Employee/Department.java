package com.example.demo.Employee;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int depId;

	@Column(name = "dept_name")
	private String name;

	public int getDepId() {
		return depId;
	}

	public void setDepId(int depId) {
		this.depId = depId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Department() {}

	public Department(int depId, String name) {
		super();
		this.depId = depId;
		this.name = name;
	}
	
	
}