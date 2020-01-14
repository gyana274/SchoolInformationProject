package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.model.Faculty;
import com.nt.service.FacultyService;

@Controller
public class TeacherRegistration {
	
	@RequestMapping("/teacherregistration.htm")
	public String showStudentForm() {
		
		return "FacultyRegistration";
	}
	
	
	public String addFaculty(Faculty f) {
		FacultyService fs=new FacultyService();
		Faculty f1=new Faculty();
		f1.setFacultyid(f.getFacultyid());
		f1.setFacultyname(f.getFacultyname());
		f1.setSubjectname(f.getSubjectname());
		return fs.add(f);
	}
}
