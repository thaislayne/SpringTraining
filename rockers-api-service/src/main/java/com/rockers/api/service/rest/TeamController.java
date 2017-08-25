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

import com.rockers.api.model.Team;
import com.rockers.api.repository.TeamRepository;

@RestController
@RequestMapping(value="/team")
public class TeamController {

	@Autowired
	private TeamRepository teamRepository;
	
	@RequestMapping(method= RequestMethod.POST)
	public ResponseEntity<Long> saveTeam(@RequestBody Team team){
		teamRepository.save(team);
		return new ResponseEntity<Long>(team.getId(), HttpStatus.OK);
	}
	
	@RequestMapping(method= RequestMethod.GET, value="/{name}")
	public ResponseEntity<Team> findOne(@PathVariable Long name){
		Team team = teamRepository.findOne(name);
		return new ResponseEntity<Team>(team, HttpStatus.OK);
	}
	
	@RequestMapping(method= RequestMethod.DELETE)
	public void Delete(@PathVariable Long id){
		teamRepository.delete(id);
	}
	
	@RequestMapping(method= RequestMethod.GET)
	public ResponseEntity<List<Team>> listAll()  {
		List<Team> team = teamRepository.findAll();
		return new ResponseEntity<List<Team>>(team, HttpStatus.OK);
	}
	
	@RequestMapping(method= RequestMethod.PUT)
	public ResponseEntity<Long> updateTeam(@RequestBody Team team){
		teamRepository.save(team);
		return new ResponseEntity<Long>(team.getId(), HttpStatus.OK);
	}
}
