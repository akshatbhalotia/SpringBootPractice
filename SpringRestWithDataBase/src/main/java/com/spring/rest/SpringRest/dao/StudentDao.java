package com.spring.rest.SpringRest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.rest.SpringRest.Model.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Long>{
	

}
