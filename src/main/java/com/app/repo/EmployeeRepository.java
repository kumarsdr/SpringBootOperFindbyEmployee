package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	
	
	/*
	 * List<Employee> findByEmpName(String empName);
	 * 
	 * List<Employee> findByEmpSalGreaterThanEqualOrderByEmpNameDesc(Double empSal);
	 * 
	 * List<Employee> findByEmpDeptIsNullEmpCodeIsNotNull(String empDept, String
	 * empempCode);
	 */
	 
	  List<Employee> findByEmpSalIn(List<Double> list);
	 

	
	

}
