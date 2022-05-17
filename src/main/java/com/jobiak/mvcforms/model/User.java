package com.jobiak.mvcforms.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//JPA-->is a standard and a specification for developing ORM frameworks
//ORM-->Object Relation Mapping
//bean,model,CommandObject,Entity

@Entity
@Table(name="userdata")
public class User 
{
	@Id    //Primary Key
	private Long userId;
	private String name;
	private String email;
	private Long mobile;
	
	public User()
	{
		
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

}
