package com.app.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Employee;
import com.app.repo.EmployeeRepository;
@Component
public class ConsoleEmployeeRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repo;
	
	public void run(String... args) throws Exception {
		
		repo.save(new Employee(1,"A","RD",2.1,"RD01"));
		repo.save(new Employee(2,"B","QA",2.2,"QA02"));
		repo.save(new Employee(3,"C","DEV",2.3,"DE03"));
		repo.save(new Employee(4,"D","PRO",2.4,"PR04"));
		
		repo.save(new Employee(5,"E","FD",2.5,"FD05"));
		repo.save(new Employee(6,"F","MD",2.6,"MD06"));
		repo.save(new Employee(7,"G","AD",2.7,"AD07"));
		repo.save(new Employee(8,"H","HR",2.8,"HR08"));
		repo.save(new Employee(9,"I","WF",2.9,"WF09"));
		repo.save(new Employee(10,"j","RF",3.0,"RF10"));
		
		
		//Is
		//repo.findByEmpName("B").forEach(System.out::println);
		
		//Order
		//repo.findByEmpSalGreaterThanEqualOrderByEmpNameDesc(2.6).forEach(System.out::println);
		
		//IsNull,IsNotNull
		//repo.findByEmpDeptIsNullEmpCodeIsNotNull("DEV","DE03").forEach(System.out::println);
		
		//In
		//repo.findByEmpSalIn(Arrays.asList(2.2,2.8)).forEach(System.out::println);
		
		
		
		
	}

}
