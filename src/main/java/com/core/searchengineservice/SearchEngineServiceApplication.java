package com.core.searchengineservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;

@SpringBootApplication
@ComponentScan
@EnableSolrRepositories("com.core.searchengineservice.EmployeeRepository")
public class SearchEngineServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchEngineServiceApplication.class, args);
	}
	
}
