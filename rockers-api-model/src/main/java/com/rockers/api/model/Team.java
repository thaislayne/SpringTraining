package com.rockers.api.model;


import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Team extends BaseEntity{
	@Column(name ="name", nullable =  false, unique = true)
	private String name;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Contract contract;
	
	@OneToMany(mappedBy = "team")
	private List<Employee> listEmployee;

}
