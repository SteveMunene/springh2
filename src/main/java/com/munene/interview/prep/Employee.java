package com.munene.interview.prep;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
// lombok annotation to create all getters setters,equals,hash and toString mehtods based on fields

@Data
//JPa annotation to make the object ready for storage in JPA based data store

@Entity

class Employee {
	private @Id @GeneratedValue Long id;
	private String name;
	private String role;
	
	Employee(String name, String role){
		this.name = name;
		this.role = role;
	}
	
}
