package com.rockers.api.model;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;

@Data
public class Team {
	private String name;
	private Set<Employee> wiproTeam = new HashSet<Employee>();
}
