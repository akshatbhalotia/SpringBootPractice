package com.spring.rest.SpringRest.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {

	@Id
	private long id;
	private String firstname;
	private String surname;
	private String city;
	private long phonenumber;
	
	public Student(long id, String firstname, String surname, String city, long phonenumber) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.surname = surname;
		this.city = city;
		this.phonenumber = phonenumber;
	}
	public Student() {
	}
//	public Student(String firstname, String surname, String city, long phonenumber) {
//		super();
//		this.firstname = firstname;
//		this.surname = surname;
//		this.city = city;
//		this.phonenumber = phonenumber;
//	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstname=" + firstname + ", surname=" + surname + ", city=" + city
				+ ", phonenumber=" + phonenumber + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
}
