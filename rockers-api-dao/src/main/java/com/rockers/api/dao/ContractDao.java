package com.rockers.api.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import com.rockers.api.model.Contract;
import com.rockers.api.model.Employee;
import com.rockers.api.model.User;

@Component
public class ContractDao implements Crud<Contract> {

	@Override
	public Contract findOne(String id) {
		
		Employee emp = new Employee();
		emp.setEmail("th387594@wipro.com");
		emp.setNome("Thaislayne");
		emp.setWiproId("th387594");	
		
		User user = new User();
		user.setId("123");
		user.setWiproId("123");
		user.setPassword("123");
		user.setWiproEmail("Thaislayne@wipro.com");
		user.setEmployee(emp);

		Contract c = new Contract();
		c.setId(id);
		c.setProject("project");
		c.setUser(user);

		return c;
	}

	@Override
	public String save(Contract t) {
		t.setProject(t.getProject());
		t.setUser(t.getUser());
		return t.getProject();
	}

	@Override
	public List<Contract> listAll() {
		User user1 = new User();
		user1.setId("123");

		Contract c1 = new Contract();
		c1.setId("123");
		c1.setProject("project A");
		c1.setUser(user1);
		
		User user2 = new User();
		user2.setId("1234");

		Contract c2 = new Contract();
		c2.setId("1234");
		c2.setProject("project B");
		c2.setUser(user2);

		List<Contract> listContract = new ArrayList<Contract>();

		listContract.add(c1);
		listContract.add(c2);
		return listContract;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub

	}
}
