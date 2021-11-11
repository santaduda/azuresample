package com.alpha;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/")
public class HomeController {
	

	@GetMapping("/index")
	public String index() {
	return "welcome to Index API";	
	}
	@GetMapping("/home")
	public String home() {
	return "welcome to Home API";	
	}
	
	@GetMapping("/hello")
	public String hello() {
	return "This is Hello API";	
	}
	
	@GetMapping("/alpha")
	public String alpha() {
	return "This is Alpha API";	
	}


}
