package com.spring.rest.SpringRest.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.SpringRest.Entity.Employee;
import com.spring.rest.SpringRest.Service.MyService;

@RestController
@RequestMapping("/practice")
public class MyController {

	private MyService myservice;
	
	public MyController(MyService myservice) {
		this.myservice = myservice;
	}


	@GetMapping("/")
	public String getThirdPartyAPIdetails() {
		return myservice.consumeApi();
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Employee> getEmployeeByID(@PathVariable int id) {
		return new ResponseEntity<>(myservice.getEmployeeId(id),HttpStatus.OK);
	}
}
