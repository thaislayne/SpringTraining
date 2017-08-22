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

import com.rockers.api.dao.UserDao;
import com.rockers.api.model.User;

@RestController
@RequestMapping(value="/user")
public class UserController {

	@Autowired
	private UserDao dao;
	
	@RequestMapping(method= RequestMethod.POST)
	public ResponseEntity<String> saveUser(@RequestBody User user){
		String id = dao.save(user);
		return new ResponseEntity<String>(id, HttpStatus.OK);
	}
	
	@RequestMapping(method= RequestMethod.GET, value="/{id}")
	public ResponseEntity<User> findOne(@PathVariable String id){
		User user = dao.findOne(id);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
	@RequestMapping(method= RequestMethod.DELETE)
	public void Delete(@PathVariable String id){
		dao.delete(id);
	}
	
	@RequestMapping(method= RequestMethod.GET)
	public ResponseEntity<List<User>> listAll()  {
		List<User> user = dao.listAll();
		return new ResponseEntity<List<User>>(user, HttpStatus.OK);
	}
	
	@RequestMapping(method= RequestMethod.PUT)
	public ResponseEntity<String> updateUser(@RequestBody User user){
		String id = dao.save(user);
		return new ResponseEntity<String>(id, HttpStatus.OK);
	}
	
}
