package com.example.demo.Employee;

import com.example.demo.Service.EmployeeRequest;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "E_name")
	private String name;

	@Column(name = "Salary")
	private long sal;

	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "FK_depid",
	referencedColumnName = "depId")
	private Department dep;

	public Department getDep() {
		return dep;
	}

	public void setDep(Department dep) {
		this.dep = dep;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSal() {
		return sal;
	}

	public void setSal(long sal) {
		this.sal = sal;
	}

}
