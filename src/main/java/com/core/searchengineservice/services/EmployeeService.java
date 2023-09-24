package com.core.searchengineservice.services;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import com.core.searchengineservice.models.*;
import com.core.searchengineservice.repositories.*;

@Service
public class EmployeeService {
    @Autowired
     private EmployeeRepository repository;

	public void addEmployees() {
		List<EmployeeModel> employees = new ArrayList<>();
		employees.add(new EmployeeModel(373, "Basant", new String[] { "Bangalore", "BTM" }));
		employees.add(new EmployeeModel(908, "Santosh", new String[] { "Hyderbad", "XYZ" }));
		employees.add(new EmployeeModel(321, "Sagar", new String[] { "Pune", "PQR" }));
		repository.saveAll(employees);
	}

	public Iterable<EmployeeModel> getEmployees() {
		return repository.findAll();
	}

	public EmployeeModel getEmployeeByName( String name) {
		return repository.findByName(name);
	}
}
