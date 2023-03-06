package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Employee.Department;


public interface SalRepo extends JpaRepository<Department,Integer> {

}
