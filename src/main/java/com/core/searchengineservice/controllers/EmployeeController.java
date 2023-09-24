package com.core.searchengineservice.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.core.searchengineservice.models.*;
import com.core.searchengineservice.repositories.*;
import com.core.searchengineservice.services.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
     private EmployeeService service;

	@PostConstruct
	public void addEmployees() {
		service.addEmployees();
	}

	@GetMapping("/getALL")
	public Iterable<EmployeeModel> getEmployees() {
		return service.getEmployees();
	}

	@GetMapping("/getEmployee/{name}")
	public EmployeeModel getEmployeeByName(@PathVariable String name) {
		return service.getEmployeeByName(name);
	}

}
