package ir.com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Welcome {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String hello() {
		
		return "index";
	}
	
	@PostMapping("/sec/admin")
	public String postAdminPage() {
		
		return "admin";
	}
	
}
