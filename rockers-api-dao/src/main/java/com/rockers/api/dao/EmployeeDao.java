package com.rockers.api.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import com.rockers.api.model.Employee;

@Component
public class EmployeeDao implements Crud<Employee>{

	@Override
	public Employee findOne(String name) {
		Employee emp = new Employee();
		emp.setNome(name);
		emp.setEmail("th387594@wipro.com");
		emp.setWiproId("th387594");	
		emp.setClientId("123");
		return emp;
	}

	@Override
	public String save(Employee t) {
		t.setClientId(t.getClientId());
		t.setEmail(t.getEmail());
		t.setNome(t.getNome());
		t.setWiproId(t.getWiproId());
		return t.getNome();
	}

	@Override
	public List<Employee> listAll() {
		Employee emp1 = new Employee();
		emp1.setNome("Thaislayne");
		emp1.setEmail("th387594@wipro.com");
		emp1.setWiproId("th387594");	
		emp1.setClientId("123");
		
		Employee emp2 = new Employee();
		emp2.setNome("Isabele");
		emp2.setEmail("Is387594@wipro.com");
		emp2.setWiproId("Is387594");	
		emp2.setClientId("123");
		
		List<Employee> listEmployee = new ArrayList<Employee>();
		
		listEmployee.add(emp1);
		listEmployee.add(emp2);
		
		return listEmployee;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}
}
