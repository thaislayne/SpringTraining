package com.rockers.api.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.rockers.api.model.Employee;
import com.rockers.api.model.User;

@Component
public class UserDao implements Crud<User>{

	
	@Override
	public User findOne(String id) {
		
		Employee emp = new Employee();
		emp.setEmail("th387594@wipro.com");
		emp.setNome("Thaislayne");
		emp.setWiproId("th387594");	
		
		
		User c = new User();
		c.setId(id);
		c.setWiproId("123");
		c.setPassword("123");
		c.setWiproEmail("Thaislayne@wipro.com");
		c.setEmployee(emp);
		return c;
	}

	@Override
	public String save(User t) {
		t.setId(t.getId());
		return t.getId();
	}

	@Override
	public List<User> listAll() {
		Employee emp = new Employee();
		emp.setEmail("th387594@wipro.com");
		emp.setNome("Thaislayne");
		emp.setWiproId("th387594");	
		
		
		User c = new User();
		c.setId("123");
		c.setWiproId("123");
		c.setPassword("123");
		c.setWiproEmail("Thaislayne@wipro.com");
		c.setEmployee(emp);
		
		Employee emp2 = new Employee();
		emp2.setEmail("th387594@wipro.com");
		emp2.setNome("Thaislayne");
		emp2.setWiproId("th387594");	
		
		
		User c2 = new User();
		c2.setId("123");
		c2.setWiproId("123");
		c2.setPassword("123");
		c2.setWiproEmail("Thaislayne@wipro.com");
		c2.setEmployee(emp);
		
		List<User> listUser = new ArrayList<User>();
		
		listUser.add(c);
		listUser.add(c2);
	
		return listUser;
	}

	@Override
	public void delete(String id) {
			
	}

}
