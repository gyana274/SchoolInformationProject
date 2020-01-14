package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.model.Student;
import com.nt.service.StudentAddService;

@Controller
public class StudentRegistrationController {

	@RequestMapping("/studentadmission.htm")
	public String showStudentForm() {
		
		return "StudentRegistration";
	}
	//@RequestMapping("/submit.htm")
	public String submitData(Student st) {
		StudentAddService service=new StudentAddService();
		Student s=new Student();
		s.setAdno(st.getAdno());
		s.setFname(st.getFname());
		s.setLname(st.getLname());
		s.setFathername(st.getFathername());
		s.setMothername(st.getMothername());
		s.setClassname(st.getClassname());
		s.setRollno(st.getRollno());
		s.setSection(st.getSection());
		s.setAddress(st.getAddress());
		return service.addData(s);
	}
}
