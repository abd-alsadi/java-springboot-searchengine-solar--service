package com.core.searchengineservice.repositories;

import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

import com.core.searchengineservice.models.*;

public interface EmployeeRepository extends SolrCrudRepository<EmployeeModel, Integer>{

	EmployeeModel findByName(String name);

}
