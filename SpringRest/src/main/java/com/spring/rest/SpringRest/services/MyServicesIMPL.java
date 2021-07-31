package com.spring.rest.SpringRest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.spring.rest.SpringRest.Model.Student;

@Service
public class MyServicesIMPL implements MyServices{

	List<Student> myStudentsList;
	
	public MyServicesIMPL() {
		
		myStudentsList = new ArrayList<>();
		myStudentsList.add(new Student(1, "yoyo Honey", "Singh", "Mumbai", 700191121));
		myStudentsList.add(new Student(2, "Milka", "Singh", "Punjab", 212391121));
		myStudentsList.add(new Student(3, "Vishal", "Mishra", "Ahemdabad", 998212111));
		myStudentsList.add(new Student(4, "Shan", "Polu", "Raniganj", 191214321));
	}



	// This method returns list of Students 
	@Override
	public List<Student> getStudentList() {
		return myStudentsList;
	}


	@Override
	public Student getStudentByID(long studentId) {
		Student stu = null;
		Optional<Student> option = myStudentsList.stream().filter(eachStudent -> eachStudent.getId() == studentId).findFirst();
		if(option.isPresent()) {
			stu=  (Student) option.get();
		}
			
		return stu;
	}



	@Override
	public Student addNewStudent(Student student) {
			this.myStudentsList.add(student);
		return student;
	}



	@Override
	public Student updateStudentDetails(Student student) {
		myStudentsList.stream().filter(eachStudent -> eachStudent.getId() == student.getId()).forEach(eachStudent ->{
			eachStudent.setFirstname(student.getFirstname());
			eachStudent.setCity(student.getCity());
			eachStudent.setSurname(student.getSurname());
			eachStudent.setPhonenumber(student.getPhonenumber());
		});
		return student;
	}



	@Override
	public void deleteStudent(long studentID) {
		myStudentsList = this.myStudentsList.stream().filter(eachStudent -> eachStudent.getId() != studentID).collect(Collectors.toList());
		
	}

}
