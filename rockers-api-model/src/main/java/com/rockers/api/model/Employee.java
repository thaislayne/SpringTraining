package com.rockers.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Employee extends BaseEntity{
	@Column(name ="name")
	private String name;
	
	@Column(name ="wipro_id")
	private Integer wipro_id;
	
	@Column(name ="mc_id")
	private String mcId;
	
	@Column(name ="email")
	private String email;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Team team;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;
}
