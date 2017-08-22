package com.rockers.api.service.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rockers.api.dao.EmployeeDao;
import com.rockers.api.model.Employee;

@RestController
@RequestMapping(value="/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeDao dao;
	
	@RequestMapping(method= RequestMethod.POST)
	public ResponseEntity<String> saveEmployee(@RequestBody Employee employee){
		String id = dao.save(employee);
		return new ResponseEntity<String>(id, HttpStatus.OK);
	}
	
	@RequestMapping(method= RequestMethod.GET, value="/{name}")
	public ResponseEntity<Employee> findOne(@PathVariable String name){
		Employee employee = dao.findOne(name);
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}
	
	@RequestMapping(method= RequestMethod.DELETE)
	public void Delete(@PathVariable String id){
		dao.delete(id);
	}
	
	@RequestMapping(method= RequestMethod.GET)
	public ResponseEntity<List<Employee>> listAll()  {
		List<Employee> employee = dao.listAll();
		return new ResponseEntity<List<Employee>>(employee, HttpStatus.OK);
	}
	
	@RequestMapping(method= RequestMethod.PUT)
	public ResponseEntity<String> updateEmployee(@RequestBody Employee employee){
		String id = dao.save(employee);
		return new ResponseEntity<String>(id, HttpStatus.OK);
	}
}
