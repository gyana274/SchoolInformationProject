package com.nt.service;

import org.springframework.stereotype.Service;

import com.nt.dao.FacultyRepository;
import com.nt.model.Faculty;

@Service
public class FacultyService {

	FacultyRepository fr=new FacultyRepository();
	
	public String add(Faculty f) {
		return fr.addData(f);
	}
}
