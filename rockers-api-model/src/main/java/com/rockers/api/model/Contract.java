package com.rockers.api.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Contract extends BaseEntity{
	
	@Column (name = "name", nullable = false, unique = true)
	private String name;
	
	@OneToMany (mappedBy = "contract")
	private List<Team> listTeam;
	
}
