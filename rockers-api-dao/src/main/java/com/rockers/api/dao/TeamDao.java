package com.rockers.api.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.rockers.api.model.Team;


@Component
public class TeamDao  implements Crud<Team>{

	@Override
	public Team findOne(String name) {
		Team team = new Team();
		team.setName(name);
		return team;
	}

	@Override
	public String save(Team t) {
		t.setName(t.getName());
		return t.getName();
	}

	@Override
	public List<Team> listAll() {
		Team team1 = new Team();
		team1.setName("Thaislayne");
		
		Team team2 = new Team();
		team2.setName("Isabelle");
		
		List<Team> listTeam = new ArrayList<Team>();
		
		listTeam.add(team1);
		listTeam.add(team2);
		return listTeam;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

}
