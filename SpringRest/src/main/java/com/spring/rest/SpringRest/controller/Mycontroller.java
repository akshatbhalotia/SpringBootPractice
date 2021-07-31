package com.spring.rest.SpringRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.SpringRest.Model.Student;
import com.spring.rest.SpringRest.services.MyServices;
import com.spring.rest.SpringRest.services.MyServicesIMPL;

@RestController
@RequestMapping("/practice")
public class Mycontroller {
	
	@Autowired
	MyServices myServiceIMPL;
	
	// Initial method to PrintHello
	@GetMapping("/printHello")
	public String printHello() {
		return "My Hello World, GoodLuck :) ";
	}
	
	// Print all the Students  
	@GetMapping("/student")
	public List<Student> getStudents() {
		return this.myServiceIMPL.getStudentList();
	}
	
	// Print details of specific Student
	@GetMapping("/student/{studentID}")
	public Student getStudentDetails(@PathVariable long studentID) {
		return this.myServiceIMPL.getStudentByID(studentID);
	}
	
	// Add new Student in our List
	@PostMapping("/student")
	public Student addNewStudent(@RequestBody Student student) {
		return this.myServiceIMPL.addNewStudent(student);
	}
	
	// Update Student present 
	@PutMapping("/student")
	public Student updateStudent(@RequestBody Student student) {
		return this.myServiceIMPL.updateStudentDetails(student);
	}
	
	// Delete the Student   
	@DeleteMapping("student/{studentID}")
	public ResponseEntity<HttpStatus> deleteStudent(@PathVariable long studentID){
		try {
		this.myServiceIMPL.deleteStudent(studentID);
		return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
   }
