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

import com.rockers.api.dao.TeamDao;
import com.rockers.api.model.Team;

@RestController
@RequestMapping(value="/team")
public class TeamController {

	@Autowired
	private TeamDao dao;
	
	@RequestMapping(method= RequestMethod.POST)
	public ResponseEntity<String> saveTeam(@RequestBody Team team){
		String name = dao.save(team);
		return new ResponseEntity<String>(name, HttpStatus.OK);
	}
	
	@RequestMapping(method= RequestMethod.GET, value="/{name}")
	public ResponseEntity<Team> findOne(@PathVariable String name){
		Team team = dao.findOne(name);
		return new ResponseEntity<Team>(team, HttpStatus.OK);
	}
	
	@RequestMapping(method= RequestMethod.DELETE)
	public void Delete(@PathVariable String id){
		dao.delete(id);
	}
	
	@RequestMapping(method= RequestMethod.GET)
	public ResponseEntity<List<Team>> listAll()  {
		List<Team> team = dao.listAll();
		return new ResponseEntity<List<Team>>(team, HttpStatus.OK);
	}
	
	@RequestMapping(method= RequestMethod.PUT)
	public ResponseEntity<String> updateTeam(@RequestBody Team team){
		String id = dao.save(team);
		return new ResponseEntity<String>(id, HttpStatus.OK);
	}
}
