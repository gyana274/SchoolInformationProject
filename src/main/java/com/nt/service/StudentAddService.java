package com.nt.service;

import org.springframework.stereotype.Service;

import com.nt.dao.StudentRepository;
import com.nt.model.Student;

@Service
public class StudentAddService {

	public String addData(Student st) {
		StudentRepository sr=new StudentRepository();
		return sr.add(st);
		
	}

}
