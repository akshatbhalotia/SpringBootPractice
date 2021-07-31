package com.spring.rest.SpringRest.Entity;

import java.util.List;
public class Employee {

	String status;
	List<com.spring.rest.SpringRest.Entity.Data> data;
	String message;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<com.spring.rest.SpringRest.Entity.Data> getData() {
		return data;
	}
	public void setData(List<com.spring.rest.SpringRest.Entity.Data> data) {
		this.data = data;
	}
	
}
