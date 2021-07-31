package com.spring.rest.SpringRest.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.spring.rest.SpringRest.Entity.Employee;

@Service
public class MyService {
	
	private RestTemplate restTemplates;

	
	public String consumeApi() {
		restTemplates = new RestTemplate();
		return restTemplates.getForObject("https://dummy.restapiexample.com/api/v1/employees", String.class);
	}

// Not working with Entities ;(
	public Employee getEmployeeId(int id) {
		restTemplates = new RestTemplate();
		return restTemplates.getForObject("http://dummy.restapiexample.com/api/v1/employee/1", Employee.class);
	}
	
	

}
