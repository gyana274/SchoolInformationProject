package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home.htm")
	public String showHome() {
		
		return "home";
	}
	
	@RequestMapping("/contactus.htm")
	public String showContactus() {
		
		return "contact_us";
	}
	
	@RequestMapping("/aboutus.htm")
	public String showAboutus() {
		
		return "about_us";
	}
}
