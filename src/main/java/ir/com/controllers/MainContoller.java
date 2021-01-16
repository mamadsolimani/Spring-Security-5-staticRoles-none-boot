package ir.com.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sec")
public class MainContoller {

	@GetMapping("/index")
	public String indexPage() {
		return "index";
	}

	@GetMapping("/user")
	public String userPage() {
		return "userPage";
	}
	
	@GetMapping("/admin")
	public String getAdminPage() {
		return "get adminPage";
	}

//	@GetMapping("/login")
//	public String login() {
//		return "login";
//	}

}
