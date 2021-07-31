package com.spring.rest.SpringRest.services;

import java.util.List;

import com.spring.rest.SpringRest.Model.Student;

public interface MyServices {

	public List<Student> getStudentList();
	
	public Student getStudentByID(long studentID);
	
	public Student addNewStudent(Student student);
	
	public Student updateStudentDetails(Student student);
	
	public void deleteStudent(long studentID);
}
