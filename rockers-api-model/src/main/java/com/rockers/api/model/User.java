package com.rockers.api.model;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;

@Data
public class User {
	private Employee employee;
	private String wiproId;
	private String wiproEmail;
	private String password;
	private String Id;
	private Set<Employee> employees = new HashSet<Employee>(); 
}
