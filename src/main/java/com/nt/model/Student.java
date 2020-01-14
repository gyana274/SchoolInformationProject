package com.nt.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Student {

	@Id
	int adno;
	String fname;
	String lname;
	String fathername;
	String mothername;
	String classname;
	int rollno;
	int section;
	String address;
	
	
}
