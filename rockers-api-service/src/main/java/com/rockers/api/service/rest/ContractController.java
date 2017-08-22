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

import com.rockers.api.dao.ContractDao;
import com.rockers.api.model.Contract;

@RestController
@RequestMapping(value="/contract")
public class ContractController {

	@Autowired
	private ContractDao dao;
	
	
	@RequestMapping(method= RequestMethod.POST)
	public ResponseEntity<String> saveContract(@RequestBody Contract contract){
		String id = dao.save(contract);
		return new ResponseEntity<String>(id, HttpStatus.OK);
	}
	
	@RequestMapping(method= RequestMethod.GET, value="/{id}")
	public ResponseEntity<Contract> findOne(@PathVariable String id){
		Contract contract = dao.findOne(id);
		return new ResponseEntity<Contract>(contract, HttpStatus.OK);
	}
	
	@RequestMapping(method= RequestMethod.DELETE)
	public void Delete(@PathVariable String id){
		dao.delete(id);
	}
	
	@RequestMapping(method= RequestMethod.GET)
	public ResponseEntity<List<Contract>> listAll()  {
		List<Contract> contract = dao.listAll();
		return new ResponseEntity<List<Contract>>(contract, HttpStatus.OK);
	}
	
	@RequestMapping(method= RequestMethod.PUT)
	public ResponseEntity<String> updateContract(@RequestBody Contract contract){
		String id = dao.save(contract);
		return new ResponseEntity<String>(id, HttpStatus.OK);
	}
}
